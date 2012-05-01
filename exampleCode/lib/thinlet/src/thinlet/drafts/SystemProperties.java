package thinlet.drafts;

import java.applet.*;
import java.awt.*;
import java.util.*;
import thinlet.*;

public class SystemProperties {
	
	private static final String[] KEYS = { "java.version", "java.vendor",
		"java.vendor.url", "java.home", "java.vm.specification.version",
		"java.vm.specification.vendor", "java.vm.specification.name",
		"java.vm.version", "java.vm.vendor", "java.vm.name", "java.specification.version",
		"java.specification.vendor", "java.specification.name", "java.class.version",
		"java.class.path", "java.library.path", "java.io.tmpdir", "java.compiler",
		"java.ext.dirs", "os.name", "os.arch", "os.version", "file.separator",
		"path.separator", "line.separator", "user.name", "user.home", "user.dir" }; 
	
	public void loadProperties(Thinlet thinlet, Object table) {
		try {
			Properties properties = System.getProperties();
			for (Enumeration keys = properties.propertyNames(); keys.hasMoreElements();) {
				String key = (String) keys.nextElement();
				addRow(thinlet, table, key, properties.getProperty(key));
			}
		} catch (SecurityException exc) { // inside applet
			for (int i = 0; i < KEYS.length; i++) {
				try {
					addRow(thinlet, table, KEYS[i], System.getProperty(KEYS[i]));
				} catch (SecurityException sexc) {}
			}
		}
	}
	
	private void addRow(Thinlet thinlet, Object table, String key, String value) {
		Object row = Thinlet.create("row");
		Object keycell = Thinlet.create("cell");
		thinlet.setString(keycell, "text", key);
		thinlet.add(row, keycell);
		Object valuecell = Thinlet.create("cell");
		thinlet.setString(valuecell, "text", value);
		thinlet.add(row, valuecell);
		thinlet.add(table, row);
	}
	
	public void updateMeter(Thinlet thinlet, Object free, Object total, Object meter) {
		Runtime runtime = Runtime.getRuntime();
		long fm = runtime.freeMemory();
		long tm = runtime.totalMemory();
		thinlet.setString(free, "text", String.valueOf(fm));
		thinlet.setString(total, "text", String.valueOf(tm));
		thinlet.setInteger(meter, "value", (int) ((tm - fm) * 100L / tm));
	}
	
	public void collectGarbage(Thinlet thinlet, Object free, Object total, Object meter) {
		Runtime.getRuntime().gc();
		updateMeter(thinlet, free, total, meter);
	}
	
	public void loadApplet(Thinlet thinlet, Object codebase, Object docbase, Object locale) {
		for (Component comp = thinlet.getParent(); comp != null; comp = comp.getParent()) {
			if (comp instanceof Applet) {
				Applet applet = (Applet) comp;
				thinlet.setString(codebase, "text", applet.getCodeBase().toString());
				thinlet.setString(docbase, "text", applet.getDocumentBase().toString());
				thinlet.setString(locale, "text", applet.getLocale().toString());
				break;
			}
		}
	}
}