package thinlet.drafts;

import thinlet.*;

public class EventLogger {

	public void buttonAction(String text, String string, int i, long l, double d, float f) {
		log("button action " + text + " '" + string + "' " + i + ' ' + l + ' ' + d + ' ' + f);
	}
	public void buttonAction(String text) { log("button action " + text); }
	public void selectAction(String name, String text) { log(name + " select " + text); }
	public void doubleClick(String name, String text) { log(name + " double click " + text); }
	public void expand(String text) { log("expand " + text); }
	public void collapse(String text) { log("collapse " + text); }
	public void insert(String text, int start, int end) { log("insert " + text + " " + start + " " + end); }
	public void remove(String text, int start, int end) { log("remove " + text + " " + start + " " + end); }
	public void caret(String text, int start, int end) { log("caret " + text + " " + start + " " + end); }
	public void perform(String text) { log("perform " + text); }
	public void tabChanged(int selected) { log("tab changed " + selected); }
	public void menuAction(String text) { log("menuitem selected " + text); }
	
	private Thinlet thinlet;
	private Object logarea;
	
	/**
	 * Cache thinlet and the log textarea
	 */
	public void setLogArea(Thinlet thinlet, Object logarea) {
		this.thinlet = thinlet;
		this.logarea = logarea;
	}
	
	/**
	 * Append the given text to the log textarea
	 */
	private void log(String text) {
		StringBuffer update = new StringBuffer(thinlet.getString(logarea, "text"));
		if (update.length() > 0) { update.append('\n'); }
		update.append(text);
		thinlet.setString(logarea, "text", update.toString());
		int length = update.length(); // to scroll down
		thinlet.setInteger(logarea, "start", length);
		thinlet.setInteger(logarea, "end", length);
	}
	
	public void showLink(Thinlet thinlet) {
		log("link pressed");
	}
}