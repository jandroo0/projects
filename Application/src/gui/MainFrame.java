package gui;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	private static final int WIDTH = 500, HEIGHT = 800;
	
	public MainFrame() {
		super("Application 1.0");
		
		setSize(WIDTH, HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
