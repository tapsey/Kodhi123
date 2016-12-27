package com.bad_code.tapsey.codeonetwothree.environment.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import com.bad_code.tapsey.codeonetwothree.app.model.expressions.container.MyClass;
import com.bad_code.tapsey.codeonetwothree.app.view.ExpressionLabel;
import com.bad_code.tapsey.codeonetwothree.app.view.container.MyClassView;

import java.awt.Font;
import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Dialog.ModalityType;
import java.awt.Window.Type;

@SuppressWarnings("serial")
public class ClassInitialiser extends JDialog {
	private JTextField textField;
	JButton btnNewButtonOK;
	JButton btnNewButtonCancel;
	JPanel codePanel;

	public ClassInitialiser(JPanel panelin) {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setResizable(false);
		setType(Type.POPUP);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setAlwaysOnTop(true);
		codePanel = panelin;
		getContentPane().setLayout(new BorderLayout(0, 0));
		setTitle("Class");
		setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 102, 102));
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		ExpressionLabel xprsnlblIpaZita = new ExpressionLabel();
		xprsnlblIpaZita.setFont(new Font("Verdana", Font.BOLD, 14));
		xprsnlblIpaZita.setText("Ipa zita");
		xprsnlblIpaZita.setBounds(0, 0, 334, 31);
		panel.add(xprsnlblIpaZita);

		textField = new JTextField();
		textField.setToolTipText("Enter class name here.");
		textField.setFont(new Font("Tahoma", Font.BOLD, 12));

		textField.setColumns(10);
		textField.setBounds(56, 35, 222, 23);
		panel.add(textField);

		btnNewButtonCancel = new JButton("Cancel");
		btnNewButtonCancel.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButtonCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ClassInitialiser.this.dispose();
			}
		});
		btnNewButtonCancel.setBounds(189, 69, 89, 23);
		panel.add(btnNewButtonCancel);

		btnNewButtonOK = new JButton("OK");
		btnNewButtonOK.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButtonOK.setEnabled(false);
		btnNewButtonOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyClass c = new MyClass(textField.getText());
				codePanel.removeAll();
				codePanel.add(((MyClassView)c.getView()), BorderLayout.CENTER);				
				ClassInitialiser.this.dispose();
				Window.repaintPane();
			}
		});
		btnNewButtonOK.setBounds(56, 69, 89, 23);
		panel.add(btnNewButtonOK);

		textField.addCaretListener(new CaretListener() {
			
			@Override
			public void caretUpdate(CaretEvent e) {
				if (textField.getText() != null
						&& textField.getText().length() > 0) {

					btnNewButtonOK.setEnabled(true);
				}else{
					btnNewButtonOK.setEnabled(false);
				}
				
			}
		});
		
		setLocation(80, 80);
		setSize(332, 141);
		setVisible(true);
	}

}
