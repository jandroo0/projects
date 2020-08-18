package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class BedPanel extends JPanel {

	JRadioButton twinRadio;
	JRadioButton doubleTwinRadio;
	JRadioButton queenRadio;
	JRadioButton doubleQueenRadio;

	ButtonGroup bedStyleRadio;

	public BedPanel() {

		twinRadio = new JRadioButton("1 Twin");
		doubleTwinRadio = new JRadioButton("2 Twin");
		queenRadio = new JRadioButton("1 Queen");
		doubleQueenRadio = new JRadioButton("2 Queen");

		bedStyleRadio = new ButtonGroup();
		bedStyleRadio.add(twinRadio);
		bedStyleRadio.add(doubleTwinRadio);
		bedStyleRadio.add(queenRadio);
		bedStyleRadio.add(doubleQueenRadio);
		
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

		// twin radio button
		add(twinRadio, gc);

		// queen radio button
		gc.gridy++;

		add(queenRadio, gc);

		// next row

		gc.gridy++;
		gc.gridx = 0;

		// twin radio button
		add(doubleTwinRadio, gc);

		// queen radio button
		gc.gridy++;

		add(doubleQueenRadio, gc);

	}

}
