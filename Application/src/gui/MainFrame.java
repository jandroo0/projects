package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	private static final int WIDTH = 400, HEIGHT = 500;
	
	private TitlePanel titlePanel;
	private FormPanel formPanel;
	
	public MainFrame() {
		super("Application 1.0");
		
		setSize(WIDTH, HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		titlePanel = new TitlePanel();
		formPanel = new FormPanel();
		
		setLayout(new BorderLayout());
		
		add(titlePanel, BorderLayout.NORTH);
		add(formPanel, BorderLayout.CENTER);
	
	}

}
