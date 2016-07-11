package com.bad_code.tapsey.codeonetwothree.environment.view;

import javax.swing.JPanel;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Color;

public class BottomSpace extends JPanel{
	public BottomSpace() {
		setBackground(new Color(51, 51, 51));
		
		Component verticalStrut = Box.createVerticalStrut(250);
		add(verticalStrut);
	}

}
