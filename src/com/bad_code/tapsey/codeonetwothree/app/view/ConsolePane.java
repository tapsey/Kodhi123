package com.bad_code.tapsey.codeonetwothree.app.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

import com.bad_code.tapsey.codeonetwothree.environment.console.JConsole;

@SuppressWarnings("serial")
public class ConsolePane extends JPanel{
	public ConsolePane() {
		setBackground(new Color(51, 51, 51));
		setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setLayout(new BorderLayout(0, 0));
		
		JConsole console = new JConsole();
		add(console, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("Allows user to interact with program at runtime. The user can enter input and get output through the console.");
		panel.setBackground(new Color(102, 102, 102));
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		add(panel, BorderLayout.NORTH);
		
		ExpressionLabel xprsnlblConsole = new ExpressionLabel();
		xprsnlblConsole.setText("Console");
		panel.add(xprsnlblConsole);
	}

}
