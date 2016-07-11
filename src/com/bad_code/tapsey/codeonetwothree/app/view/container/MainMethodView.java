package com.bad_code.tapsey.codeonetwothree.app.view.container;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import com.bad_code.tapsey.codeonetwothree.app.controler.Element;
import com.bad_code.tapsey.codeonetwothree.app.controler.UpperDock;
import com.bad_code.tapsey.codeonetwothree.app.controler.UpperDockPane;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.view.ElementView;
import com.bad_code.tapsey.codeonetwothree.app.view.ExpressionLabel;

@SuppressWarnings("serial")
public class MainMethodView extends ElementView{
	
	UpperDockPane docksPane = new UpperDockPane(DockLocation.METHOD);
	public MainMethodView(Element element) {
		super(element);
		setBackground(new Color(51, 51, 51));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 204, 255));
		add(panel, BorderLayout.WEST);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 51, 51));
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setVgap(0);
		flowLayout.setHgap(0);
		flowLayout.setAlignment(FlowLayout.LEFT);
		add(panel_1, BorderLayout.SOUTH);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 204, 255));
		panel_1.add(panel_2);
		
		ExpressionLabel xprsnlblEndOfMain = new ExpressionLabel();
		xprsnlblEndOfMain.setText("magumo");
		panel_2.add(xprsnlblEndOfMain);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(51, 51, 51));
		FlowLayout flowLayout_1 = (FlowLayout) panel_3.getLayout();
		flowLayout_1.setVgap(0);
		flowLayout_1.setHgap(0);
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		add(panel_3, BorderLayout.NORTH);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 204, 255));
		panel_3.add(panel_4);
		
		ExpressionLabel xprsnlblMain = new ExpressionLabel();
		xprsnlblMain.setText("mavambo()");
		panel_4.add(xprsnlblMain);
		
		//docksContainer = new JPanel();
		add(docksPane, BorderLayout.CENTER);
		//docksContainer.setLayout(new BoxLayout(docksContainer, BoxLayout.Y_AXIS));
	}

	@Override
	public void animate() {
//		for(UpperDock d : docks){
//			
//		}
		// NOT NOW
	}

	@Override
	public void setViewColor(Color color) {
		// Not now
		
	}
	
	public Vector<UpperDock> getDocks(){
		return docksPane.getUpperDocks();
	}


}
