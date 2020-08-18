package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Properties;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

public class RoomPanel extends JPanel {

	UtilDateModel arrivalModel;
	JDatePanelImpl arrivalDatePanel;
	JDatePickerImpl arrivalDatePicker;
	
	UtilDateModel departModel;
	JDatePanelImpl departDatePanel;
	JDatePickerImpl departDatePicker;

	public RoomPanel() {
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

		layoutComponents();

	}

	private void layoutComponents() {

		setLayout(new GridBagLayout());
		setBorder(BorderFactory.createEmptyBorder(0, 12, 0, 12));

		GridBagConstraints gc = new GridBagConstraints();

		// form panel grid layout

		// first row

		gc.gridy = 0;
		gc.gridx = 0;

		gc.insets = new Insets(10, 0, 10, 0);

		// arrival date picker
		gc.anchor = GridBagConstraints.CENTER;

		add(arrivalDatePicker, gc);

		// first row

		gc.gridy = 2;
		gc.gridx = 0;

		gc.insets = new Insets(10, 0, 10, 0);

		// arrival date picker
		gc.anchor = GridBagConstraints.CENTER;

		add(departDatePicker, gc);

	}
}
