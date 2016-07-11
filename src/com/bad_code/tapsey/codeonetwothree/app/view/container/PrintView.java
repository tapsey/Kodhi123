package com.bad_code.tapsey.codeonetwothree.app.view.container;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import com.bad_code.tapsey.codeonetwothree.app.controler.Element;
import com.bad_code.tapsey.codeonetwothree.app.controler.ObjectDock;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.view.ElementView;
import com.bad_code.tapsey.codeonetwothree.app.view.ExpressionLabel;

@SuppressWarnings("serial")
public class PrintView extends ElementView {
	
	ObjectDock sd;
	
	public PrintView(Element element) {
		super(element);
		setBackground(new Color(51, 51, 51));
		setLayout(new FlowLayout(FlowLayout.LEFT, 2, 0));
		
		sd = new ObjectDock(DockLocation.PRINT);
		JPanel panel_3 = new JPanel();
		add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel_3.add(panel, BorderLayout.WEST);
		panel.setBackground(Color.RED);
		
		ExpressionLabel xprsnlblPrint = new ExpressionLabel();
		xprsnlblPrint.setText("nyora");
		panel.add(xprsnlblPrint);
		
		JPanel panel_1 = new JPanel();
		panel_3.add(panel_1, BorderLayout.SOUTH);
		panel_1.setBackground(Color.RED);
		
		JPanel panel_2 = new JPanel();
		panel_3.add(panel_2, BorderLayout.EAST);
		panel_2.setBackground(Color.RED);
		
		JPanel dockContainer = new JPanel();
		panel_3.add(dockContainer, BorderLayout.CENTER);
		dockContainer.setLayout(new BorderLayout(0, 0));
		dockContainer.add(sd.getView(), BorderLayout.CENTER);
		
		//LowerDock<Object, Void> dock = new LowerDock<Object, Void>();
		//add(dock.getView(), BorderLayout.CENTER);
	}

	@Override
	public void animate() throws InterruptedException {
		sd.getView().animate();
		
	}

	
	@Override
	public void setViewColor(Color color) {
		// NOT NOW
		
	}

	public Element<Object> getPrintElement(){
		return sd.getElement();
	}


}
