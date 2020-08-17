package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import model.Guest;

public class FormPanel extends JPanel {

	PlaceholderTextField nameField = new PlaceholderTextField();
	PlaceholderTextField birthDateField = new PlaceholderTextField();

	PlaceholderTextField arrivalDateField = new PlaceholderTextField();
	PlaceholderTextField departDateField = new PlaceholderTextField();

	PlaceholderTextField occupantsField = new PlaceholderTextField();

	PlaceholderTextField numberField = new PlaceholderTextField();

	JButton reserveButton = new JButton();
	
	FormListener formListener;

	public FormPanel() {

		nameField = new PlaceholderTextField();
		birthDateField = new PlaceholderTextField();
		arrivalDateField = new PlaceholderTextField();
		departDateField = new PlaceholderTextField();
		occupantsField = new PlaceholderTextField();
		numberField = new PlaceholderTextField();
		
		nameField.setPlaceholder("Name");
		birthDateField.setPlaceholder("Birth Date");
		arrivalDateField.setPlaceholder("Arrival Date");
		departDateField.setPlaceholder("Departure Date");
		occupantsField.setPlaceholder("Occupants");
		numberField.setPlaceholder("Phone #");

		reserveButton = new JButton("Reserve");
		
		reserveButton.addActionListener(new ActionListener( ) {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = nameField.getText();
				String birthDate = birthDateField.getText();
				String arrivalDate = arrivalDateField.getText();
				String departDate = departDateField.getText();
				String occupants = occupantsField.getText();
				String number = numberField.getText();
				
				Guest guest = new Guest(name, birthDate, arrivalDate, departDate, occupants, number);
				
				if(formListener != null) {
					formListener.reserveRoom(guest);
				}
			}
			
		});

		layoutComponents();

	}
	
	public void setFormListener(FormListener listener) {
		this.formListener = listener;
	}

	private void layoutComponents() {

		setLayout(new GridBagLayout());

		GridBagConstraints gc = new GridBagConstraints();

		// form panel grid layout

		gc.weighty = 10;
		gc.weightx = 0;

		// first row

		gc.gridy = 0;
		gc.gridx = 0;

		// name field
		gc.anchor = GridBagConstraints.CENTER;

		add(nameField, gc);

		// next row

		gc.gridy++;
		gc.gridx = 0;

		// birthdate field
		gc.anchor = GridBagConstraints.CENTER;

		add(birthDateField, gc);

		// next row

		gc.gridy++;
		gc.gridx = 0;

		// arrival date field
		gc.anchor = GridBagConstraints.CENTER;

		add(arrivalDateField, gc);

		// next row

		gc.gridy++;
		gc.gridx = 0;

		// depart date field
		gc.anchor = GridBagConstraints.CENTER;

		add(departDateField, gc);

		// next row

		gc.gridy++;
		gc.gridx = 0;

		// occupants field
		gc.anchor = GridBagConstraints.CENTER;

		add(occupantsField, gc);

		// next row

		gc.gridy++;
		gc.gridx = 0;

		// number field
		gc.anchor = GridBagConstraints.CENTER;

		add(numberField, gc);

		// last row
		
		gc.weighty = 12;

		gc.gridy++;
		gc.gridx = 0;

		// reserve button
		gc.anchor = GridBagConstraints.CENTER;

		add(reserveButton, gc);
	}

}
