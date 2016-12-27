package com.bad_code.tapsey.codeonetwothree.app.view;

import javax.swing.JButton;

import defaultvalues.Constants;

import java.awt.Color;
import java.awt.Font;

public class MyButton extends JButton{
	
	
	public MyButton() {

		
		setFont(new Font("Tahoma", Font.BOLD, 11));
		setFocusPainted(false);
		setBorder(null);
		setBackground(Color.decode(Constants.BACK_COLOR));
		setForeground(Color.WHITE);
	}

}
