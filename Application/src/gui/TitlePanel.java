package gui;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TitlePanel extends JPanel {
	
	private JLabel title;
	
	public TitlePanel() {
		
		title = new JLabel("17th MOTEL");
		
		title.setHorizontalAlignment(JLabel.CENTER);
		
		setLayout(new BorderLayout());
		setBorder(BorderFactory.createEmptyBorder(20,0,0,0));
		
		add(title, BorderLayout.CENTER);
	}

}
