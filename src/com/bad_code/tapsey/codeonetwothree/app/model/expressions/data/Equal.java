package com.bad_code.tapsey.codeonetwothree.app.model.expressions.data;

import java.awt.Color;

import com.bad_code.tapsey.codeonetwothree.app.controler.Element;
import com.bad_code.tapsey.codeonetwothree.app.controler.LowerDockable;
import com.bad_code.tapsey.codeonetwothree.app.controler.ObjectDock;
import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.view.expression.BinaryOperatorView;
import com.bad_code.tapsey.codeonetwothree.environment.view.Window;

public class Equal extends Element<Boolean> implements LowerDockable<Boolean>{
	
	ObjectDock dock1, dock2;
	
	public Equal(){
		dock1 = new ObjectDock(DockLocation.EQUAL);
		dock2 = new ObjectDock(DockLocation.EQUAL);
		view = new BinaryOperatorView<Object, Object>("akaenzana na", Color.RED,
				"hint", dock1, dock2,this);
	}


	@Override
	public boolean runElement(boolean animate) {
		dock1.getElement().runElement(animate);
		dock2.getElement().runElement(animate);
		setData(dock1.getElement().getData().equals(dock2.getElement().getData()));
		return true;
	}
	@Override
	public boolean isDockablehere(DataType dockDataType,
			DockLocation dockLocation) {
		if ( dockDataType == DataType.BOOLEAN) {
			System.out.print("can be docked");
			return true;
		} else {
			Window.writeError(" akaenzana haakwanise kugadzikwa pano");
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
