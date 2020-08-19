package gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Properties;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import model.RoomStyle;

public class EastPanel extends JPanel {
	
	PlaceholderTextField occupantsField = new PlaceholderTextField();
	PlaceholderTextField numberField = new PlaceholderTextField();
	
	UtilDateModel departModel;
	JDatePanelImpl departDatePanel;
	JDatePickerImpl departDatePicker;
	
	JComboBox<RoomStyle> bedStyleBox;
	DefaultComboBoxModel<RoomStyle> bedStyleBoxModel;

	public EastPanel() {
		
		occupantsField = new PlaceholderTextField();
		numberField = new PlaceholderTextField();
		
		occupantsField.setPlaceholder("Occupants");
		numberField.setPlaceholder("Phone #");
		
		bedStyleBox = new JComboBox<RoomStyle>();
		bedStyleBoxModel = new DefaultComboBoxModel<RoomStyle>();

		departModel = new UtilDateModel();
		
		Properties p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		
		departDatePanel = new JDatePanelImpl(departModel, p);
		
		departDatePicker = new JDatePickerImpl(departDatePanel, new DateLabelFormatter());
		
		departDatePicker.getComponent(0).setPreferredSize(new Dimension(151, 28)); // JFormattedTextField
		departDatePicker.getComponent(1).setPreferredSize(new Dimension(30,33)); // JButton
		
		bedStyleBoxModel.addElement(RoomStyle.Twin);
		bedStyleBoxModel.addElement(RoomStyle.Queen);
		bedStyleBoxModel.addElement(RoomStyle.x2Twin);
		bedStyleBoxModel.addElement(RoomStyle.x2Queen);
		
		
		bedStyleBox.setModel(bedStyleBoxModel);

		layoutComponents();

	}

	private void layoutComponents() {

		setLayout(new GridBagLayout());
		setBorder(BorderFactory.createEmptyBorder(0, 6, 0, 12));

		GridBagConstraints gc = new GridBagConstraints();

		// east panel grid layout
		
		gc.insets = new Insets(10, 0, 10, 0);


		// first row

		gc.gridy = 0;
		gc.gridx = 0;

		// occupants field
		gc.anchor = GridBagConstraints.CENTER;

		add(occupantsField, gc);

		// next row;

		gc.gridy++;
		gc.gridx = 0;

		// number field
		gc.anchor = GridBagConstraints.CENTER;

		add(numberField, gc);
		
		// next row
		
		gc.gridy++;
		gc.gridx = 0;
		
		// arrival date picker
		
		add(departDatePicker, gc);
		
		// next row
		
		gc.gridy++;
		gc.gridx = 0;
		
		// bedstyle combo box 
		
		add(bedStyleBox, gc);

	}
	
	// getters

	public PlaceholderTextField getOccupantsField() {
		return occupantsField;
	}

	public PlaceholderTextField getNumberField() {
		return numberField;
	}

	public JDatePickerImpl getDepartDatePicker() {
		return departDatePicker;
	}

	public JComboBox<RoomStyle> getBedStyleBox() {
		return bedStyleBox;
	}
	
}
