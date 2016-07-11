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
public class RightUnaryOperatorView<T> extends ElementView{
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_4;
	private JPanel dockPanel;
	private ExpressionLabel xprsnlblName;
	LowerDock<T> dock1;
	public RightUnaryOperatorView(LowerDock<T> dock, String name,Element element, String string) {
		super(element);
		dock1 = dock;
		setBackground(new Color(51, 51, 51));
		
		setLayout(new FlowLayout(FlowLayout.LEFT, 1, 2));
		
		panel = new JPanel();
		panel.setBackground(new Color(51, 51, 51));
		add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setHgap(2);
		panel_1.setBackground(Color.GRAY);
		panel.add(panel_1, BorderLayout.WEST);
		
		panel_2 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_2.getLayout();
		flowLayout_1.setVgap(2);
		panel_2.setBackground(Color.GRAY);
		panel.add(panel_2, BorderLayout.SOUTH);
		
		panel_4 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_4.getLayout();
		flowLayout_2.setVgap(2);
		flowLayout_2.setHgap(2);
		panel_4.setBackground(Color.GRAY);
		panel.add(panel_4, BorderLayout.EAST);
		
		xprsnlblName = new ExpressionLabel();
		xprsnlblName.setToolTipText(string);
		xprsnlblName.setText(name);
		panel_4.add(xprsnlblName);
		
		dockPanel = new JPanel();
		dockPanel.setLayout(new BorderLayout(0, 0));
		dockPanel.add(dock.getView(), BorderLayout.CENTER);
		panel.add(dockPanel, BorderLayout.CENTER);
		
	}

	@Override
	public void animate() throws InterruptedException {
		dock1.getView().animate();
	}

		@Override
	public void setViewColor(Color color) {
		panel_1.setBackground(color);
		panel.setBackground(color);
		panel_2.setBackground(color);
		
	}
	
}
