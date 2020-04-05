package com.learning.gui;

import javax.swing.*;

public class GUI_ComponentsDemo extends JFrame{

	JFrame jFrame;
	JDialog dialog;
	JPanel panel;
	JButton btnSubmit,btnCancel;
	GUI_ComponentsDemo()
	{
//		jFrame=new JFrame();
//		jFrame.setSize(300,300);
//		jFrame.setVisible(true);
//		jFrame.setTitle("Jframe Demo");
		
//		dialog=new JDialog();
//		dialog.setSize(300,150);
//		dialog.setVisible(true);
//		dialog.setTitle("JDialog Demo");
		
		panel=new JPanel();
		btnSubmit=new JButton("Submit");
		btnCancel=new JButton("Cancel");
		panel.add(btnSubmit);
		panel.add(btnCancel);
		
		setSize(300,150);
		setVisible(true);
		setTitle("JButton Demo");
		
		add(panel);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GUI_ComponentsDemo  demo=new GUI_ComponentsDemo();
	}

}
