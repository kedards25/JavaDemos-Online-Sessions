package com.learning.mvc_gui.views;

import javax.swing.*;

import com.learning.mvc_gui.models.UserModel;

public class SuccessGUI extends JFrame{

	JLabel lblSuccess;

	public SuccessGUI(UserModel model) {

		lblSuccess=new JLabel();
		lblSuccess.setText("Welcome "+model.getUserName());
		lblSuccess.setBounds(20, 100, 150, 20);
		
		add(lblSuccess);
		
		setTitle("Success");
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	}
	
}
