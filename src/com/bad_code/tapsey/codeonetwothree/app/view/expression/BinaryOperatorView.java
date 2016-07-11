package com.bad_code.tapsey.codeonetwothree.app.view.expression;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import com.bad_code.tapsey.codeonetwothree.app.controler.Element;
import com.bad_code.tapsey.codeonetwothree.app.controler.LowerDock;
import com.bad_code.tapsey.codeonetwothree.app.view.ElementView;
import com.bad_code.tapsey.codeonetwothree.app.view.ExpressionLabel;

@SuppressWarnings("serial")
// <T> is the input data type
public class BinaryOperatorView<T,K> extends ElementView {
	/**
	 * @wbp.parser.constructor
	 */
	JPanel panel,panel_1,panel_2,panel_5;
	LowerDock<T> dock1, dock2;
	public BinaryOperatorView(String name, Color color, String hint,
			LowerDock<T> dock1, LowerDock<T> dock2,Element element) {
		super(element);
		
		this.dock1=dock1;
		this.dock2=dock2;
		setBackground(new Color(51, 51, 51));
		setLayout(new FlowLayout(FlowLayout.LEFT, 1, 2));
		
		JPanel rootPanel = new JPanel();
		rootPanel.setLayout(new BorderLayout(0, 0));
		panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setHgap(2);
		panel.setBackground(color);
		rootPanel.add(panel, BorderLayout.WEST);

		panel_1 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_1.getLayout();
		flowLayout_1.setVgap(2);
		panel_1.setBackground(color);
		rootPanel.add(panel_1, BorderLayout.SOUTH);

		panel_2 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_2.getLayout();
		flowLayout_2.setHgap(2);
		panel_2.setBackground(color);
		rootPanel.add(panel_2, BorderLayout.EAST);

		JPanel panel_3 = new JPanel();
		rootPanel.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new BorderLayout(0, 0));

		add(rootPanel);
		panel_5 = new JPanel();
		panel_5.setBackground(color);
		panel_3.add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.X_AXIS));

		JPanel dockCont1 = new JPanel();
		panel_5.add(dockCont1);
		dockCont1.setLayout(new BorderLayout(0, 0));
		dockCont1.add(dock1.getView(), BorderLayout.CENTER);
		
		ExpressionLabel xprsnlblDock = new ExpressionLabel();
		xprsnlblDock.setToolTipText(hint);
		xprsnlblDock.setText(" "+name+ " ");
		panel_5.add(xprsnlblDock);
		
		JPanel dockCont2 = new JPanel();
		panel_5.add(dockCont2);
		dockCont2.setLayout(new BorderLayout(0, 0));
		dockCont2.add(dock2.getView(), BorderLayout.CENTER);
		
	}

	@Override
	public void animate() throws InterruptedException {
		dock1.getView().animate();
		dock2.getView().animate();
	}

	
	@Override
	public void setViewColor(Color color) {
		
		panel.setBackground(color);
		panel_1.setBackground(color);
		panel_2.setBackground(color);
		panel_5.setBackground(color);

	}


}
