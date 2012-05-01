package thinlet.drafts;

import java.awt.*;
import thinlet.*;

public class ProgressMonitor implements Runnable {
	
	public void start(Thinlet thinlet) throws Exception {
		thinlet.add(thinlet.parse("progressdialog.xml", this));
	}
	
	private Thinlet thinlet;
	private Object dialog, status, progressbar;
	private Image icon;
	private Thread thread;
	private boolean stopped;
	
	public void init(Thinlet thinlet,
			Object dialog, Object status, Object progressbar, Image icon) {
		this.thinlet = thinlet;
		this.dialog = dialog; this.status = status; this.progressbar = progressbar;
		this.icon = icon;
		thread = new Thread(this);
		stopped = false;
		thread.start();
	}

	public void run() {
		for (int i = 1; !stopped && (i <= 10); i++) {
			thinlet.setString(status, "text", "Completed " + i + " out of 10.");
			thinlet.setInteger(progressbar, "value", i * 10);
			try {
				Thread.sleep(450);
			} catch (InterruptedException ie) {}
		}
		icon.flush(); // animated gif refreshes the whole thinlet continuously
		thinlet.remove(dialog);
	}
	
	public void close() {
		stopped = true;
		thread.interrupt();
	}
	
	public void cancel() {
		stopped = true;
		thread.interrupt();
	}
}