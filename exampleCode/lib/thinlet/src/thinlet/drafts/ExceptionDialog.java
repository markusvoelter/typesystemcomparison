package thinlet.drafts;

import java.io.*;
import thinlet.*;

public class ExceptionDialog {
	
	public ExceptionDialog(Thinlet thinlet, Throwable throwable) {
		try {
			Object dialog = thinlet.parse("/thinlet/drafts/exceptiondialog.xml", this);
			thinlet.setString(dialog, "text", throwable.getClass().getName());
			thinlet.setString(thinlet.find(dialog, "message"), "text", throwable.getMessage());
			StringWriter stacktrace = new StringWriter();
			throwable.printStackTrace(new PrintWriter(stacktrace));
			thinlet.setString(thinlet.find(dialog, "stacktrace"), "text",
				stacktrace.toString().replace('\r', ' ').replace('\t', ' '));
			thinlet.add(dialog);
		} catch (Exception exc) { exc.printStackTrace(); }
	}
	
	public void close(Thinlet thinlet, Object dialog) {
		thinlet.remove(dialog);
	}
}