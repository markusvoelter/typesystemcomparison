package thinlet.drafts;

import java.util.*;
import thinlet.*;

public class Internationalization {
	
	public void update(Thinlet thinlet, Object combobox, int selected, Object panel) throws Exception {
		String locale = (String) thinlet.getProperty(thinlet.getItem(combobox, selected), "locale");
		ResourceBundle bundle = ResourceBundle.getBundle("thinlet.drafts.i18n", new Locale(locale, "", ""));
		
		thinlet.setResourceBundle(bundle);
		thinlet.add(panel, thinlet.parse("i18npanel.xml"));
		thinlet.setResourceBundle(null);
	}
}