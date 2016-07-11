package com.bad_code.tapsey.codeonetwothree.app.model.expressions.data;

import java.awt.Color;

import com.bad_code.tapsey.codeonetwothree.app.controler.DoubleDock;
import com.bad_code.tapsey.codeonetwothree.app.controler.Element;
import com.bad_code.tapsey.codeonetwothree.app.controler.LowerDockable;
import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.view.expression.BinaryOperatorView;
import com.bad_code.tapsey.codeonetwothree.environment.view.Window;

public class Plus extends Element<Double> implements LowerDockable<Double>{
	
	DoubleDock dock1, dock2;
	public Plus(){
		dock1 = new DoubleDock(DockLocation.PLUS);
		dock2 = new DoubleDock(DockLocation.PLUS);
		view = new BinaryOperatorView<Double, Double>("kuwedzera", Color.CYAN,
				"hint", dock1, dock2,this);
	}
	
	@Override
	public boolean runElement(boolean animate) {
		dock1.getElement().runElement(animate);
		dock2.getElement().runElement(animate);
		setData(dock1.getElement().getData() +
				dock2.getElement().getData());
		return true;
	}
	public boolean isDockablehere(DataType dockDataType,
			DockLocation dockLocation) {
		if ((dockDataType == DataType.DOUBLE || dockDataType == DataType.DOUBLE ) ) {
			System.out.print("can be docked");
			return true;
		} else {
			Window.writeError(" kuwedzera haakwanise kugadzikwa pano");
			System.out.print("cant be docked");
			return false;

		}
		
	}
	@Override
	public void flagNull() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void renderSource() {
		// TODO Auto-generated method stub
		
	}




}
