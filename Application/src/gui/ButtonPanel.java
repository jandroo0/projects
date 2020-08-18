package gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel{
	
	JButton reserveButton;
	
	public ButtonPanel() {
		reserveButton = new JButton("Reserve");
		
		
		setLayout(new FlowLayout());
		
		add(reserveButton);
	}
}
