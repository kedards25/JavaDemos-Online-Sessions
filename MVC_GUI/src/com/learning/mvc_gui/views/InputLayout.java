package com.learning.mvc_gui.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.learning.mvc_gui.controller.UserController;
import com.learning.mvc_gui.models.UserModel;

public class InputLayout extends JFrame{

	JLabel lblUserNm,lblUserPwd;
	JTextField txtUserName,txtPassword;
	JButton btnSubmit,btnReset;
	
	UserController controller;
	UserModel user;
	public InputLayout() {
		//initialize all the objects here
		txtUserName=new JTextField();
		txtPassword=new JTextField();
		btnSubmit=new JButton("Login");
		btnReset=new JButton("reset");
		lblUserNm=new JLabel("Enter your name");
		lblUserPwd=new JLabel("Enter your password");
		controller=new UserController();
		
		//align controls using setBounds
		lblUserNm.setBounds(50, 50, 100, 50);
		txtUserName.setBounds(180, 60, 100, 20);
		
		lblUserPwd.setBounds(50, 150, 100, 50);
		txtPassword.setBounds(180, 160, 100, 20);
		
		btnSubmit.setBounds(50, 250, 80, 30);
		btnReset.setBounds(200, 250, 80, 30);
		
		
		//add all the components to jframe
		add(lblUserNm);
		add(txtUserName);
		add(lblUserPwd);
		add(txtPassword);
		add(btnSubmit);
		add(btnReset);
		
		//set dimensions and layout for jframe
		//SLV=>size,layout,visibility
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
		
		btnSubmit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name=txtUserName.getText();
				String pass=txtPassword.getText();
				user=new UserModel(name, pass);
				boolean isValid=controller.verifyUser(user);
				if (isValid) {
					SuccessGUI success=new SuccessGUI(user);
					setVisible(false);
					success.setVisible(true);
				}
				else
				{
					FailureGUI error=new FailureGUI();
					setVisible(false);
					error.setVisible(true);
				}
			}
		});
		
		btnReset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtUserName.setText("");
				txtPassword.setText("");
				
			}
		});
	}
		public static void main(String[] args) {
			InputLayout layout=new InputLayout();
		}
	
}
