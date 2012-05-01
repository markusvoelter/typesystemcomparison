package thinlet.drafts;

import java.awt.*;
import java.awt.image.*;
import java.util.*;
import javax.swing.*;
import thinlet.*;

public class SwingProperties {
	
	public void load(Thinlet thinlet, Object table) {
		UIDefaults defaults = UIManager.getDefaults();
		Hashtable iconcache = new Hashtable();
		
		for (Enumeration keys = defaults.keys(); keys.hasMoreElements();) {
			String key = (String) keys.nextElement();
			Object value = defaults.get(key);
			
			Object row = Thinlet.create("row");
			Object keycell = Thinlet.create("cell");
			thinlet.setString(keycell, "text", key);
			thinlet.add(row, keycell);
			Object valuecell = Thinlet.create("cell");
			if (value instanceof Color) {
				Color color = (Color) value;
				Image icon = (Image) iconcache.get(color);
				if (icon == null) {
					icon = createIcon(thinlet, color);
					iconcache.put(color, icon);
				}
				thinlet.setIcon(valuecell, "icon", icon);
				thinlet.setString(valuecell, "text", "0x" +
					Integer.toHexString(0xff000000 | color.getRGB()).substring(2));
			}
			else if (value instanceof Font) {
				Font font = (Font) value;
				StringBuffer fonttext = new StringBuffer(font.getName());
				if (font.isBold()) { fonttext.append(" bold"); }
				if (font.isItalic()) { fonttext.append(" italic"); }
				fonttext.append(' '); fonttext.append(font.getSize());
				thinlet.setString(valuecell, "text", fonttext.toString());
			}
			else {
				thinlet.setString(valuecell, "text", value.toString());
			}
			thinlet.add(row, valuecell);
			thinlet.add(table, row);
		}
	}
			
	private static Image createIcon(Component component, Color color) {
		int rgb = color.getRGB();
		int[] pix = new int[12 * 12];
		for (int x = 0; x < 12; x++) {
			for (int y = 0; y < 12; y++) {
				pix[x + y * 12] = ((x > 0) && (x < 11) &&
					(y > 0) && (y < 11)) ? rgb : 0xff666666;
			}
		}
		return component.createImage(
			new MemoryImageSource(12, 12, pix, 0, 12));
	}
	
	public static void main(String[] args) throws Exception {
		Thinlet thinlet = new Thinlet();
		thinlet.setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11));
		thinlet.setColors(0xf2f1e4, 0x000000, 0xffffff,
			0x909090, 0xb0b0b0, 0xededed, 0xc7c5b2, 0xe68b2c, 0xf2c977);
		thinlet.add(thinlet.parse("/thinlet/drafts/swingproperties.xml", new SwingProperties()));
		new FrameLauncher("Thinlet widgets", thinlet, 320, 270);
	}
}