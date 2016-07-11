package com.bad_code.tapsey.codeonetwothree.app.view.container;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import com.bad_code.tapsey.codeonetwothree.app.controler.Element;
import com.bad_code.tapsey.codeonetwothree.app.controler.IntDock;
import com.bad_code.tapsey.codeonetwothree.app.controler.UpperDock;
import com.bad_code.tapsey.codeonetwothree.app.controler.UpperDockPane;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.view.ElementView;
import com.bad_code.tapsey.codeonetwothree.app.view.ExpressionLabel;

@SuppressWarnings("serial")
public class SwitchView extends ElementView{
	IntDock dock;
	UpperDockPane docksPane = new UpperDockPane(DockLocation.SWITCH);
	public SwitchView(Element element) {
		super(element);
		setBackground(new Color(51, 51, 51));
		setLayout(new BorderLayout(2, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		add(panel, BorderLayout.WEST);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 51, 51));
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setVgap(0);
		flowLayout.setHgap(0);
		flowLayout.setAlignment(FlowLayout.LEFT);
		add(panel_1, BorderLayout.SOUTH);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.CYAN);
		panel_1.add(panel_3);
		
		ExpressionLabel xprsnlblEndOfCase = new ExpressionLabel();
		xprsnlblEndOfCase.setText("saruro yaperera pano");
		panel_3.add(xprsnlblEndOfCase);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(51, 51, 51));
		FlowLayout flowLayout_1 = (FlowLayout) panel_2.getLayout();
		flowLayout_1.setVgap(0);
		flowLayout_1.setHgap(0);
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		add(panel_2, BorderLayout.NORTH);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.CYAN);
		panel_2.add(panel_4);
		
		ExpressionLabel xprsnlblSwitch = new ExpressionLabel();
		xprsnlblSwitch.setText("Ita zviripa sarudzo yechi ");
		panel_4.add(xprsnlblSwitch);
		
		JPanel switchIntContainer = new JPanel();
		panel_4.add(switchIntContainer);
		switchIntContainer.setLayout(new BorderLayout(0, 0));
		dock = new IntDock(DockLocation.SWITCH_CONDITION);
		switchIntContainer.add(dock.getView(),BorderLayout.CENTER);
		
		add(docksPane, BorderLayout.CENTER);
	}

	@Override
	public void animate() throws InterruptedException {
		dock.getView().animate();
		
	}

	@Override
	public void setViewColor(Color color) {
		// NOT NOW
		
	}

	public Element<Integer> getSwitchConditionElement(){
		return dock.getElement();
	}
	
	public Vector<UpperDock> getDocks(){
		return docksPane.getUpperDocks();
	}

}
