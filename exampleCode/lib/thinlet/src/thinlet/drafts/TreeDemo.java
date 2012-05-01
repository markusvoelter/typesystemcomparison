package thinlet.drafts;

import thinlet.*;

public class TreeDemo {
	
	public void updatePopup(Thinlet thinlet, Object tree,
			Object expand, Object collapse, Object enable, Object disable) {
		Object node = thinlet.getSelectedItem(tree);
		boolean enabled = thinlet.getBoolean(node, "enabled");
		boolean expanded = thinlet.getBoolean(node, "expanded");
		boolean hasnode = thinlet.getItem(node, 0) != null;
		thinlet.setBoolean(expand, "enabled", hasnode && !expanded);
		thinlet.setBoolean(collapse, "enabled", hasnode && expanded);
		thinlet.setBoolean(enable, "enabled", !enabled);
		thinlet.setBoolean(disable, "enabled", enabled);
	}
	
	public void expand(Thinlet thinlet, Object tree) {
		thinlet.setBoolean(thinlet.getSelectedItem(tree), "expanded", true);
	}
	
	public void collapse(Thinlet thinlet, Object tree) {
		thinlet.setBoolean(thinlet.getSelectedItem(tree), "expanded", false);
	}
	
	public void enable(Thinlet thinlet, Object tree) {
		thinlet.setBoolean(thinlet.getSelectedItem(tree), "enabled", true);
	}
	
	public void disable(Thinlet thinlet, Object tree) {
		thinlet.setBoolean(thinlet.getSelectedItem(tree), "enabled", false);
	}	
	
	public void removePopup(Thinlet thinlet, Object button, Object popupmenu) {
		thinlet.remove(popupmenu);
		thinlet.setBoolean(button, "enabled", false);
	}
}