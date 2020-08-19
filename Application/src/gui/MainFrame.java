package gui;

import java.awt.BorderLayout;
import java.util.Date;

import javax.swing.JFrame;

import model.Guest;

public class MainFrame extends JFrame {
	
	private static final int WIDTH = 400, HEIGHT = 500;
	
	private TitlePanel titlePanel;
	private WestPanel westPanel;
	private EastPanel eastPanel;
	private ButtonPanel buttonPanel;
	
	public MainFrame() {
		super("17TH MOTEL RESERVE");
		
		setSize(WIDTH, HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		titlePanel = new TitlePanel();
		westPanel = new WestPanel();
		eastPanel = new EastPanel();
		buttonPanel = new ButtonPanel();
		
		buttonPanel.setFormListener(new FormListener( ) {

			@Override
			public void registerGuest() {
				
				String name = westPanel.getNameField().getText();
				String birthDate = westPanel.getBirthDateField().getText();
				Date arrivalDate = (Date) westPanel.getArrivalDatePicker().getModel().getValue();
				
				String occupants = eastPanel.getOccupantsField().getText();
				String number = eastPanel.getNumberField().getText();
				Date departDate = (Date) eastPanel.getDepartDatePicker().getModel().getValue();

				Guest guest = new Guest(name, birthDate, arrivalDate, departDate, occupants, number);
				
				System.out.println("New room reserved:\n" + guest.toString());
				
			}
			
		});
		
		setLayout(new BorderLayout());
		
		add(titlePanel, BorderLayout.NORTH);
		add(westPanel, BorderLayout.WEST);
		add(eastPanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
	
	
	}

}
