package com.bad_code.tapsey.codeonetwothree.app.view.variable;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.bad_code.tapsey.codeonetwothree.app.controler.Element;
import com.bad_code.tapsey.codeonetwothree.app.model.expressions.container.Declarator;
import com.bad_code.tapsey.codeonetwothree.app.view.ElementView;
import com.bad_code.tapsey.codeonetwothree.app.view.ExpressionLabel;

import java.awt.FlowLayout;

@SuppressWarnings("serial")
public class VariableView extends ElementView {

	ExpressionLabel xprsnlblTestText;
	Color initialColor;
	Declarator dec;
	public VariableView(Declarator dec,Element element) {
		super(element);
		this.dec = dec;
		setBackground(Color.ORANGE);
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		xprsnlblTestText = new ExpressionLabel();
		add(xprsnlblTestText);
		
		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				//no need for this
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				//no need for this
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				//no need for this
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				//no need for this
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				VariableView.this.dec.declare(xprsnlblTestText.getText());
				
			}
		});
	}
	
	
	public void setName(String name){
		
		xprsnlblTestText.setText(name);
	}

	@Override
	public void animate() throws InterruptedException {
		setBackground(Color.GREEN);
		Thread.sleep(500);
		setBackground(initialColor);
	}


	@Override
	public void setViewColor(Color color) {
		initialColor = color;
		setBackground(initialColor);
		
	}
	

}
