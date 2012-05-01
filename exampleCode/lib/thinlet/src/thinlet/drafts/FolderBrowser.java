package thinlet.drafts;

import java.awt.*;
import java.io.*;
import java.text.*;
import thinlet.*;

public class FolderBrowser {
	
	private Image openedicon, closedicon, fileicon;
	
	public void init(Thinlet thinlet, Object tree) {
		//System.out.println(System.getProperty("user.home") + " " + File.separatorChar);
		addNode(thinlet, tree, "C:", true);
	}
	
	public void expand(Thinlet thinlet, Object tree, Object node) {
		if (thinlet.getIcon(node, "icon") == closedicon) {
			if (openedicon == null) {
				openedicon = thinlet.getIcon("/icon/open.gif");
			}
			thinlet.setIcon(node, "icon", openedicon);
		}
		
		if (thinlet.getProperty(node, "load") == Boolean.TRUE) {
			String path = "";
			for (Object item = node; item != tree; item = thinlet.getParent(item)) {
				path = thinlet.getString(item, "text") + File.separatorChar + path;
			}
			String[] list = new File(path).list();
			
			int dircount = 0;
			for (int i = 0; i < list.length; i++) { // separate directories and files
				if (new File(path, list[i]).isDirectory()) {
					String swap = list[dircount]; list[dircount] = list[i]; list[i] = swap;
					dircount++;
				}
			}
			
			Collator collator = Collator.getInstance();
			collator.setStrength(Collator.SECONDARY);
			for (int i = 0; i < list.length; i++) { // sort names
				for (int j = i; (j > 0) && ((i < dircount) || (j > dircount)) &&
						(collator.compare(list[j - 1], list[j]) > 0); j--) {
					String swap = list[j]; list[j] = list[j - 1]; list[j - 1] = swap;
				}
			}
			
			thinlet.removeAll(node);
			for (int i = 0; i < list.length; i++) {
				addNode(thinlet, node, list[i], i < dircount);
			}
			thinlet.putProperty(node, "load", null);
		}
	}
	
	public void collapse(Thinlet thinlet, Object node) {
		if (thinlet.getIcon(node, "icon") == openedicon) {
			thinlet.setIcon(node, "icon", closedicon);
		}
	}
	
	private void addNode(Thinlet thinlet, Object node, String text, boolean directory) {
		Object subnode = Thinlet.create("node");
		thinlet.setString(subnode, "text", text);
		if (directory) {
			if (closedicon == null) { closedicon = thinlet.getIcon("/icon/folder.gif"); }
			thinlet.setIcon(subnode, "icon", closedicon);
		} else {
			if (fileicon == null) { fileicon = thinlet.getIcon("/icon/new.gif"); }
			thinlet.setIcon(subnode, "icon", fileicon);
		}
		thinlet.add(node, subnode);
		if (directory) {
			thinlet.setBoolean(subnode, "expanded", false);
			thinlet.putProperty(subnode, "load", Boolean.TRUE);
			Object loading = Thinlet.create("node");
			thinlet.setString(loading, "text", "loading...");
			thinlet.add(subnode, loading);
		}
	}
}