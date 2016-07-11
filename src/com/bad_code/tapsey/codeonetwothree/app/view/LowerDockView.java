package com.bad_code.tapsey.codeonetwothree.app.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import com.bad_code.tapsey.codeonetwothree.app.controler.LowerDock;
import com.bad_code.tapsey.codeonetwothree.app.model.Data;

@SuppressWarnings("serial")
public class LowerDockView extends DockView {

	@SuppressWarnings("rawtypes")
	LowerDock d;
	ExpressionTextField expressionTextField;
	ArrayList<Data<String>> literalInputData = new ArrayList<Data<String>>();

	public LowerDockView(@SuppressWarnings("rawtypes") LowerDock din) {
		this.d = din;
		setLayout(new BorderLayout(0, 0));
		expressionTextField = new ExpressionTextField();
		expressionTextField.setForeground(new Color(51, 51, 204));
		expressionTextField.setFont(new Font("Verdana", Font.BOLD, 10));
		expressionTextField.setColumns(8);
		add(expressionTextField, BorderLayout.CENTER);

		expressionTextField.addCaretListener(new CaretListener() {
			
			@Override
			public void caretUpdate(CaretEvent e) {
				if (expressionTextField.getText() != null
						&& expressionTextField.getText().length() > 0) {

				}else{
					
				}
				
			}
		});
		
		addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				//No need for this

			}

			@Override
			public void mousePressed(MouseEvent e) {
				//No need for this

			}

			@Override
			public void mouseExited(MouseEvent e) {
				
				LowerDockView.this.setBackground(Color.WHITE);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				
				LowerDockView.this.setBackground(Color.GREEN);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				
				d.dock();
			}
		});

		expressionTextField.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				
				e.consume();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				
				e.consume();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				expressionTextField.setBackground(Color.WHITE);

			}

			@Override
			public void mouseEntered(MouseEvent e) {

				expressionTextField.setBackground(Color.GREEN);

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				d.dock();

			}
		});
		
		
	}

	@Override
	public void animate() throws InterruptedException {

		setBackground(Color.GREEN);
		expressionTextField.setBackground(Color.GREEN);
		Thread.sleep(500);
		setBackground(Color.WHITE);
		expressionTextField.setBackground(Color.WHITE);
	}


	public void unDockChild() {
		d.unDock();
	}

	public void clearDock() {
		this.removeAll();

		Component horizontalStrut = Box.createHorizontalStrut(50);
		add(horizontalStrut, BorderLayout.SOUTH);

		Component verticalStrut_1 = Box.createVerticalStrut(10);
		add(verticalStrut_1, BorderLayout.WEST);
		System.out.println("dock cleared");
	}

	public void restoreDock() {
		setBackground(Color.WHITE);
		expressionTextField.setBackground(Color.WHITE);
		this.removeAll();
		this.add(expressionTextField, BorderLayout.CENTER);
	}

	@Override
	public String getInput() {
		expressionTextField.setBackground(Color.WHITE);
		setBackground(Color.WHITE);
		return expressionTextField.getText();
	}
	
	public void dockIsNull(){
		
		expressionTextField.setBackground(Color.RED);
		setBackground(Color.RED);
	}

}
