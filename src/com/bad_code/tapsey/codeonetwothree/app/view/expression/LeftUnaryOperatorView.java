package com.bad_code.tapsey.codeonetwothree.app.view.expression;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import com.bad_code.tapsey.codeonetwothree.app.controler.Element;
import com.bad_code.tapsey.codeonetwothree.app.controler.LowerDock;
import com.bad_code.tapsey.codeonetwothree.app.view.ElementView;
import com.bad_code.tapsey.codeonetwothree.app.view.ExpressionLabel;

@SuppressWarnings("serial")
public class LeftUnaryOperatorView<T> extends ElementView{
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_4;
	private ExpressionLabel expressionLabel;
	private JPanel panel_3;
	private JPanel dockContainer;
	private LowerDock<T> dock1;
	public LeftUnaryOperatorView(LowerDock<T> dock ,String name,Element element, String string) {
		super(element);
		dock1 = dock;
		setBackground(new Color(51, 51, 51));
		setLayout(new FlowLayout(FlowLayout.LEFT, 1, 2));
					
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 51, 51));
		add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		panel_2 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
		flowLayout.setVgap(2);
		panel_2.setBackground(Color.PINK);
		panel_1.add(panel_2, BorderLayout.SOUTH);
		
		panel_4 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_4.getLayout();
		flowLayout_2.setVgap(2);
		flowLayout_2.setHgap(2);
		panel_4.setBackground(Color.PINK);
		panel_1.add(panel_4, BorderLayout.WEST);
		
		expressionLabel = new ExpressionLabel();
		expressionLabel.setToolTipText(string);
		expressionLabel.setBackground(Color.PINK);
		expressionLabel.setText(name);
		panel_4.add(expressionLabel);
		
		panel_3 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_3.getLayout();
		flowLayout_1.setHgap(2);
		flowLayout_1.setVgap(3);
		panel_3.setBackground(Color.PINK);
		panel_1.add(panel_3, BorderLayout.EAST);
		
		dockContainer = new JPanel();
		dockContainer.setLayout(new BorderLayout(0, 0));
		dockContainer.add(dock.getView(), BorderLayout.CENTER);
		panel_1.add(dockContainer, BorderLayout.CENTER);
		
	}
	
	
	@Override
	public void animate() throws InterruptedException {
		dock1.getView().animate();
	}


	@Override
	public void setViewColor(Color color) {
		expressionLabel.setBackground(color);
		panel_1.setBackground(color);
		panel_2.setBackground(color);
		panel_3.setBackground(color);
		
	}


}
