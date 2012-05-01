package thinlet.drafts;

import thinlet.*;
import thinlet.common.*;

public class Choosers {
	
	public void chooseDirectory(Thinlet thinlet) {
		new FileChooser(thinlet, FileChooser.DIRECTORY_DIALOG);
	}
}