package thinlet.drafts;

import java.io.*;
import java.text.*;
import thinlet.*;

public class AutoFill {
	
	private String[] autofill;
	
	public void load(Thinlet thinlet, Object localelist, Object shortmonths, Object months,
			Object shortweekdays, Object weekdays) {
		DateFormatSymbols symbols = new DateFormatSymbols();
		fill(thinlet, shortmonths, symbols.getShortMonths());
		fill(thinlet, months, symbols.getMonths());
		fill(thinlet, shortweekdays, symbols.getShortWeekdays());
		fill(thinlet, weekdays, symbols.getWeekdays());
		
		autofill = symbols.getWeekdays();
	}
	
	private void fill(Thinlet thinlet, Object list, String[] values) {
		for (int i = 0; i < values.length; i++) {
			Object item = Thinlet.create("item");
			thinlet.setString(item, "text", values[i]);
			thinlet.add(list, item);
		}
	}
	
	public void autoFill(Thinlet thinlet, Object textfield,  String text, int caret) {
		if (text.length() == caret) {
			for (int i = 0; i < autofill.length; i++) {
				if (autofill[i].startsWith(text)) {
					thinlet.setString(textfield, "text", autofill[i]);
					thinlet.setInteger(textfield, "start", autofill[i].length());
					break;
				}
			}
		}
	}
	
	public void initPath(Thinlet thinlet, Object textfield) {
		try {
			thinlet.setString(textfield, "text", System.getProperty("user.dir"));
		} catch (SecurityException se) {} // applet
	}
	
	public void complementPath(Thinlet thinlet, Object textfield,  String text, int caret) {
		if (text.length() == caret) {
			int index = text.lastIndexOf(File.separatorChar);
			if (index == -1) { return; }
			String foldername = text.substring(0, index + 1);
			File folder = new File(foldername);
			String namestart = text.substring(index + 1);
			String[] list = folder.list();
			if (list == null) { return; } // e.g. no floppy
			for (int i = 0; i < list.length; i++) {
				if (list[i].startsWith(namestart)) {
					String path = foldername + list[i];
					if (new File(folder, list[i]).isDirectory()) { path += File.separatorChar; }
					thinlet.setString(textfield, "text", path);
					thinlet.setInteger(textfield, "end", path.length());
					break;
				}
			}
		}
	}
}