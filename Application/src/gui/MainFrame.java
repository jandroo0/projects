package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import model.Guest;

public class MainFrame extends JFrame {
	
	private static final int WIDTH = 400, HEIGHT = 500;
	
	private TitlePanel titlePanel;
	private FormPanel formPanel;
	private RoomPanel roomPanel;
	private ButtonPanel buttonPanel;
	
	public MainFrame() {
		super("17TH MOTEL RESERVE");
		
		setSize(WIDTH, HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		titlePanel = new TitlePanel();
		formPanel = new FormPanel();
		roomPanel = new RoomPanel();
		buttonPanel = new ButtonPanel();
		
		formPanel.setFormListener(new FormListener( ) {

			@Override
			public void reserveRoom(Guest guest) {
				System.out.println("New room reserved:\n" + guest.toString());
				
			}
			
		});
		
		setLayout(new BorderLayout());
		
		add(titlePanel, BorderLayout.NORTH);
		add(formPanel, BorderLayout.WEST);
		add(roomPanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
	
	
	}

}
