package thinlet.drafts;

import thinlet.*;
import java.io.*;

public class Widgets {
	
	public void perform() { /*System.out.println("perform");*/ }
	public void ok() { /*System.out.println("ok");*/ }
	public void cancel() { /*System.out.println("cancel");*/ }
	public void cut() { /*System.out.println("cut");*/ }
	public void copy() { /*System.out.println("copy");*/ }
	public void paste() { /*System.out.println("paste");*/ }
	public void delete() { /*System.out.println("delete");*/ }
	
	public void loadText(Thinlet thinlet,  Object textarea) throws Exception {
		StringBuffer helpText = new StringBuffer();
		BufferedReader reader = new BufferedReader(
			new FileReader(new File("src/thinlet/drafts/Widgets.java")));
		String line = null;
		while ((line = reader.readLine()) != null) {
			helpText.append(line + "\n");
		}
		thinlet.setString(textarea, "text", helpText.toString());
	}
	
	public void setLine(Thinlet thinlet, Object component, boolean line) {
		thinlet.setBoolean(component, "line", line);
	}
	
	public void showDialog(Thinlet thinlet) throws Exception {
		Object dialog = Thinlet.create("dialog");
		thinlet.setString(dialog, "text", "Dialog");
		thinlet.setBoolean(dialog, "scrollable", true);
		thinlet.setInteger(dialog, "width", 180); thinlet.setInteger(dialog, "height", 180);
		thinlet.add(dialog, thinlet.parse("/thinlet/drafts/widgets.xml", this));
		thinlet.add(dialog);
	}
}