package com.learning.mvc_gui.views;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FailureGUI extends JFrame {
	JLabel lblError;
	
	public FailureGUI() {
		lblError=new JLabel("Login Failed");
		lblError.setBounds(20, 100, 150, 50);
		
		add(lblError);
		
		setTitle("Error");
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	}
}
