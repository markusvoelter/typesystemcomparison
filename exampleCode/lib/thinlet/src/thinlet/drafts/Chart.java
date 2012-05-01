package thinlet.drafts;

import thinlet.*;

public class Chart {
	
	public void update(Thinlet thinlet, Object chart) {
		ChartBean chartbean = (ChartBean) thinlet.getComponent(chart, "bean");
		chartbean.update();
		thinlet.repaint(chart);
	}
}