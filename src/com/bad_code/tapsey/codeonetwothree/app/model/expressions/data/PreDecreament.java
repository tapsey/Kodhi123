package com.bad_code.tapsey.codeonetwothree.app.model.expressions.data;

import com.bad_code.tapsey.codeonetwothree.app.controler.Element;
import com.bad_code.tapsey.codeonetwothree.app.controler.IntDock;
import com.bad_code.tapsey.codeonetwothree.app.controler.LowerDockable;
import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.view.expression.LeftUnaryOperatorView;
import com.bad_code.tapsey.codeonetwothree.environment.view.Window;

public class PreDecreament extends Element<Integer> implements LowerDockable<Integer>{
	
	IntDock dock1;

	public PreDecreament(){
		dock1 = new IntDock(DockLocation.PREDECREAMENT);
		view = new LeftUnaryOperatorView<Integer>(dock1,"--",this,"inodzikisa zvakatakurwa yozodzosa zvavemo");

	}


	@Override
	public boolean runElement(boolean animate) {
		dock1.getElement().runElement(animate);
		dock1.getElement().setData(dock1.getElement().getData() - 1);
		setData(dock1.getElement().getData());		
		return true;
	}

	@Override
	public boolean isDockablehere(DataType dockDataType,
			DockLocation dockLocation) {
		if ((dockDataType == DataType.DOUBLE || dockDataType == DataType.DOUBLE ) ) {
			System.out.print("can be docked");
			return true;
		} else {
			Window.writeError(" --x haakwanise kugadzikwa pano");
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
