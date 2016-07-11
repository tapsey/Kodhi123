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
import com.bad_code.tapsey.codeonetwothree.app.model.expressions.data.Assignment;
import com.bad_code.tapsey.codeonetwothree.app.view.ElementView;
import com.bad_code.tapsey.codeonetwothree.app.view.ExpressionLabel;

@SuppressWarnings("serial")
public class ForView extends ElementView{
	BooleanDock dock;
	Assignment ass;
	IntDock intDock;
	UpperDockPane docksPane = new UpperDockPane(DockLocation.FOR);
	public ForView(Element element) {
		super(element);
		setBackground(new Color(51, 51, 51));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 51, 51));
		add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 0, 102));
		panel.add(panel_1, BorderLayout.WEST);
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_2.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		flowLayout_1.setVgap(0);
		flowLayout_1.setHgap(0);
		panel_2.setBackground(new Color(51, 51, 51));
		panel.add(panel_2, BorderLayout.SOUTH);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(102, 0, 102));
		panel_2.add(panel_5);
		
		ExpressionLabel xprsnlblEndOfFor = new ExpressionLabel();
		xprsnlblEndOfFor.setText("kugumira pane");
		panel_5.add(xprsnlblEndOfFor);
		
		JPanel panel_3 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_3.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		flowLayout.setVgap(0);
		flowLayout.setHgap(0);
		panel_3.setBackground(new Color(51, 51, 51));
		panel.add(panel_3, BorderLayout.NORTH);
		
		JPanel panel_4 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_4.getLayout();
		flowLayout_2.setVgap(3);
		panel_4.setBackground(new Color(102, 0, 102));
		panel_3.add(panel_4);
		
		ExpressionLabel xprsnlblFor = new ExpressionLabel();
		xprsnlblFor.setText("uchitanga");
		panel_4.add(xprsnlblFor);
		
		JPanel assignmentDock = new JPanel();
		panel_4.add(assignmentDock);
		assignmentDock.setLayout(new BorderLayout(0, 0));
		ass = new Assignment();
		assignmentDock.add(ass.getView(),BorderLayout.CENTER);
		
		ExpressionLabel xprsnlblTo = new ExpressionLabel();
		xprsnlblTo.setText("dzokorora");
		panel_4.add(xprsnlblTo);
		
		JPanel conditionContainer = new JPanel();
		panel_4.add(conditionContainer);
		conditionContainer.setLayout(new BorderLayout(0, 0));
		dock = new BooleanDock(DockLocation.FOR_CONDITION);
		conditionContainer.add(dock.getView(),BorderLayout.CENTER);
		
		ExpressionLabel xprsnlblIterator = new ExpressionLabel();
		xprsnlblIterator.setText("uchiita zvinotevera");
		panel_4.add(xprsnlblIterator);
		
		JPanel increamentDock = new JPanel();
		panel_4.add(increamentDock);
		increamentDock.setLayout(new BorderLayout(0, 0));
		intDock = new IntDock(DockLocation.FOR_CONDITION);
		increamentDock.add(intDock.getView(), BorderLayout.CENTER);
	
		panel.add(docksPane, BorderLayout.CENTER);
	}

	@Override
	public void animate() {
		// TODO Auto-generated method stub
		
	}
	
	public Vector<UpperDock> getDocks(){
		return docksPane.getUpperDocks();
	}
	
	@Override
	public void setViewColor(Color color) {
		// NOT NOW		
	}

	public void assign(boolean animate){
		ass.runElement(animate);
	}
	
	public void increamentElement(boolean animate){
		intDock.getElement().runElement(animate);
	}
	
	public boolean getForCondition(boolean animate){
		dock.getElement().runElement(animate);		
		return dock.getElement().getData();
	}
	
}
