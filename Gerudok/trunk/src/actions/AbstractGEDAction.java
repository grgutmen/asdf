package actions;

import java.awt.event.ActionEvent;
import java.net.URL;

import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public abstract class AbstractGEDAction extends AbstractAction{
	
	public Icon loadIcon(String fileName) {
		URL imageurl = getClass().getResource(fileName);
		Icon icon = null;
		if (imageurl != null) {
			icon = new ImageIcon(fileName);
		}else {
			System.err.println("Resource not found : " + fileName);
		}
		return icon;
	}

}
