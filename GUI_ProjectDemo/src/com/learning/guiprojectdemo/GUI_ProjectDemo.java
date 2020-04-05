package com.learning.guiprojectdemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI_ProjectDemo extends JFrame {
	
	JTextField txtUser;
	JLabel lblUserNm,lblGreet;
	JButton btnSubmit,btnCancel;
	
	public GUI_ProjectDemo() {
		
		lblUserNm=new JLabel("Enter your name");
		lblUserNm.setBounds(20, 20, 150, 30);
		
		lblGreet=new JLabel();
		lblGreet.setBounds(80, 100, 180, 30);
		
		txtUser=new JTextField();
		txtUser.setBounds(160,20, 110, 30);
		
		btnSubmit=new JButton("Submit");
		btnSubmit.setBounds(40,60, 80, 20);
		//btnSubmit is getting associated with 
		//actionPerformed handler using addActionListener
		btnSubmit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				String val=txtUser.getText();
//				lblGreet.setText("Welcome "+val);
				setVisible(false);
				SecondFrame frame=new SecondFrame();
				
			}
		});
		btnCancel=new JButton("Cancel");
		btnCancel.setBounds(170,60, 80, 20);
		btnCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtUser.setText("");
				
			}
		});
		add(lblUserNm);
		add(txtUser);
		add(btnSubmit);
		add(btnCancel);
		add(lblGreet);
		//SLV
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
		
		
	}
	
	
	
	public static void main(String[] args) {
		GUI_ProjectDemo demo=new GUI_ProjectDemo();
	}

	

}
