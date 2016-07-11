package com.bad_code.tapsey.codeonetwothree.app.model.expressions.data;

import com.bad_code.tapsey.codeonetwothree.app.controler.Element;
import com.bad_code.tapsey.codeonetwothree.app.controler.LowerDockable;
import com.bad_code.tapsey.codeonetwothree.app.controler.StringDock;
import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.view.expression.LeftUnaryOperatorView;
import com.bad_code.tapsey.codeonetwothree.environment.view.Window;

public class ToBoolean extends Element<Boolean> implements LowerDockable<Boolean>{

StringDock dock1;
	
	public ToBoolean(){
		dock1 = new StringDock(DockLocation.TOBOOLEAN);
		view = new LeftUnaryOperatorView<String>(dock1,"izwi ngarive boolean",this, "izwi rinopihwa pano rinoshandurwa kuita boolean kana zvichiita");
		
	}
	
	@Override
	public boolean runElement(boolean animate) {
		dock1.getElement().runElement(animate);		
		boolean value = Boolean.parseBoolean(dock1.getElement().getData());
		setData(value);		
		return true;

	}

	@Override
	public boolean isDockablehere(DataType dockDataType,
			DockLocation dockLocation) {
		if (dockDataType == DataType.BOOLEAN) {
			System.out.print("can be docked");
			return true;
		} else {
			Window.writeError(" toInteger haakwanise kugadzikwa pano");
			System.out.print("cant be docked");
			return false;

		}
	}

	@Override
	public void renderSource() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void flagNull() {
		// TODO Auto-generated method stub
		
	}
}
