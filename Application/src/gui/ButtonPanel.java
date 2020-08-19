package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JPanel;

import model.Guest;

public class ButtonPanel extends JPanel{
	
	JButton reserveButton;
	
	FormListener formListener;
	
	public ButtonPanel() {
		reserveButton = new JButton("Reserve");
	
		reserveButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (formListener != null) {
					formListener.registerGuest();
				}
			}

		});
		
		setLayout(new FlowLayout());
		
		add(reserveButton);
	}
	
	public void setFormListener(FormListener listener) {
		this.formListener = listener;
	}
}
