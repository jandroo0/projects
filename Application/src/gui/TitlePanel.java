package gui;

import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TitlePanel extends JPanel {
	
	private JLabel title;
	
	public TitlePanel() {
		
		title = new JLabel("17th MOTEL");
		
		title.setHorizontalAlignment(JLabel.CENTER);
//		title.setBorder(BorderFactory.createEmptyBorder(20,0,0,0));
		
		setLayout(new FlowLayout());
		setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		
		add(title);
	}

}
