package demaciatanks.swinginterface;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class ScriptEditorToolsPanel extends JPanel {

	private static final long serialVersionUID = 931506142278620479L;

	SaveButton button;
	
	public ScriptEditorToolsPanel() {

		button = new SaveButton();
		
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		this.add(Box.createHorizontalGlue());
		this.add(button);
		this.add(Box.createRigidArea(new Dimension(5, 0)));
	}

}
