package com.bad_code.tapsey.codeonetwothree.app.view.container;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import com.bad_code.tapsey.codeonetwothree.app.controler.BooleanDock;
import com.bad_code.tapsey.codeonetwothree.app.controler.Element;
import com.bad_code.tapsey.codeonetwothree.app.controler.UpperDock;
import com.bad_code.tapsey.codeonetwothree.app.controler.UpperDockPane;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.view.ElementView;
import com.bad_code.tapsey.codeonetwothree.app.view.ExpressionLabel;

@SuppressWarnings("serial")
public class DoView extends ElementView {
	BooleanDock dock;
	UpperDockPane docksPane = new UpperDockPane(DockLocation.DO);
	public DoView(Element element) {
		super(element);
		setBackground(new Color(51, 51, 51));

		dock = new BooleanDock(DockLocation.DO);
		setLayout(new BorderLayout(2, 0));

		JPanel panel = new JPanel();
		panel.setBackground(Color.MAGENTA);
//		System.out.println("this is the view wich is going to be added to do side bar "+dock.getView());
//		panel.add(dock.getView());/// tthis is for deguging
		add(panel, BorderLayout.WEST);

		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setVgap(0);
		flowLayout.setHgap(0);
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_1.setBackground(new Color(51, 51, 51));
		add(panel_1, BorderLayout.NORTH);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.MAGENTA);
		panel_1.add(panel_3);

		ExpressionLabel xprsnlblDo = new ExpressionLabel();
		xprsnlblDo.setText("Ita zvinotevera");
		panel_3.add(xprsnlblDo);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(51, 51, 51));
		FlowLayout flowLayout_2 = (FlowLayout) panel_2.getLayout();
		flowLayout_2.setVgap(0);
		flowLayout_2.setHgap(0);
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		add(panel_2, BorderLayout.SOUTH);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.MAGENTA);
		panel_2.add(panel_4);
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 2));

		ExpressionLabel xprsnlblWhile = new ExpressionLabel();
		xprsnlblWhile.setText("Wodzokorora kana ");
		panel_4.add(xprsnlblWhile);

		JPanel conditionDockContainer = new JPanel();
		conditionDockContainer.setBackground(Color.YELLOW);
		conditionDockContainer.setLayout(new BorderLayout(0, 0));
		conditionDockContainer.add(dock.getView(),BorderLayout.CENTER);
		//conditionDockContainer.add(new JButton("dd"), BorderLayout.EAST);
		panel_4.add(conditionDockContainer);
		
		
		add(docksPane, BorderLayout.CENTER);

	}

	@Override
	public void animate() throws InterruptedException {
		dock.getView().animate();
	}

	@Override
	public void setViewColor(Color color) {
		// Not for now

	}

	public Element<Boolean> getDoWhileConditionElement(){
		return dock.getElement();
	}

	public Vector<UpperDock> getDocks(){
		return docksPane.getUpperDocks();
	}
}
