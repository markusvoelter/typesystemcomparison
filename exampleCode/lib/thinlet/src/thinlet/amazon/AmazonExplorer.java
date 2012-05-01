package thinlet.amazon;

import java.applet.*;
import java.awt.*;
import java.io.*;
import java.net.*;

import thinlet.*;

public class AmazonExplorer extends Thinlet {

	private static final String[] MODES = {
		"baby", "books", "classical", "dvd", "electronics", "garden", "kitchen", "magazines",
		"music", "pc-hardware", "photo", "software", "toys", "universal", "vhs", "videogames" };
	private static final String[] BOOKS = {
		"+pmrank", "+salesrank", "+reviewrank", "+pricerank", "+inverse-pricerank",
		"+daterank", "+titlerank", "-titlerank" };
	private static final String[] CLASSICAL_MUSIC = {
		"+psrank", "+salesrank", "+artistrank", "+orig-rel-date", "+titlerank" };
	private static final String[] DVD = {
		"+salesrank", "+titlerank" };
	private static final String[] ELECTRONICS = {
		"+pmrank", "+salesrank", "+titlerank", "+reviewrank" };
	private static final String[] GARDEN_TOOL = {
		"+psrank", "+salesrank", "+titlerank", "-titlerank",
		"+manufactrank", "-manufactrank", "+price", "-price" };
	private static final String[] KITCHEN = {
		"+pmrank", "+salesrank", "+titlerank", "-titlerank",
		"+manufactrank", "-manufactrank", "+price", "-price" };
	private static final String[] HARDWARE = {
		"+psrank", "+salesrank", "+titlerank", "-titlerank" };
	private static final String[] PHOTO = {
		"+pmrank", "+salesrank", "+titlerank", "-titlerank" };
	private static final String[] SOFTWARE = {
		"+pmrank", "+salesrank", "+titlerank", "+price", "-price" };
	private static final String[] VHS = {
		"+psrank", "+salesrank", "+titlerank" };
	private static final String[] VIDEOGAMES = {
		"+pmrank", "+salesrank", "+titlerank", "+price", "-price" };
	private static final String[] SORTS = { "Featured Items", "+pmrank",
		"Bestselling", "+salesrank", "Average Customer Review", "+reviewrank",
		"Price (Low to High)", "+pricerank", "Price (High to Low)", "+inverse-pricerank",
		"Publication Date", "+daterank", "Alphabetical (A-Z)", "+titlerank",
		"Alphabetical (Z-A)", "-titlerank", "Featured Items", "+psrank",
		"Artist Name", "+artistrank", "Original Release Date", "+orig-rel-date",
		"Alphabetical", "+titlerank", "Review", "+reviewrank",
		"Manufacturer (A-Z)", "+manufactrank", "Manufacturer (Z-A)", "-manufactrank",
		"Price (Low to High)", "+price", "Price (High to Low)", "-price" };
		
	public AmazonExplorer() {
		setFont(new Font("SansSerif", Font.PLAIN, 11));
		try {
			add(parse("explorer.xml"));
			selectMode(1, find("searchby"), find("keyword"), find("sort"));
		} catch (Exception exc) { exc.printStackTrace(); }
	}
	
	public void selectMode(int selected, Object searchby, Object keyword, Object sort) {
		String mode = MODES[selected];
		removeAll(searchby);
		addChoice(searchby, "Keyword");
		if ((mode == "music") || (mode == "classical")) {
			addChoice(searchby, "Artist");
		}
		else if (mode == "books") {
			addChoice(searchby, "Author");
		}
		else if ((mode == "dvd") || (mode == "vhs") || (mode == "video")) {
			addChoice(searchby, "Actor");
			addChoice(searchby, "Director");
		}
		else if ((mode == "electronics") || (mode == "kitchen") || (mode == "videogames") ||
				(mode == "software") || (mode == "photo") || (mode == "pc-hardware")) {
			addChoice(searchby, "Manufacturer");
		}
		setInteger(searchby, "selected", 0);
		
		removeAll(sort);
		String[] sorts = getSort(mode);
		if (sorts != null) {
			for (int i = 0; i < sorts.length; i++) {
				for (int j = 0; j < SORTS.length; j += 2) {
					if (SORTS[j + 1] == sorts[i]) {
						Object choice = create("choice");
						setString(choice, "text", SORTS[j]);
						add(sort, choice);
						break;
					}
				}
			}
		}
		setInteger(sort, "selected", -1);
		setString(sort, "text", null);
		setBoolean(sort, "enabled", sorts != null);
	}
	
	private void addChoice(Object combobox, String text) {
		Object choice = create("choice");
		setString(choice, "text", text);
		add(combobox, choice);
	}
	
	private static final String[] getSort(String mode) {
		if (mode == "books") { return BOOKS; }
		if ((mode == "classical") || (mode == "music")) { return CLASSICAL_MUSIC; }
		if (mode == "dvd") { return DVD; }
		if (mode == "electronics") { return ELECTRONICS; }
		if ((mode == "garden") || (mode == "universal")) { return GARDEN_TOOL; }
		if (mode == "kitchen") { return KITCHEN; }
		if (mode == "pc-hardware") { return HARDWARE; }
		if (mode == "photo") { return PHOTO; }
		if (mode == "software") { return SOFTWARE; }
		if (mode == "vhs") { return VHS; }
		if (mode == "videogames") { return VIDEOGAMES; }
		//	if ((mode == "baby") || (mode == "magazines") || (mode == "toys")) {
		return null;
	}
	
	public void find(int mode, String searchby, Object keyfield, String keyword, int sort) {
		String searchstring = searchby + "Search=" + convert(keyword) +
			"&mode=" + MODES[mode] + "&type=lite" +
			((sort == -1) ? "" : ("&sort=" + getSort(MODES[mode])[sort]));
			
		// add the new keyword to the list
		boolean cacheditem = false; int n = getCount(keyfield);
		if (keyword.length() > 0) {
			for (int i = n - 1; i >= 0; i--) {
				String choicetext = getString(getItem(keyfield, i), "text");
				if (keyword.equals(choicetext)) { cacheditem = true; break; }
			}
			if (!cacheditem) {
				Object choice = create("choice");
				setString(choice, "text", keyword);
				add(keyfield, choice);
				if (n > 8) { remove(getItem(keyfield, 0)); }
			}
		}
			
		Object nProductInfo = getResponse(searchstring + "&page=1");
		if (!isErrorMessage(nProductInfo)) {
			try {
				Object result = parse("result.xml");
				Object nextresult = find(result, "nextresult");
				putProperty(nextresult, "SearchString", searchstring);
				loadList(nProductInfo, 1, find(result, "resultlist"), find(result, "total"), nextresult);
				addPage(result);
			} catch (Exception exc) { exc.printStackTrace(); }
		}
	}
	
	public void resultSelected(Object resultlist, Object detailsbutton) {
		setBoolean(detailsbutton, "enabled", getSelectedIndex(resultlist) != -1);
	}
	
	public void findNext(Object nextresult, Object total, Object resultlist) {
		String searchstring = (String) getProperty(nextresult, "SearchString");
		int page = ((Integer) getProperty(nextresult, "SearchPage")).intValue() + 1;
		
		Object nProductInfo = getResponse(searchstring + "&page=" + page);
		if (!isErrorMessage(nProductInfo)) {
			loadList(nProductInfo, page, resultlist, total, nextresult);
		}
	}
	
	private void loadList(Object nProductInfo, int page, Object resultlist, Object total, Object nextresult) {
		loadDetailsList(nProductInfo, resultlist);
		
		String sTotalResults = getDOMText(nProductInfo, "TotalResults");
		setString(total, "text", sTotalResults);
		
		putProperty(nextresult, "SearchPage", new Integer(page));
		setBoolean(nextresult, "enabled", Integer.parseInt(sTotalResults) > getCount(resultlist));
	}
	
	private void loadDetailsList(Object nProductInfo, Object resultlist) {
		int n = getDOMCount(nProductInfo, "Details");
		for (int i = 0; i < n; i++) {
			Object nDetails = getDOMNode(nProductInfo, "Details", i);
			Object item = create("item");
			setString(item, "text", getDOMText(nDetails, "ProductName"));
			putProperty(item, "Details", nDetails);
			add(resultlist, item);
		}
	}
	
	public void showDetails(Object resultlist) {
		Object item = getSelectedItem(resultlist);
		Object nDetails = getProperty(item, "Details");
		
		try {
			Object details = parse("details.xml");
			putProperty(details, "Asin", getDOMText(nDetails, "Asin"));
			
			//Info
			Object productname = find(details, "productname");
			setString(productname, "text", getDOMText(nDetails, "ProductName"));
			//setIcon(productname, "icon", loadIcon(getDOMText(nDetails, "ImageUrlSmall")));
			
			Object infoproperties = find(details, "infoproperties");
			addLabel(infoproperties, "Name:", nDetails, "ProductName");
			addLabel(infoproperties, "Catalog:", nDetails, "Catalog");
			addList(infoproperties, "Artist:", nDetails, "Artists", "Artist");
			addList(infoproperties, "Author:", nDetails, "Authors", "Author");
			addLabel(infoproperties, "Released:", nDetails, "ReleaseDate");
			addLabel(infoproperties, "Manufacturer:", nDetails, "Manufacturer");
			addLabel(infoproperties, "List price:", nDetails, "ListPrice");
			addLabel(infoproperties, "Our price:", nDetails, "OurPrice");
			addLabel(infoproperties, "Used price:", nDetails, "UsedPrice");
				
			addPage(details);
		} catch (Exception exc) { exc.printStackTrace(); }
	}
	
	public void checkDetails(Object details, int selectedtab) {
		if (selectedtab == 0) { return; } // first tab contains lite information
		String sAsin = (String) getProperty(details, "Asin");
		if (sAsin != null) {
			String searchstring = "AsinSearch=" + sAsin + "&type=heavy";
			Object nProductInfo = getResponse(searchstring);
			if (!isErrorMessage(nProductInfo)) {
				Object nDetails = getDOMNode(nProductInfo, "Details", 0);
				if (nDetails == null) { return; } //never
				putProperty(details, "Asin", null);
				
				//More
				Object moreproperties = find(details, "moreproperties");
				addList(moreproperties, "Starring:", nDetails, "Starring", "Actor");
				addList(moreproperties, "Director:", nDetails, "Directors", "Director");
				addLabel(moreproperties, "Theatrical date:", nDetails, "TheatricalReleaseDate");
				addLabel(moreproperties, "Refurbished:", nDetails, "RefurbishedPrice");
				addLabel(moreproperties, "Collectible:", nDetails, "CollectiblePrice");
				addLabel(moreproperties, "Third-party:", nDetails, "ThirdPartyNewPrice");
				addLabel(moreproperties, "Sales rank:", nDetails, "SalesRank");
				addLabel(moreproperties, "Media:", nDetails, "Media");
				addLabel(moreproperties, "Number:", nDetails, "NumMedia");
				addLabel(moreproperties, "Mpaa rating:", nDetails, "MpaaRating");
				addLabel(moreproperties, "Availability:", nDetails, "Availability");
				
				//Review
				Object nReviews = getDOMNode(nDetails, "Reviews", 0);
				if (nReviews != null) {
					Object reviewpanel = find(details, "reviewpanel");
					String sAvgCustomerRating = getDOMText(nReviews, "AvgCustomerRating");
					Object avgrating = find(reviewpanel, "avgrating");
					setInteger(avgrating, "value", getNumber(sAvgCustomerRating));
					setString(avgrating, "tooltip", sAvgCustomerRating);
					
					loadReview(reviewpanel, nReviews, 0);
					putProperty(reviewpanel, "Reviews", nReviews);
				}
				
				//Detail
				Object detailpanel = find(details, "detailpanel");
				loadList(getDOMNode(nDetails, "Platforms", 0), "Platform",
					detailpanel, "platformtitle", "platformlist");
				loadList(getDOMNode(nDetails, "Features", 0), "Feature",
					detailpanel, "featuretitle", "featurelist");
					
				//Link
				Object linkpanel = find(details, "linkpanel");
				loadLink(find(linkpanel, "accessories"), nDetails, "Accessories");
				loadLink(find(linkpanel, "similars"), nDetails, "SimilarProducts");
				loadLink(find(linkpanel, "wishlists"), nDetails, "Lists");
				putProperty(find(linkpanel, "marketsearch"), "Asin", sAsin);
					
				Object nBrowseList = getDOMNode(nDetails, "BrowseList", 0);
				if (nBrowseList != null) {
					int n = getDOMCount(nBrowseList, "BrowseNode");
					Object browselist = find(linkpanel, "browselist");
					for (int i = 0; i < n; i++) {
						Object nBrowseNode = getDOMNode(nBrowseList, "BrowseNode", i);
						Object browseitem = create("item");
						setString(browseitem, "text", getDOMText(getDOMNode(nBrowseNode, "BrowseName", 0)));
						add(browselist, browseitem);
					}
				}
			}
		}
	}
	
	private void loadLink(Object button, Object nDetails, String listname) {
		Object list = getDOMNode(nDetails, listname, 0);
		setBoolean(button, "enabled", (list != null));
		if (list != null) {
			putProperty(button, listname, list);
		}
	}
	
	public void previousReview(Object reviewpanel) {
		int i = ((Integer) getProperty(reviewpanel, "ReviewIndex")).intValue();
		loadReview(reviewpanel, getProperty(reviewpanel, "Reviews"), i - 1);
	}
	
	public void nextReview(Object reviewpanel) {
		int i = ((Integer) getProperty(reviewpanel, "ReviewIndex")).intValue();
		loadReview(reviewpanel, getProperty(reviewpanel, "Reviews"), i + 1);
	}
	
	private void loadReview(Object reviewpanel, Object nReviews, int i) {
		int n = getDOMCount(nReviews, "CustomerReview");
		if ((i >= 0) && (i < n)) {
			setBoolean(find(reviewpanel, "prevreview"), "enabled", i > 0);
			setBoolean(find(reviewpanel, "nextreview"), "enabled", i < n - 1);
			
			putProperty(reviewpanel, "ReviewIndex", new Integer(i));
		
			Object nCustomerReview = getDOMNode(nReviews, "CustomerReview", i);
			String sRating = getDOMText(nCustomerReview, "Rating");
			Object rating = find(reviewpanel, "rating");
			setInteger(rating, "value", getNumber(sRating));
			setString(rating, "tooltip", sRating);
			
			setString(find(reviewpanel, "summary"), "text", getDOMText(nCustomerReview, "Summary"));
			setString(find(reviewpanel, "comment"), "text",
				convertHTML(getDOMText(nCustomerReview, "Comment")));
		}
	}
	
	private void loadList(Object root, String nodename, Object panel, String titlename, String listname) {
		Object list = find(panel, listname);
		if (root != null) {
			int n = getDOMCount(root, nodename);
			for (int i = 0; i < n; i++) {
				Object item = create("item");
				setString(item, "text", getDOMText(getDOMNode(root, nodename, i)));
				add(list, item);
			}
		}
		else {
			Object title = find(panel, titlename);
			setBoolean(title, "visible", false);
			setBoolean(list, "visible", false);
		}
	}
	
	public void showAccessories(Object button) {
		showLinkList(getProperty(button, "Accessories"), "Accessory", "Accessories:");
	}
	
	public void showSimilars(Object button) {
		showLinkList(getProperty(button, "SimilarProducts"), "Product", "Similar products:");
	}
	
	private void showLinkList(Object nRoot, String leafname, String title) {
		StringBuffer asins = new StringBuffer();
		int n = getDOMCount(nRoot, leafname);
		for (int i = 0; i < n; i++) {
			if (i != 0) asins.append(',');
			asins.append(getDOMText(getDOMNode(nRoot, leafname, i)));
		}
		
		Object nProductInfo = getResponse("ListManiaSearch=" + asins.toString() + "&type=lite");
		if (!isErrorMessage(nProductInfo)) {
			try {
				Object linklist = parse("linklist.xml");
				setString(find(linklist, "title"), "text", title);
				loadDetailsList(nProductInfo, find(linklist, "resultlist"));
				addPage(linklist);
			} catch (Exception exc) { exc.printStackTrace(); }
		}
	}
	
	public void showWishlists(Object button) {
		try {
			Object listmania = parse("listmania.xml");
			Object nLists = getProperty(button, "Lists");
			putProperty(listmania, "Lists", nLists);
			loadWishlist(nLists, 0, listmania,
				find(listmania, "resultlist"), find(listmania, "listname"),
				find(listmania, "prevlist"), find(listmania, "nextlist"));
			addPage(listmania);
		} catch (Exception exc) { exc.printStackTrace(); }
	}
	
	public void previousWishlist(Object listmania,
			Object resultlist, Object listname, Object prevlist, Object nextlist) {
		int index = ((Integer) getProperty(listmania, "ListsIndex")).intValue();
		loadWishlist(getProperty(listmania, "Lists"), index - 1,
			listmania, resultlist, listname, prevlist, nextlist);
	}
	
	public void nextWishlist(Object listmania,
			Object resultlist, Object listname, Object prevlist, Object nextlist) {
		int index = ((Integer) getProperty(listmania, "ListsIndex")).intValue();
		loadWishlist(getProperty(listmania, "Lists"), index + 1,
			listmania, resultlist, listname, prevlist, nextlist);
	}
	
	private void loadWishlist(Object nLists, int index, Object listmania,
			Object resultlist, Object listname, Object prevlist, Object nextlist) {
		int n = getDOMCount(nLists, "ListId");
		if ((index >= 0) && (index < n)) {
			String sListId = getDOMText(getDOMNode(nLists, "ListId", index));
			Object nProductInfo = getResponse("ListManiaSearch=" + sListId + "&type=lite");
			if (!isErrorMessage(nProductInfo)) {
				setString(listname, "text", getDOMText(nProductInfo, "ListName"));
				removeAll(resultlist);
				loadDetailsList(nProductInfo, resultlist);
				putProperty(listmania, "ListsIndex", new Integer(index));
				setBoolean(prevlist, "enabled", index > 0);
				setBoolean(nextlist, "enabled", index < n - 1);
			}
		}
	}
	
	public void searchMarket(Object button, Object offertype) {
		String asin = (String) getProperty(button, "Asin");
		String type = getString(getItem(offertype, getInteger(offertype, "selected")), "text");
		
		String searchstring = "AsinSearch=" + asin + "&type=heavy&offer=" + type;
		Object nProductInfo = getResponse(searchstring + "&offerpage=1");
		if (!isErrorMessage(nProductInfo)) {
			try {
				Object market = parse("market.xml");
				
				Object nDetails = getDOMNode(nProductInfo, "Details", 0);
				if (nDetails == null) { return; }
				
				String offerings = getDOMText(nDetails, "NumberOfOfferings");
				setString(find(market, "offerings"), "text", offerings);
				
				Object nInfo = getDOMNode(nDetails, "ThirdPartyProductInfo", 0);
				Object detailslist = find(market, "detailslist");
				int n = getDOMCount(nInfo, "ThirdPartyProductDetails");
				for (int i = 0; i < n; i++) {
					Object nProduct = getDOMNode(nInfo, "ThirdPartyProductDetails", i);
					Object row = create("row");
					putProperty(row, "ThirdPartyProductDetails", nProduct);
					Object cellNick = create("cell");
					setString(cellNick, "text", getDOMText(nProduct, "SellerNickname"));
					add(row, cellNick);
					Object cellPrice = create("cell");
					setString(cellPrice, "text", getDOMText(nProduct, "OfferingPrice"));
					add(row, cellPrice);
					add(detailslist, row);
				}
				
				addPage(market);
			} catch (Exception exc) { exc.printStackTrace(); }
		}
	}
	
	public void showMarketDetails(Object detailslist) {
		Object nProduct = getProperty(getSelectedItem(detailslist), "ThirdPartyProductDetails");
		try {
			Object exchange = parse("exchange.xml");
			Object properties = find(exchange, "properties");
			
			addLabel(properties, "Nickname:", nProduct, "SellerNickname");
			addLabel(properties, "Price:", nProduct, "OfferingPrice");
			addLabel(properties, "Condition:", nProduct, "Condition");
			addField(properties, "Condition:", nProduct, "ConditionType");
			addLabel(properties, "Availability:", nProduct, "ExchangeAvailability");
			addLabel(properties, "Country:", nProduct, "SellerCountry");
			addLabel(properties, "State:", nProduct, "SellerState");
			addField(properties, "Comments:", nProduct, "ShipComments");
			addLabel(properties, "Rating:", nProduct, "SellerRating");
			
			add(exchange);
		} catch (Exception exc) { exc.printStackTrace(); }
	}
	
	private void addLabel(Object panel, String title, Object root, String key) {
		String value = getDOMText(root, key);
		if (value != null) {
			Object label = create("label");
			setString(label, "text", title);
			add(panel, label);
			Object field = create("label");
			setString(field, "text", value);
			setInteger(field, "weightx", 1);
			add(panel, field);
		}
	}
	
	private void addField(Object panel, String title, Object root, String key) {
		String value = getDOMText(root, key);
		if (value != null) {
			Object label = create("label");
			setString(label, "text", title);
			add(panel, label);
			Object field = create("textfield");
			setString(field, "text", getDOMText(root, key));
			setBoolean(field, "editable", false);
			setInteger(field, "weightx", 1);
			add(panel, field);
		}
	}
	
	private void addList(Object panel, String title, Object root, String key, String itemkey) {
		Object mainnode = getDOMNode(root, key, 0);
		if (mainnode != null);
		int n = getDOMCount(mainnode, itemkey);
		for (int i = 0; i < n; i++) {
			Object label = create("label");
			if (i == 0) { setString(label, "text", title); }
			add(panel, label);
			
			Object field = create("label");
			setString(field, "text", getDOMText(getDOMNode(mainnode, itemkey, i)));
			setInteger(field, "weightx", 1);
			add(panel, field);
		}
	}
	
	// ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- -----
	
	public void exit() {
		System.exit(0);
	}
	
	public void defaultTheme() {
		setColors(0xe6e6e6, 0x000000, 0xffffff,
			0x909090, 0xb0b0b0, 0xededed, 0xb9b9b9, 0x89899a, 0xc5c5dd);
	}
	
	public void yellowTheme() {
		setColors(0xeeeecc, 0x000000, 0xffffff,
			0x999966, 0xb0b096, 0xededcb, 0xcccc99, 0xcc6600, 0xffcc66);
	}
	
	public void blueTheme() {
		setColors(0x6375d6, 0xffffff, 0x7f8fdd,
			0xd6dff5, 0x9caae5, 0x666666, 0x003399, 0xff3333, 0x666666);
	}
	
	public void about() {
		try {
			add(parse("about.xml"));
		} catch (Exception exc) { exc.printStackTrace(); }
	}
	
	// ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- -----
	
	private Object getResponse(String path) {
		String associatestag = "thinlet-20";
		String developertoken = "D3MAIAYX2Q6JLY";
		String url = "http://xml.amazon.com/onca/xml2?t=" + associatestag +
			"&dev-t=" + developertoken + "&" + path + "&f=xml";
		if (getParent() instanceof Applet) {
			String proxy = ((Applet) getParent()).getParameter("proxy");
			if (proxy != null) {
				url = proxy + convert(url);
			}
		}
		try {
			return parseDOM(new URL(url).openStream());
		} catch (Exception exc) {
			showException(exc);
			return null;
		}
	}
	
	private void addPage(Object page) {
		Object mainpanel = find("mainpanel");
		int n = getCount(mainpanel);
		setBoolean(getItem(mainpanel, n - 1), "visible", false);
		add(mainpanel, page);
	}
	
	public void removePage() {
		Object mainpanel = find("mainpanel");
		int n = getCount(mainpanel);
		setBoolean(getItem(mainpanel, n - 2), "visible", true);
		remove(getItem(mainpanel, n - 1));
	}
	
	protected void handleException(Throwable throwable) {
		showException(throwable);
	}
	
	private void showException(Throwable thr) {
		StringWriter writer = new StringWriter();
		thr.printStackTrace(new PrintWriter(writer));
		String trace = writer.toString().replace('\r', ' ').replace('\t', ' ');
		String thrclass = thr.getClass().getName();
		thrclass = thrclass.substring(thrclass.lastIndexOf('.') + 1);
		
		try {
			Object exceptiondialog = parse("exception.xml");
			setString(exceptiondialog, "text", thrclass);
			setString(find(exceptiondialog, "message"), "text", thr.getMessage());
			setString(find(exceptiondialog, "stacktrace"), "text", trace);
			add(exceptiondialog);
		} catch (Exception exc) { exc.printStackTrace(); }
	}
	
	private boolean isErrorMessage(Object nProductInfo) {
		if (nProductInfo == null) { return true; }
		String sErrorMsg = getDOMText(nProductInfo, "ErrorMsg");
		if (sErrorMsg == null) { return false; }
		try {
			Object exceptiondialog = parse("error.xml");
			setString(find(exceptiondialog, "message"), "text", sErrorMsg);
			add(exceptiondialog);
		} catch (Exception exc) { exc.printStackTrace(); }
		return true;
	}
	
	public void closeDialog(Object dialog) {
		remove(dialog);
	}
	
	// ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- -----
	
	private String getDOMText(Object node, String key) {
		Object leaf = getDOMNode(node, key, 0);
		return (leaf != null) ? getDOMText(leaf) : null;
	}
	
	private static int getNumber(String text) {
		try {
			if (text.startsWith("$")) { text = text.substring(1); }
			int dot = text.indexOf('.');
			text = text + "00";
			if (dot != -1) {
				text = text.substring(0, dot) +
					text.substring(dot + 1, Math.min(dot + 3, text.length()));
			}
			return Integer.parseInt(text);
		} catch (Exception exc) {
			return 0;
		}
	}
	
	private static String convert(String text) {
		StringBuffer converted = new StringBuffer(text.length());
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (((c >= 'a') && (c <= 'z')) || ((c >= 'A') && (c <= 'Z')) ||
					((c >= '0') && (c <= '9'))) {
				converted.append(c);
			}
			else {
				converted.append('%');
				converted.append(Integer.toHexString((int) c));
			}
		}
		return converted.toString();
	}
	
	private static String convertHTML(String comment) {
		StringBuffer sb = new StringBuffer(comment.length());
		for (int i = 0; i < comment.length(); i++) {
			if (comment.startsWith("&lt;P>", i)) {
				sb.append("\n\n"); i += 5;
			}
			else if (comment.startsWith("&lt;BR>", i)) {
				sb.append("\n"); i += 6;
			}
			else sb.append(comment.charAt(i));
		}
		return sb.toString();
	}
	
	public static void main(String[] args) throws Exception {
		new FrameLauncher("Thinlet Amazon Explorer", new AmazonExplorer(), 208, 256); // 208x235
	}
}
