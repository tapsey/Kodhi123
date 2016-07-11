package com.bad_code.tapsey.codeonetwothree.app.view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class ExpressionLabel extends JLabel{
		public ExpressionLabel() {
		setForeground(Color.WHITE);
		setFont(new Font("Verdana", Font.BOLD, 11));
		setHorizontalAlignment(SwingConstants.CENTER);
		setText("test text");
	}
	
	
}
