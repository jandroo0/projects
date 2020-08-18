package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import model.RoomStyle;

public class BedPanel extends JPanel {
	
	JComboBox<RoomStyle> bedStyleBox;
	DefaultComboBoxModel<RoomStyle> bedStyleBoxModel;

	public BedPanel() {
		
		bedStyleBox = new JComboBox<RoomStyle>();
		bedStyleBoxModel = new DefaultComboBoxModel<RoomStyle>();
		
		bedStyleBoxModel.addElement(RoomStyle.Twin);
		bedStyleBoxModel.addElement(RoomStyle.Queen);
		bedStyleBoxModel.addElement(RoomStyle.x2Twin);
		bedStyleBoxModel.addElement(RoomStyle.x2Queen);
		
		
		bedStyleBox.setModel(bedStyleBoxModel);
		
		
		layoutComponents();

	}

	private void layoutComponents() {

		setLayout(new GridBagLayout());
		setBorder(BorderFactory.createEmptyBorder(12, 0, 6, 12));
		GridBagConstraints gc = new GridBagConstraints();

		// form panel grid layout
		
		gc.anchor = GridBagConstraints.LINE_START;
		gc.weighty = 1;

		// first row

		gc.gridy = 0;
		gc.gridx = 0;
		
		add(bedStyleBox,  gc);

	}

}


//class Bed {
//	
//	private int id;
//	private RoomStyle bedStyle; 
//	
//	public Bed(int id, RoomStyle bedStyle) {
//		this.id = id;
//		this.bedStyle = bedStyle;
//	}
//	
//	public String toString() {
//		switch
//	}
//}