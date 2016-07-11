package com.bad_code.tapsey.codeonetwothree.app.view.container;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import com.bad_code.tapsey.codeonetwothree.app.controler.Element;
import com.bad_code.tapsey.codeonetwothree.app.controler.StringDock;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.view.ElementView;
import com.bad_code.tapsey.codeonetwothree.app.view.ExpressionLabel;

@SuppressWarnings("serial")
public class InputView extends ElementView{
	StringDock dock;
	public InputView(Element element) {
		super(element);
		FlowLayout flowLayout = (FlowLayout) getLayout();
		flowLayout.setVgap(0);
		flowLayout.setHgap(0);
		setBackground(new Color(51, 51, 51));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 102, 204));
		add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 3, 2));
		
		ExpressionLabel xprsnlblInput = new ExpressionLabel();
		xprsnlblInput.setText("tora umbowo");
		panel.add(xprsnlblInput);
		
		
		dock = new StringDock(DockLocation.INPUT);
		panel.add(dock.getView());
	}

	@Override
	public void animate() throws InterruptedException {
		dock.getView().animate();		
	}

	@Override
	public void setViewColor(Color color) {
		// Not this time
		
	}

	public Element<String> getInputHintElement(){
		return dock.getElement();
	}

}
