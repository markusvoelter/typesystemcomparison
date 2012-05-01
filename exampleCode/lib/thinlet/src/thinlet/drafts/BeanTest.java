package thinlet.drafts;

import java.awt.*;
import thinlet.*;

public class BeanTest {
	
	public void setBorder(Thinlet thinlet, Object panel, boolean value) {
		thinlet.setBoolean(panel, "border", value);
	}
	
	public void setScrollable(Thinlet thinlet, Object panel, boolean value) {
		thinlet.setBoolean(panel, "scrollable", value);
	}
	
	public void setIcon(Thinlet thinlet, Object panel, boolean value) {
		thinlet.setIcon(panel, "icon", value ? thinlet.getIcon("/icon/library.gif") : null);
	}
	
	public void setBackground(Thinlet thinlet, Object panel, boolean value) {
		thinlet.setColor(panel, "background", value ? Color.orange : null);
	}
	
	public void setTitle(Thinlet thinlet, Object panel, String text) {
		thinlet.setString(panel, "text", (text.length() > 0) ? text : null);
	}
	
	public void openDialog(Thinlet thinlet) throws Exception {
		Object dialog = Thinlet.create("dialog");
		thinlet.setString(dialog, "text", "Dialog");
		thinlet.setBoolean(dialog, "scrollable", true);
		thinlet.setInteger(dialog, "width", 180); thinlet.setInteger(dialog, "height", 180);
		thinlet.add(dialog, thinlet.parse("beantest.xml", this));
		thinlet.add(dialog);
	}
	
	public void openFileDialog(Thinlet thinlet) throws Exception {
		Container frame = thinlet;
		while (!(frame instanceof Frame)) { frame = frame.getParent(); }
		FileDialog filedialog = new FileDialog((Frame) frame,
			"FileDialog...", FileDialog.LOAD);
		filedialog.show();
	}
	
	public void exit() {
		System.exit(0);
	}
}