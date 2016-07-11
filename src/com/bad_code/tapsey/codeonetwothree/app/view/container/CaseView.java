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
import com.bad_code.tapsey.codeonetwothree.app.view.ExpressionTextField;

@SuppressWarnings("serial")
public class CaseView extends ElementView {
	ExpressionTextField xprsntxtfldIntHere;
	UpperDockPane docksPane = new UpperDockPane(DockLocation.CASE);
	public CaseView(Element element) {
		super(element);
		setBackground(new Color(51, 51, 51));
		setLayout(new BorderLayout(2, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		add(panel, BorderLayout.WEST);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 51, 51));
		FlowLayout flowLayout_1 = (FlowLayout) panel_1.getLayout();
		flowLayout_1.setVgap(0);
		flowLayout_1.setHgap(0);
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		add(panel_1, BorderLayout.SOUTH);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.CYAN);
		panel_1.add(panel_4);
		
		ExpressionLabel xprsnlblBreak = new ExpressionLabel();
		xprsnlblBreak.setText("sarudzo yagumira pano");
		panel_4.add(xprsnlblBreak);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(51, 51, 51));
		FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
		flowLayout.setVgap(0);
		flowLayout.setHgap(0);
		flowLayout.setAlignment(FlowLayout.LEFT);
		add(panel_2, BorderLayout.NORTH);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.CYAN);
		panel_2.add(panel_3);
		
		ExpressionLabel xprsnlblCase = new ExpressionLabel();
		xprsnlblCase.setText("sarudzo yechi ");
		panel_3.add(xprsnlblCase);
		
		xprsntxtfldIntHere = new ExpressionTextField();
		xprsntxtfldIntHere.setColumns(3);
		panel_3.add(xprsntxtfldIntHere);
		
		
		add(docksPane, BorderLayout.CENTER);
	}

	@Override
	public void animate() throws InterruptedException {
		xprsntxtfldIntHere.setBackground(Color.GREEN);
		Thread.sleep(500);
		xprsntxtfldIntHere.setBackground(Color.WHITE);
		
	}

	@Override
	public void setViewColor(Color color) {
		// TODO Auto-generated method stub
		
	}

	public int getCaseValue(){
		return Integer.parseInt(xprsntxtfldIntHere.getText());
	}

	public Vector<UpperDock> getDocks(){
		return docksPane.getUpperDocks();
	}
	
}
