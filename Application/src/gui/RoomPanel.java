package gui;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class RoomPanel extends JPanel {
	BedPanel bedPanel;
	RoomSelectPanel roomSelectPanel;

	public RoomPanel() {
		bedPanel = new BedPanel();
		roomSelectPanel = new RoomSelectPanel();

		layoutComponents();

	}

	private void layoutComponents() {

		setLayout(new GridLayout(2, 1));
		setBorder(BorderFactory.createEmptyBorder(0, 6, 0, 12));
		
		add(bedPanel);
		add(roomSelectPanel);
		

	}
}
