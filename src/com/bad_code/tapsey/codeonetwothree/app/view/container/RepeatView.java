package com.bad_code.tapsey.codeonetwothree.app.view.container;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import com.bad_code.tapsey.codeonetwothree.app.controler.BooleanDock;
import com.bad_code.tapsey.codeonetwothree.app.controler.Element;
import com.bad_code.tapsey.codeonetwothree.app.controler.IntDock;
import com.bad_code.tapsey.codeonetwothree.app.controler.UpperDock;
import com.bad_code.tapsey.codeonetwothree.app.controler.UpperDockPane;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.view.ElementView;
import com.bad_code.tapsey.codeonetwothree.app.view.ExpressionLabel;

@SuppressWarnings("serial")
public class RepeatView extends ElementView {
	IntDock bd;
	UpperDockPane docksPane = new UpperDockPane(DockLocation.REPEAT);
	public RepeatView(Element element) {
		super(element);
		setBackground(new Color(51, 51, 51));
		setLayout(new BorderLayout(2, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 51, 51));
		FlowLayout flowLayout_1 = (FlowLayout) panel.getLayout();
		flowLayout_1.setVgap(0);
		flowLayout_1.setHgap(0);
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		add(panel, BorderLayout.NORTH);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 102, 0));
		panel.add(panel_4);
		
		ExpressionLabel xprsnlblWhile = new ExpressionLabel();
		xprsnlblWhile.setText("Dzokorora ka");
		panel_4.add(xprsnlblWhile);
		
		JPanel conditionDockContainer = new JPanel();
		conditionDockContainer.setLayout(new BorderLayout(0, 0));
		bd = new IntDock(DockLocation.REPEAT_CONDTION);
		conditionDockContainer.add(bd.getView(), BorderLayout.CENTER);
		panel_4.add(conditionDockContainer);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 102, 0));
		add(panel_1, BorderLayout.WEST);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(51, 51, 51));
		FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
		flowLayout.setVgap(0);
		flowLayout.setHgap(0);
		flowLayout.setAlignment(FlowLayout.LEFT);
		add(panel_2, BorderLayout.SOUTH);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 102, 0));
		panel_2.add(panel_3);
		
		ExpressionLabel xprsnlblEndOfWhile = new ExpressionLabel();
		xprsnlblEndOfWhile.setText("dzokororo inogumira pano");
		panel_3.add(xprsnlblEndOfWhile);
		
		
		add(docksPane, BorderLayout.CENTER);
	}

	@Override
	public void animate() throws InterruptedException {
		bd.getView().animate();
		
	}

	@Override
	public void setViewColor(Color color) {
		// NOT NOW
		
	}

	public Element<Integer> getRepeatNumberElement(){
		return bd.getElement();
	}
	
	public Vector<UpperDock> getDocks(){
		return docksPane.getUpperDocks();
	}
}
