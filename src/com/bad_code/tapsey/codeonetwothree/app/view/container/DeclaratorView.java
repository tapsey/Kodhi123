package com.bad_code.tapsey.codeonetwothree.app.view.container;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import com.bad_code.tapsey.codeonetwothree.app.controler.Element;
import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.datatypes.Variable;
import com.bad_code.tapsey.codeonetwothree.app.model.expressions.container.Declarator;
import com.bad_code.tapsey.codeonetwothree.app.view.ElementView;
import com.bad_code.tapsey.codeonetwothree.app.view.ExpressionLabel;
import com.bad_code.tapsey.codeonetwothree.app.view.ExpressionTextField;

@SuppressWarnings("serial")
public class DeclaratorView extends ElementView{
	private ExpressionTextField textField;
	ExpressionLabel xprsnlblTestText;
	Declarator dec;
	JPanel panel;
	public DeclaratorView(Declarator dec) {
		super(dec);
		setBackground(new Color(51, 51, 51));
		this.dec = dec;
		FlowLayout flowLayout = (FlowLayout) getLayout();
		flowLayout.setVgap(0);
		flowLayout.setHgap(2);
		flowLayout.setAlignment(FlowLayout.LEFT);
		
		panel = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel.getLayout();
		flowLayout_1.setHgap(3);
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		flowLayout_1.setVgap(3);
		add(panel);
		xprsnlblTestText = new ExpressionLabel();
		panel.add(xprsnlblTestText);
		
		textField = new ExpressionTextField();
		panel.add(textField);
		textField.setColumns(6);
		
		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				//No need at this point
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				//No need at this point
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				//No need at this point
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				//No need at this point
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				DeclaratorView.this.dec.declare(textField.getText());
			}
		});
	}
		
	public void setVariableDataTypeName(DataType dataType, int type){
		
		if(type == Variable.CONST){
			xprsnlblTestText.setText( dataType.getDesc());
			
		}else if (type == Variable.VAR ){
			xprsnlblTestText.setText( dataType.getDesc());
			
		}
	}
	

	@Override
	public void animate() throws InterruptedException {
		xprsnlblTestText.setBackground(Color.GREEN);
		Thread.sleep(500);
		xprsnlblTestText.setBackground(Color.WHITE);
		
	}



	@Override
	public void setViewColor(Color color) {
		panel.setBackground(color);
		
	}

		
}
