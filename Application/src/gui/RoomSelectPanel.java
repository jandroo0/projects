package gui;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class RoomSelectPanel extends JPanel{
	
	public RoomSelectPanel() {
		JLabel label = new JLabel("HELLO");
		
		setLayout(new BorderLayout()); 
		
		add(label, BorderLayout.CENTER);
	}

}
