package thinlet.drafts;

import java.awt.*;
import thinlet.*;

public class DialogDemo {
	
	public void setIcon(Thinlet thinlet, Object dialog, Image icon) {
		thinlet.setIcon(dialog, "icon", icon);
	}
	
	public void setText(Thinlet thinlet, Object dialog, String text) {
		thinlet.setString(dialog, "text", text);
	}
	
	public void setResizable(Thinlet thinlet, Object dialog, boolean selected) {
		thinlet.setBoolean(dialog, "resizable", selected);
	}
	
	public void setClosable(Thinlet thinlet, Object dialog, boolean selected) {
		thinlet.setBoolean(dialog, "closable", selected);
	}
	
	public void setMaximizable(Thinlet thinlet, Object dialog, boolean selected) {
		thinlet.setBoolean(dialog, "maximizable", selected);
	}
	
	public void setIconifiable(Thinlet thinlet, Object dialog, boolean selected) {
		thinlet.setBoolean(dialog, "iconifiable", selected);
	}
}