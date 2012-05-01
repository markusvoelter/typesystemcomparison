package thinlet.drafts;

import java.awt.*;
import java.util.*;

public class ChartBean extends Component {
	
	private static int[] colors = { 0x2f505f, 0x207f00, 0x9fa0bf, 0x203f4f,
		0xaf6030, 0x8f3f6f, 0xa03f4f, 0x907f40, 0x603fb0, 0xff8000 };
	private static Random random = new Random();
	
	private int[] values = new int[32];
	
	public ChartBean() {
		update();
	}
	
	public void paint(Graphics g) {
		Dimension d = getSize();
		g.setColor(Color.white);
		g.fillRect(1, 1, d.width - 2, d.height - 2);
		g.setColor(Color.lightGray);
		g.drawRect(0, 0, d.width - 1, d.height - 1);
		for (int i = 0; i < (d.width - 20) / 10; i++) {
			int value = values[i % values.length] * (d.height - 20) / 100;
			g.setColor(new Color(colors[i % colors.length]));
			g.fillRect(10 + i * 10, d.height - value -10, 8, value);
		}
	}
	
	public void update() {
		for (int i = 0; i < values.length; i++) {
			values[i] = 10 + Math.abs(random.nextInt() % 90);
		}
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(240, 120);
	}
}