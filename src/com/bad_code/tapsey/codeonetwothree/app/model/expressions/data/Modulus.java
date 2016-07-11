package com.bad_code.tapsey.codeonetwothree.app.model.expressions.data;

import java.awt.Color;

import com.bad_code.tapsey.codeonetwothree.app.controler.Element;
import com.bad_code.tapsey.codeonetwothree.app.controler.IntDock;
import com.bad_code.tapsey.codeonetwothree.app.controler.LowerDockable;
import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.view.expression.BinaryOperatorView;
import com.bad_code.tapsey.codeonetwothree.environment.view.Window;


public class Modulus  extends Element<Integer> implements LowerDockable<Integer>{

	IntDock dock1, dock2;
	
	public Modulus(){
		dock1 = new IntDock(DockLocation.MODULUS);
		dock2 = new IntDock(DockLocation.MODULUS);
		view = new BinaryOperatorView<Integer, Integer>("kusara", Color.LIGHT_GRAY,
				"inodzosa zvinosara kana zvirikurudyi zvinzwa mune zviri kurudyi", dock1, dock2,this);
	}

	@Override
	public boolean runElement(boolean animate) {
		dock1.getElement().runElement(animate);
		dock2.getElement().runElement(animate);
		setData(dock1.getElement().getData() % dock2.getElement().getData());
		return true;
	}

	@Override
	public boolean isDockablehere(DataType dockDataType,
			DockLocation dockLocation) {
		if ((dockDataType == DataType.DOUBLE || dockDataType == DataType.DOUBLE ) ) {
			System.out.print("can be docked");
			return true;
		} else {
			Window.writeError(" % haakwanise kugadzikwa pano");
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
