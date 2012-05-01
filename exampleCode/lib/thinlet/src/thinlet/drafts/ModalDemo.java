package thinlet.drafts;

import thinlet.*;
import java.awt.*;

public class ModalDemo {
	
	public void start(Thinlet thinlet, Object previousfield) {
		Object modaldialog = null;
		try {
			modaldialog = thinlet.parse("/thinlet/drafts/modaldialog.xml", this);
		} catch (Exception exc) { exc.printStackTrace(); return; }
		Object field = thinlet.find(modaldialog, "field");
		thinlet.setString(field, "text", String.valueOf(System.currentTimeMillis()));
		thinlet.add(modaldialog);
		
		startModal(thinlet, modaldialog);
		
		String text = thinlet.getString(field, "text");
		thinlet.setString(previousfield, "text", text);
	}
	
	public void close(Thinlet thinlet, Object dialog) {
		thinlet.remove(dialog);
		stopModal();
	}
	
	private void startModal(Thinlet thinlet, Object modaldialog) {
		try {
			EventQueue queue = thinlet.getToolkit().getSystemEventQueue();
			while (thinlet.getParent(modaldialog) != null) {
					AWTEvent event = queue.getNextEvent();
					Object src = event.getSource();
					//if (event instanceof ActiveEvent) { // 1.2+
					//	((ActiveEvent) event).dispatch();
					//} else
					if (src instanceof Component) {
						((Component) src).dispatchEvent(event);
					} else if (src instanceof MenuComponent) {
						((MenuComponent) src).dispatchEvent(event);
					}
			}
		} catch(InterruptedException ie) { ie.printStackTrace(); }
	}
	
	private void stopModal() {
		synchronized (this) {
			notifyAll();
		}
	}
}