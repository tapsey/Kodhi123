package com.bad_code.tapsey.codeonetwothree.environment.view;

import javax.swing.JPanel;

import defaultvalues.Constants;

import java.awt.Component;
import javax.swing.Box;
import java.awt.Color;

public class BottomSpace extends JPanel{
	public BottomSpace() {
		setBackground(Color.BLACK);
		
		Component verticalStrut = Box.createVerticalStrut(250);
		add(verticalStrut);
	}

}
