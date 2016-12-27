package com.bad_code.tapsey.codeonetwothree.environment.view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

import defaultvalues.Constants;
import com.bad_code.tapsey.codeonetwothree.app.view.ExpressionLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.Box;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Dialog.ModalityType;

public class About extends JDialog {
	private JTextArea textField;
	

	About(){
		setModalityType(ModalityType.APPLICATION_MODAL);

		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setType(Type.UTILITY);
		setAlwaysOnTop(true);
		setResizable(false);
		setSize(new Dimension(600, 500));
		setLocationRelativeTo(null);
		
		setBackground(Color.decode(Constants.BACK_COLOR));
		setTitle("About");
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.decode(Constants.BACK_COLOR));
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		ExpressionLabel xprsnlblTestText_1 = new ExpressionLabel();
		xprsnlblTestText_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(xprsnlblTestText_1);
		xprsnlblTestText_1.setBackground(Color.RED);
		xprsnlblTestText_1.setText("");
		xprsnlblTestText_1.setIcon(new ImageIcon(About.class.getResource("/res/about_logo.png")));
		
		ExpressionLabel xprsnlblTestText = new ExpressionLabel();
		xprsnlblTestText.setAlignmentX(Component.CENTER_ALIGNMENT);
		xprsnlblTestText.setText("Version: .0");
		panel.add(xprsnlblTestText);
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 40));
		panel.add(rigidArea);
		
		textField = new JTextArea();
		textField.setLineWrap(true);
		textField.setWrapStyleWord(true);
		textField.setForeground(Color.WHITE);
		textField.setEditable(false);
		textField.setBorder(null);
		textField.setBackground(Color.decode(Constants.BACK_COLOR));
		textField.setMaximumSize(new Dimension(500, 180));
		textField.setText("Kodhi _ 1 2 3 is a graphical computer programming tool. The aim is for users to be able to learn computer programming without worrying about syntax. It was developed by Tapiwanashe Matangira and Evidence Hukuimwe.");
		
		panel.add(textField);
		
		ExpressionLabel xprsnlblkodhidzatapsey = new ExpressionLabel();
		xprsnlblkodhidzatapsey.setAlignmentX(Component.CENTER_ALIGNMENT);
		xprsnlblkodhidzatapsey.setText("@Kodhi_dzaTapsey  2016");
		panel.add(xprsnlblkodhidzatapsey);
		

		
	}

}
