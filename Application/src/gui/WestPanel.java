package gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Properties;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

public class WestPanel extends JPanel {

	PlaceholderTextField nameField = new PlaceholderTextField();
	PlaceholderTextField birthDateField = new PlaceholderTextField();
	
	UtilDateModel arrivalModel;
	JDatePanelImpl arrivalDatePanel;
	JDatePickerImpl arrivalDatePicker;
	
	JCheckBox smokeCheck;
	
	public WestPanel() {

		nameField = new PlaceholderTextField();
		birthDateField = new PlaceholderTextField();

		nameField.setPlaceholder("Name");
		birthDateField.setPlaceholder("Birth Date");

		arrivalModel = new UtilDateModel();

		Properties p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");

		arrivalDatePanel = new JDatePanelImpl(arrivalModel, p);

		arrivalDatePicker = new JDatePickerImpl(arrivalDatePanel, new DateLabelFormatter());
		
		arrivalDatePicker.getComponent(0).setPreferredSize(new Dimension(151, 28)); // JFormattedTextField
		arrivalDatePicker.getComponent(1).setPreferredSize(new Dimension(30,33)); // JButton
		
		smokeCheck = new JCheckBox("Smoking Room");

		layoutComponents();

	}

	private void layoutComponents() {

		setLayout(new GridBagLayout());
		setBorder(BorderFactory.createEmptyBorder(0, 12, 0, 6));

		GridBagConstraints gc = new GridBagConstraints();

		// west panel grid layout
		
		gc.insets = new Insets(10, 0, 10, 0);

		// first row

		gc.gridy = 0;
		gc.gridx = 0;

		// name field
		gc.anchor = GridBagConstraints.CENTER;

		add(nameField, gc);

		// next row;
		
		gc.gridy++;
		gc.gridx = 0;

		// birthdate field
		gc.anchor = GridBagConstraints.CENTER;

		add(birthDateField, gc);
		
		// next row
		
		gc.gridy++;
		gc.gridx = 0;
		
		// arrival date picker
		
		add(arrivalDatePicker, gc);
		
		// next row
		
		gc.gridy++;
		gc.gridx = 0;
		
		// smoke check box
		gc.anchor = GridBagConstraints.CENTER;
		add(smokeCheck, gc);
		
	}


	// getters
	public PlaceholderTextField getNameField() {
		return nameField;
	}

	public PlaceholderTextField getBirthDateField() {
		return birthDateField;
	}

	public JDatePickerImpl getArrivalDatePicker() {
		return arrivalDatePicker;
	}

	public JCheckBox getSmokeCheck() {
		return smokeCheck;
	}
}