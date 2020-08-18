package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Properties;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import model.Guest;

public class FormPanel extends JPanel {

	PlaceholderTextField nameField = new PlaceholderTextField();
	PlaceholderTextField birthDateField = new PlaceholderTextField();
	PlaceholderTextField occupantsField = new PlaceholderTextField();

	PlaceholderTextField numberField = new PlaceholderTextField();

	UtilDateModel arrivalModel;
	JDatePanelImpl arrivalDatePanel;
	JDatePickerImpl arrivalDatePicker;

	UtilDateModel departModel;
	JDatePanelImpl departDatePanel;
	JDatePickerImpl departDatePicker;
	
	JRadioButton twinRadio;
	JRadioButton doubleTwinRadio;
	JRadioButton queenRadio;
	JRadioButton doubleQueenRadio;
	
	ButtonGroup bedStyleRadio;

	JButton reserveButton;

	FormListener formListener;

	public FormPanel() {

		nameField = new PlaceholderTextField();
		birthDateField = new PlaceholderTextField();
		occupantsField = new PlaceholderTextField();
		numberField = new PlaceholderTextField();

		nameField.setPlaceholder("Name");
		birthDateField.setPlaceholder("Birth Date");
		occupantsField.setPlaceholder("Occupants");
		numberField.setPlaceholder("Phone #");

		arrivalModel = new UtilDateModel();
		departModel = new UtilDateModel();

		Properties p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");

		arrivalDatePanel = new JDatePanelImpl(arrivalModel, p);
		departDatePanel = new JDatePanelImpl(departModel, p);

		arrivalDatePicker = new JDatePickerImpl(arrivalDatePanel, new DateLabelFormatter());
		departDatePicker = new JDatePickerImpl(departDatePanel, new DateLabelFormatter());
		
		twinRadio = new JRadioButton("1 Twin");
		doubleTwinRadio = new JRadioButton("2 Twin");
		queenRadio = new JRadioButton("1 Queen");
		doubleQueenRadio = new JRadioButton("2 Queen");
		
		bedStyleRadio = new ButtonGroup();
		bedStyleRadio.add(twinRadio);
		bedStyleRadio.add(doubleTwinRadio);
		bedStyleRadio.add(queenRadio);
		bedStyleRadio.add(doubleQueenRadio);
		

		reserveButton = new JButton("Reserve");

		reserveButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = nameField.getText();
				String birthDate = birthDateField.getText();
				Date arrivalDate = (Date) arrivalDatePicker.getModel().getValue();
				Date departDate = (Date) departDatePicker.getModel().getValue();
				String occupants = occupantsField.getText();
				String number = numberField.getText();

				Guest guest = new Guest(name, birthDate, arrivalDate, departDate, occupants, number);

				if (formListener != null) {
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
		setBorder(BorderFactory.createEmptyBorder(0, 12, 0, 12));

		GridBagConstraints gc = new GridBagConstraints();

		// form panel grid layout

		gc.weighty = .2;

		// first row

		gc.gridy = 0;
		gc.gridx = 0;

		gc.insets = new Insets(10, 0, 10, 0);

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

		// occupants field
		gc.anchor = GridBagConstraints.CENTER;

		add(occupantsField, gc);

		// next row

		gc.gridy++;
		gc.gridx = 0;

		// number field
		gc.anchor = GridBagConstraints.CENTER;

		add(numberField, gc);

		// next row

		gc.gridy++;
		gc.gridx = 0;

		gc.insets = new Insets(10, 0, 10, 0);

		// arrival date picker
		gc.anchor = GridBagConstraints.CENTER;

		add(arrivalDatePicker, gc);

		// next row

		gc.gridy++;
		gc.gridx = 0;

		gc.insets = new Insets(10, 0, 10, 0);

		// arrival date picker
		gc.anchor = GridBagConstraints.CENTER;

		add(departDatePicker, gc);
		
		//next row 
		
		gc.gridy++;
		gc.gridx = 0;
		
		gc.insets = new Insets(10,0,10,0);
		
		// bed style radio buttons
		gc.anchor = GridBagConstraints.LINE_START;
		add(twinRadio, gc);
		gc.anchor = GridBagConstraints.LINE_END;
		add(queenRadio, gc);
		
		// next row 
		
		gc.gridy++;
		
		gc.anchor = GridBagConstraints.LINE_START;
		add(doubleTwinRadio, gc);
		gc.anchor = GridBagConstraints.LINE_END;
		add(doubleQueenRadio, gc);

		// last row

		gc.weighty = 1;

		gc.gridy++;
		gc.gridx = 0;

		gc.insets = new Insets(10, 0, 10, 0);

		// reserve button
		gc.anchor = GridBagConstraints.CENTER;
		add(reserveButton, gc);

	}

}