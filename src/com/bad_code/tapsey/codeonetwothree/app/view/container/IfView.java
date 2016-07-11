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
public class IfView extends ElementView{
	BooleanDock dock;
	UpperDockPane docksPane = new UpperDockPane(DockLocation.IF);
	public  IfView(Element element) {
		super(element);
		setBackground(new Color(51, 51, 51));
		setLayout(new BorderLayout(2, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		add(panel, BorderLayout.WEST);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_1.getLayout();
		flowLayout_2.setVgap(0);
		flowLayout_2.setHgap(0);
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel_1.setBackground(new Color(51, 51, 51));
		add(panel_1, BorderLayout.SOUTH);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.GRAY);
		FlowLayout flowLayout_1 = (FlowLayout) panel_4.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_1.add(panel_4);
		
		ExpressionLabel xprsnlblEndOfIf = new ExpressionLabel();
		xprsnlblEndOfIf.setText("kugumira pano");
		panel_4.add(xprsnlblEndOfIf);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(51, 51, 51));
		FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
		flowLayout.setVgap(0);
		flowLayout.setHgap(0);
		flowLayout.setAlignment(FlowLayout.LEFT);
		add(panel_2, BorderLayout.NORTH);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.GRAY);
		panel_2.add(panel_3);
		
		ExpressionLabel xprsnlblTestText = new ExpressionLabel();
		xprsnlblTestText.setText("Kana ");
		panel_3.add(xprsnlblTestText);
		
		JPanel conditionDockContainer = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) conditionDockContainer.getLayout();
		flowLayout_3.setVgap(0);
		flowLayout_3.setHgap(0);
		panel_3.add(conditionDockContainer);
		dock = new BooleanDock(DockLocation.IF_PARAM);
		conditionDockContainer.add(dock.getView());
		
		ExpressionLabel xprsnlblItaZvinotevera = new ExpressionLabel();
		xprsnlblItaZvinotevera.setText(" ita zvinotevera");
		panel_3.add(xprsnlblItaZvinotevera);
				
		add(docksPane, BorderLayout.CENTER);
	}

	@Override
	public void animate() throws InterruptedException {
		dock.getView().animate();
		
	}

	@Override
	public void setViewColor(Color color) {
		// No this time
		
	}


	public Element<Boolean> getIfConditionElement(){
		return dock.getElement();
	}
	
	public Vector<UpperDock> getDocks(){
		return docksPane.getUpperDocks();
	}

}
