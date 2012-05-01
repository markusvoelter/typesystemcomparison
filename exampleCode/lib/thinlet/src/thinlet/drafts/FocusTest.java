package thinlet.drafts;

import thinlet.*;

public class FocusTest {
	
	public void focusLost(Thinlet thinlet, Object tfc) {
		thinlet.requestFocus(tfc);
	}
	
	public void focusGained(Thinlet thinlet, Object tfd) {
		thinlet.requestFocus(tfd);
	}
}