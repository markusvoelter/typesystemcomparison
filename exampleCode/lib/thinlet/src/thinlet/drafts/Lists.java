package thinlet.drafts;

import thinlet.*;

public class Lists {
	
	public void listSelectionChanged(Thinlet thinlet, Object list, Object button) {
		thinlet.setBoolean(button, "enabled", thinlet.getSelectedIndex(list) != -1);
	}
	
	public void moveListItem(Thinlet thinlet, Object sourcelist, Object targetlist) {
		Object[] items = thinlet.getSelectedItems(sourcelist);
		for (int i = 0; i < items.length; i++) {
			thinlet.remove(items[i]);
			thinlet.add(targetlist, items[i]);
		}
	}
	
	public void addTableRows(Thinlet thinlet, Object table) {
		int rows = thinlet.getCount(table);
		for (int i = 1; i <= 30 ; i++) {
			Object row = Thinlet.create("row");
			for (int j = 1; j <= 3; j++) {
				Object cell = Thinlet.create("cell");
				thinlet.setString(cell, "text", "Cell-" + (rows + i) + "-" + j);
				thinlet.add(row, cell);
			}
			thinlet.add(table, row);
		}
	}
	public void clearTable(Thinlet thinlet, Object table) {
		thinlet.removeAll(table);
	}
}