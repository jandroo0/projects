package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame extends JFrame {
	
	private static final int WIDTH = 500, HEIGHT = 800;
	
	public MainFrame() {
		super("Application 1.0");
		
		setSize(WIDTH, HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
		JLabel label = new JLabel("Hello From mac!");
		
		setLayout(new BorderLayout());
		
		add(label, BorderLayout.CENTER);
	}

}
