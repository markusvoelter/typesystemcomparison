package thinlet.demo;

import java.awt.*;
import java.io.*;

import thinlet.*;

/**
 * Simple demonstration of widgets and events
 */
public class Demo extends Thinlet {

	/**
	 * Loads the xml file
	 */
	public Demo() throws Exception {
		add(parse("demo.xml"));
	}
	
	/**
	 * Creates a frame including this thinlet demo
	 */
	public static void main(String[] args) throws Exception {
		new FrameLauncher("Demo", new Demo(), 320, 320);
	}
	
	/**
	 * Called if the demo.xml was loaded,
	 * it fills the textarea from a resource file
	 */
	public void loadText(Object textarea) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
			getClass().getResourceAsStream("demodialog.xml")));
		StringBuffer text = new StringBuffer();
		for (int c = reader.read(); c != -1; c = reader.read()) {
			if (((c > 0x1f) && (c < 0x7f)) ||
					((c > 0x9f) && (c < 0xffff)) || (c == '\n')) {
				text.append((char) c);
			}
			else if (c == '\t') {
				text.append("  ");
			}
		}
		reader.close();
		setString(textarea, "text", text.toString());
	}

	/**
	 * Updates textarea's editable property depending on a checkbox state
	 */
	public void changeEditable(boolean editable, Object textarea) {
		setBoolean(textarea, "editable", editable);
	}

	/**
	 * Updates textarea's enabled property
	 */
	public void changeEnabled(boolean enabled, Object textarea) {
		setBoolean(textarea, "enabled", enabled);
	}

	Object dialog;

	/**
	 * Shows the modal find dialog, creates only one dialog instance
	 */
	public void showDialog() throws Exception {
		if (dialog == null) {
			dialog = parse("demodialog.xml");
		}
		add(dialog);
	}

	/**
	 * Updates the textarea's selection range,
	 * and add the search string to the history 
	 */
	public void findText(Object combobox, String what,
			boolean match, boolean down) {
		closeDialog();
		if (what.length() == 0) { return; }

		boolean cacheditem = false;
		for (int i = getCount(combobox) - 1; i >= 0; i--) {
			String choicetext = getString(getItem(combobox, i), "text");
			if (what.equals(choicetext)) { cacheditem = true; break; }
		}
		if (!cacheditem) {
			Object choice = create("choice");
			setString(choice, "text", what);
			add(combobox, choice);
		}

		Object textarea = find("textarea");
		int end = getInteger(textarea, "end");
		String text = getString(textarea, "text");
		
		if (!match) {
			what = what.toLowerCase();
			text = text.toLowerCase();
		}

		int index = text.indexOf(what, down ? end : 0);
		if (!down && (index != -1) && (index >= end)) { index = -1; }
		if (index != -1) {
			setInteger(textarea, "start", index);
			setInteger(textarea, "end", index + what.length());
			requestFocus(textarea);
		}
		else {
			getToolkit().beep();
		}
	}

	/**
	 * Closes the dialog
	 */
	public void closeDialog() {
		remove(dialog);
	}
	
	/**
	 * Insert a new item into the list
	 */
	public void insertList(Object list) {
		Object item = create("item");
		setString(item, "text", "New item");
		setIcon(item, "icon", getIcon("/icon/library.gif"));
		add(list, item, 0);
//		System.out.println("> click " + System.currentTimeMillis());
//		try { Thread.sleep(5000); } catch (InterruptedException ie) {}
	}

	/**
	 * Removes the selected items from the list
	 */
	public void deleteList(Object delete, Object list) {
		for (int i = getCount(list) - 1; i >= 0; i--) {
			Object item = getItem(list, i);
			if (getBoolean(item, "selected")) {
				remove(item);
			}
		}
		setBoolean(delete, "enabled", false);
	}
	
	/**
	 * Delete button's state depends on the list selection
	 */
	public void changeSelection(Object list, Object delete) {
		setBoolean(delete, "enabled", getSelectedIndex(list) != -1);
	}

	/**
	 * Clears list selection and updates the selection model
	 */
	public void setSelection(Object list, String selection, Object delete) {
		for (int i = getCount(list) - 1; i >= 0; i--) {
			setBoolean(getItem(list, i), "selected", false);
		}
		setChoice(list, "selection", selection);
		setBoolean(delete, "enabled", false);
	}
	
	public void sliderChanged(int value, Object spinbox) {
		setString(spinbox, "text", String.valueOf(value));
		hsbChanged();
	}
	
	public void spinboxChanged(String text, Object slider) {
		try {
			int value = Integer.parseInt(text);
			if ((value >= 0) && (value <= 255)) {
				setInteger(slider, "value", value);
				hsbChanged();
			}
		} catch (NumberFormatException nfe) { getToolkit().beep(); }
	}
	
	private Object sl_red, sl_green, sl_blue;
	private Object tf_hue, tf_saturation, tf_brightness;
	private Object pb_hue, pb_saturation, pb_brightness;
	private Object rgb_label;
	
	public void storeWidgets(Object sl_red, Object sl_green, Object sl_blue,
			Object tf_hue, Object tf_saturation, Object tf_brightness,
			Object pb_hue, Object pb_saturation, Object pb_brightness, Object rgb_label) {
		this.sl_red = sl_red;
		this.sl_green = sl_green;
		this.sl_blue = sl_blue;
		this.tf_hue = tf_hue;
		this.tf_saturation = tf_saturation;
		this.tf_brightness = tf_brightness;
		this.pb_hue = pb_hue;
		this.pb_saturation = pb_saturation;
		this.pb_brightness = pb_brightness;
		this.rgb_label = rgb_label;
	}
	
	private void hsbChanged() {
		int red = getInteger(sl_red, "value");
		int green = getInteger(sl_green, "value");
		int blue = getInteger(sl_blue, "value");
		
		float[] hsb = Color.RGBtoHSB(red, green, blue, null);

		setString(tf_hue, "text", String.valueOf(hsb[0]));
		setString(tf_saturation, "text", String.valueOf(hsb[1]));
		setString(tf_brightness, "text", String.valueOf(hsb[2]));

		setInteger(pb_hue, "value", (int) (100f * hsb[0]));
		setInteger(pb_saturation, "value", (int) (100f * hsb[1]));
		setInteger(pb_brightness, "value", (int) (100f * hsb[2]));

		setColor(rgb_label, "background", new Color(red, green, blue));
		setColor(rgb_label, "foreground", new Color(255 - red, 255 - green, 255 - blue));
	}
}