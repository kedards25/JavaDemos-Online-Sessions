package com.learning.guiprojectdemo;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SecondFrame extends JFrame {

	JLabel lblWelcome;
	
	public SecondFrame() {
		lblWelcome=new JLabel("Welcome to second window");
		
		add(lblWelcome);
		
		setSize(300, 300);
		setVisible(true);
	}
	
}
