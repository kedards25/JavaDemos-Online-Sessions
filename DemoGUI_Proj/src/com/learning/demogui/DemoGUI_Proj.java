package com.learning.demogui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DemoGUI_Proj extends JFrame{
	
	JTextField txtUserName;
	JButton btnSubmit,btnReset;
	//JPanel panel;
	JLabel lblUserNm;
	
	DemoGUI_Proj()
	{
		//panel=new JPanel();
		lblUserNm=new JLabel();
		lblUserNm.setText("User Name:");
		lblUserNm.setBounds(20, 20, 150, 50);
		txtUserName=new JTextField();
		txtUserName.setBounds(200, 30, 150, 20);
		btnSubmit=new JButton("Submit");
		btnSubmit.setBounds(50, 70, 80, 20);
		btnReset=new JButton("Reset");
		btnReset.setBounds(200, 70, 80, 20);
		
		add(lblUserNm);
		add(txtUserName);
		add(btnSubmit);
		add(btnReset);
		
		//add(panel);
		
	
		setTitle("Demo GUI Project");
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		DemoGUI_Proj proj=new DemoGUI_Proj();
		
	}

}
