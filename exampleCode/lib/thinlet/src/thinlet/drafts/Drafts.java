package thinlet.drafts;

import java.awt.*;
import java.awt.image.*;
import thinlet.*;

public class Drafts extends Thinlet {

	public Drafts() {
		//setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		try {
			add(parse("drafts.xml"));
		} catch (Exception exc) { exc.printStackTrace(); }
	}
	
	public void loadDraft(Object splitpane, Object tree) {
		if (getCount(splitpane) > 2) {
			remove(getItem(splitpane, 1));
		}
		Object node = getSelectedItem(tree);
		if (node != null) {
			Object draft = getProperty(node, "draft");
			if (draft == null) {
				String ui = (String) getProperty(node, "ui");
				String logic = (String) getProperty(node, "logic");
				if ((ui != null) && (logic != null)) {
					try {
						Object handler = Class.forName(logic).getConstructor(null).newInstance(null);
						draft = parse(ui, handler);
						putProperty(node, "draft", draft);
					} catch (Exception exc) { exc.printStackTrace(); }
				}
			}
			if (draft != null) {
				add(splitpane, draft, 1);
			}
		}
	}
	
	protected void handleException(Throwable throwable) {
		new ExceptionDialog(this, throwable);
	}
	
	public static void main(String[] args) {
		Frame frame = new FrameLauncher("Thinlet Drafts", new Drafts(), 580, 435);
		
		int[] pix = new int[16 * 16];
		for (int x = 0; x < 16; x++) {
			for (int y = 0; y < 16; y++) {
				pix[y * 16 + x] = ((x == 0) || (x == 15) || (y == 0) || (y == 15) ||
					((x >= 3) && (x <= 12) && (y >= 3) && (y <= 4)) ||
					((x >= 7) && (x <= 8) && (y >= 3) && (y <= 12))) ? 0xffffffff : 0xffb01416;
			}
		}
		Image icon = frame.createImage(
			new MemoryImageSource(16, 16, pix, 0, 16));
		frame.setIconImage(icon);
	}
}