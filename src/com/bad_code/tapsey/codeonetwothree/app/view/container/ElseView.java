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
public class ElseView extends ElementView{
	UpperDockPane ifDocksPane = new UpperDockPane(DockLocation.IF_ELSE);
	UpperDockPane elseDocksPane = new UpperDockPane(DockLocation.IF_ELSE);
	BooleanDock dock;
	public ElseView(Element element) {
		super(element);
		setBackground(new Color(51, 51, 51));
		setLayout(new FlowLayout(FlowLayout.LEFT,2,0));
		JPanel rootPanel = new JPanel();
		rootPanel.setBackground(new Color(51, 51, 51));
		rootPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 51, 51));
		FlowLayout flowLayout_2 = (FlowLayout) panel.getLayout();
		flowLayout_2.setVgap(0);
		flowLayout_2.setHgap(0);
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		rootPanel.add(panel, BorderLayout.NORTH);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.GRAY);
		panel.add(panel_8);
		
		ExpressionLabel xprsnlblIf = new ExpressionLabel();
		xprsnlblIf.setText("Kana ");
		panel_8.add(xprsnlblIf);
		
		JPanel conditionDockContainer = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) conditionDockContainer.getLayout();
		flowLayout_3.setVgap(0);
		flowLayout_3.setHgap(0);
		panel_8.add(conditionDockContainer);
		dock = new BooleanDock(DockLocation.IF_ELSE_PARAM);
		conditionDockContainer.add(dock.getView());
		
		ExpressionLabel xprsnlblItaZvinotevera = new ExpressionLabel();
		xprsnlblItaZvinotevera.setText(" ita zvinotevera");
		panel_8.add(xprsnlblItaZvinotevera);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		rootPanel.add(panel_1, BorderLayout.WEST);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(51, 51, 51));
		FlowLayout flowLayout_1 = (FlowLayout) panel_2.getLayout();
		flowLayout_1.setVgap(0);
		flowLayout_1.setHgap(0);
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		rootPanel.add(panel_2, BorderLayout.SOUTH);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.GRAY);
		panel_2.add(panel_7);
		
		ExpressionLabel xprsnlblEndOfElse = new ExpressionLabel();
		xprsnlblEndOfElse.setText("zvoperera pano");
		panel_7.add(xprsnlblEndOfElse);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		rootPanel.add(panel_3, BorderLayout.CENTER);
		
		add(rootPanel);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.Y_AXIS));
		
		panel_3.add(ifDocksPane);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(51, 51, 51));
		FlowLayout flowLayout = (FlowLayout) panel_4.getLayout();
		flowLayout.setVgap(0);
		flowLayout.setHgap(0);
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_3.add(panel_4);
		
		JPanel panel_6 = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) panel_6.getLayout();
		flowLayout_4.setVgap(1);
		panel_6.setBackground(Color.GRAY);
		panel_4.add(panel_6);
		
		ExpressionLabel xprsnlblElse = new ExpressionLabel();
		xprsnlblElse.setText("kana zvaramba ita zvinotevera");
		panel_6.add(xprsnlblElse);
				
		panel_3.add(elseDocksPane);
	}

	@Override
	public void animate() throws InterruptedException {
		dock.getView().animate();
	
	}

	@Override
	public void setViewColor(Color color) {
		//Not now
		
	}
	
//	public void reAdaptElseBody(Vector<ElseDock> bodyDocks) {
//		elseElseDockContainer.removeAll();
//		System.out.println("bodydock adapting  else for " + bodyDocks.size()+ " items");
//		for (int i = 0; i < bodyDocks.size(); i++) {
//			elseElseDockContainer.add(bodyDocks.get(i).getView());
//			bodyDocks.get(i).setPosition(i);
//		}
//		
//	}
	
		
	public Element<Boolean> getIfElseConditionElement(){
		return dock.getElement();
	}
	
	public Vector<UpperDock> getIfDocks(){
		return ifDocksPane.getUpperDocks();
	}
	public Vector<UpperDock> getElseDocks(){
		return elseDocksPane.getUpperDocks();
	}

}
