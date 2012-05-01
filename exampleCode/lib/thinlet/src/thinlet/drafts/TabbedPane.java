package thinlet.drafts;

import thinlet.*;

public class TabbedPane {
	
	public void changePlacement(Thinlet thinlet, Object combobox, Object tabbedpane) {
		int index = thinlet.getInteger(combobox, "selected");
		String[] placements = { "top", "left", "bottom", "right", "stacked" };
		thinlet.setChoice(tabbedpane, "placement", placements[index]);
	}
	
	public void changeEnabled(Thinlet thinlet, boolean selected, Object tabbedpane, int tabindex) {
		Object tab = thinlet.getItem(tabbedpane, tabindex);
		thinlet.setBoolean(tab, "enabled", selected);
	}
	
	public void changeText(Thinlet thinlet, Object tabbedpane) {
		Object firsttab = thinlet.getItem(tabbedpane, 0);
		thinlet.setString(firsttab, "text", "First!");
		thinlet.setIcon(firsttab, "icon", thinlet.getIcon("/icon/library.gif"));
	}
	
	public void focus(Thinlet thinlet, Object component) {
		thinlet.setBoolean(component, "visible", true);
		//System.out.println(thinlet.requestFocus(component));
	}
	
	public void setBorder(Thinlet thinlet, boolean bordered, Object textarea) {
		thinlet.setBoolean(textarea, "border", bordered);
	}
	
	public void loadTab(Thinlet thinlet, Object tab) throws Exception {
		thinlet.removeAll(tab);
		thinlet.add(tab, thinlet.parse("focustest.xml", new FocusTest()));
	}
	
	public void updateIndex(Thinlet thinlet, Object tabbedpane, String text) {
		try {
			int index = Integer.parseInt(text);
			if ((index >= 0) && (index <= 4)) {
				thinlet.setInteger(tabbedpane, "selected", index);
			}
		} catch (NumberFormatException nfe) {}
	}
	
	public void addTab(Thinlet thinlet, Object tabbedpane) {
		Object tab = Thinlet.create("tab");
		thinlet.setString(tab, "text", "New tab");
		thinlet.add(tab, Thinlet.create("textarea"));
		thinlet.add(tabbedpane, tab);
	}
}