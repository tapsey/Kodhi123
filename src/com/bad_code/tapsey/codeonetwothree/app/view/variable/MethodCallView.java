package com.bad_code.tapsey.codeonetwothree.app.view.variable;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

import com.bad_code.tapsey.codeonetwothree.app.controler.Element;
import com.bad_code.tapsey.codeonetwothree.app.controler.LowerDock;
import com.bad_code.tapsey.codeonetwothree.app.view.ElementView;
import com.bad_code.tapsey.codeonetwothree.app.view.ExpressionLabel;

@SuppressWarnings("serial")
public class MethodCallView<T> extends ElementView{
	
	//ArgumentDockPane argsPane = new ArgumentDockPane();
	
	public MethodCallView(ArrayList<LowerDock<T>> argumentDockList,Element<T> element, String name) {
		super(element);
		setBackground(new Color(51, 51, 51));
		FlowLayout flowLayout = (FlowLayout) getLayout();
		flowLayout.setVgap(1);
		flowLayout.setHgap(2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 102, 0));
		add(panel);
		
		ExpressionLabel xprsnlblMethodName = new ExpressionLabel();
		xprsnlblMethodName.setText(name +"(");
		panel.add(xprsnlblMethodName);
		
		JPanel argumentsPane = new JPanel();
		argumentsPane.setBackground(new Color(51, 51, 51));
		panel.add(argumentsPane);
		argumentsPane.setLayout(new FlowLayout(FlowLayout.CENTER, 1, 0));
		
		ExpressionLabel expressionLabel = new ExpressionLabel();
		panel.add(expressionLabel);
		expressionLabel.setText(")");
		System.out.println("we are here and args are  " + argumentDockList.size());
		for(LowerDock ld : argumentDockList){
			argumentsPane.add(ld.getView());
			System.out.println("did we reach here");
		}
		
		//panel.add(argsPane);
	}

	@Override
	public void animate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setViewColor(Color color) {
		// TODO Auto-generated method stub
		
	}

//	public Vector<ArgumentDock> getArgumentList(){
//		return argsPane.getArgumentDocks();
//	}


}
