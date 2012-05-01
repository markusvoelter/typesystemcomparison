package thinlet.common;

import java.awt.*;
import java.io.*;
import java.text.*;
import javax.swing.*;
import javax.swing.filechooser.*;
import thinlet.*;

public class FileChooser {

	public static final int OPEN_DIALOG = 0;
	public static final int SAVE_DIALOG = 1;
	public static final int DIRECTORY_DIALOG = 2;
	
	private int type;
	private Image openedicon, closedicon, fileicon;
	private static View view;
	{
		if (view == null) {
			try {
				view = new View2();
			} catch (NoClassDefFoundError nfe) {
				view = new View();
			}
		}
	}
	
	public FileChooser(Thinlet thinlet, int type) {
		this.type = type;
		Object dialog = Thinlet.create("dialog");
		thinlet.setString(dialog, "text", "Choose directory");
		thinlet.setInteger(dialog, "width", 240);
		thinlet.setInteger(dialog, "height", 320);
		thinlet.setBoolean(dialog, "resizable", true);
		thinlet.setInteger(dialog, "top", -1);
		thinlet.setInteger(dialog, "left", -1);
		thinlet.setInteger(dialog, "bottom", -1);
		thinlet.setInteger(dialog, "right", -1);
		
		Object tree = Thinlet.create("tree");
		thinlet.setInteger(tree, "weightx", 1);
		thinlet.setInteger(tree, "weighty", 1);
		thinlet.setBoolean(tree, "angle", true);
		thinlet.setBoolean(tree, "line", false);
		thinlet.setMethod(tree, "expand", "expand(thinlet, this, item)", tree, this);
		thinlet.setMethod(tree, "collapse", "collapse(thinlet, this, item)", tree, this);
		
		File[] roots = view.getRoots();
		for (int i = 0; i < roots.length; i++) {
			addNode(thinlet, tree, roots[i]);
		}
		
		thinlet.add(dialog, tree);
		thinlet.add(dialog);
	}
	
	public void expand(Thinlet thinlet, Object tree, Object node) {
			if (thinlet.getIcon(node, "icon") == closedicon) {
				if (openedicon == null) {
					openedicon = thinlet.getIcon("/icon/open.gif");
				}
				thinlet.setIcon(node, "icon", openedicon);
			}
		
			if (thinlet.getProperty(node, "load") == Boolean.TRUE) {
				File file = (File) thinlet.getProperty(node, "file");
				File[] files = view.getFiles(file);
				thinlet.removeAll(node);
				for (int i = 0; i < files.length; i++) {
					addNode(thinlet, node, files[i]);
				}
				thinlet.putProperty(node, "load", null);
			}
		}
	
	public void collapse(Thinlet thinlet, Object tree, Object node) {
		if (thinlet.getIcon(node, "icon") == openedicon) {
			thinlet.setIcon(node, "icon", closedicon);
		}
	}
	
	private void addNode(Thinlet thinlet, Object node, File file) {
		Object subnode = Thinlet.create("node");
		thinlet.setString(subnode, "text", view.getText(file));
		thinlet.setIcon(subnode, "icon", view.getIcon(thinlet, file));
		thinlet.putProperty(subnode, "file", file);
		thinlet.add(node, subnode);
		if (file.isDirectory() || !file.isFile()) {
			thinlet.setBoolean(subnode, "expanded", false);
			thinlet.putProperty(subnode, "load", Boolean.TRUE);
			Object loading = Thinlet.create("node");
			thinlet.setString(loading, "text", "loading...");
			thinlet.add(subnode, loading);
		}
	}
	
	private class View {
		
		public File[] getRoots() {
			return new File[] { new File("C:\\") };
		}
		
		public File[] getFiles(File file) {
			String[] list = file.list();
			int dircount = 0;
			File[] files = new File[list.length];
			for (int i = 0; i < list.length; i++) {
				files[i] = new File(file, list[i]);
				if (files[i].isDirectory()) { // separate directories and files
					String swap = list[dircount]; list[dircount] = list[i]; list[i] = swap;
					File fwap = files[dircount]; files[dircount] = files[i]; files[i] = fwap;
					dircount++;
				}
			}

			Collator collator = Collator.getInstance();
			collator.setStrength(Collator.SECONDARY);
			for (int i = 0; i < list.length; i++) { // sort names
				for (int j = i; (j > 0) && ((i < dircount) || (j > dircount)) &&
						(collator.compare(list[j - 1], list[j]) > 0); j--) {
					String swap = list[j]; list[j] = list[j - 1]; list[j - 1] = swap;
					File fwap = files[j]; files[j] = files[j - 1]; files[j - 1] = fwap;
				}
			}
			return files;
		}
		
		public String getText(File file) {
			return file.getName();
		}
		
		public Image getIcon(Thinlet thinlet, File file) {
			if (file.isDirectory()) {
				if (closedicon == null) { closedicon = thinlet.getIcon("/icon/folder.gif"); }
				return closedicon;
			} else {
				if (fileicon == null) { fileicon = thinlet.getIcon("/icon/new.gif"); }
				return fileicon;
			}
		}
	}
	
	private class View2 extends View {
		
		private FileSystemView view = FileSystemView.getFileSystemView();
		
		public File[] getRoots() {
			return view.getRoots();
		}
		
		public File[] getFiles(File file) {
			return view.getFiles(file, true);
		}
		
		public String getText(File file) {
			return view.getSystemDisplayName(file);
		}
		
		public Image getIcon(Thinlet thinlet, File file) {
			Icon icon = view.getSystemIcon(file);
			return (icon instanceof ImageIcon) ?
				((ImageIcon) icon).getImage() : null;
		}
	}
}