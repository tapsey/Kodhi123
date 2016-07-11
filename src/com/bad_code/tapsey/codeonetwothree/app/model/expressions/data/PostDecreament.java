package com.bad_code.tapsey.codeonetwothree.app.model.expressions.data;

import com.bad_code.tapsey.codeonetwothree.app.controler.Element;
import com.bad_code.tapsey.codeonetwothree.app.controler.IntDock;
import com.bad_code.tapsey.codeonetwothree.app.controler.LowerDockable;
import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.view.expression.RightUnaryOperatorView;
import com.bad_code.tapsey.codeonetwothree.environment.view.Window;

public class PostDecreament extends Element<Integer> implements LowerDockable<Integer>{
	
	IntDock dock1;
	public PostDecreament(){
	dock1 = new IntDock(DockLocation.POSTDECREAMENT);
	view = new RightUnaryOperatorView<Integer>(dock1,"--",this,"inodzikisa zvakatakurwa yambodzosa zvirimo nechekare");

	}
	

	@Override
	public boolean runElement(boolean animate) {
		dock1.getElement().runElement(animate);
		setData(dock1.getElement().getData());
		dock1.getElement().setData(dock1.getElement().getData() - 1);
		return true;
	}
	@Override
	public boolean isDockablehere(DataType dockDataType,
			DockLocation dockLocation) {
		if ((dockDataType == DataType.DOUBLE || dockDataType == DataType.DOUBLE ) ) {
			System.out.print("can be docked");
			return true;
		} else {
			Window.writeError(" x-- haakwanise kugadzikwa pano");
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
