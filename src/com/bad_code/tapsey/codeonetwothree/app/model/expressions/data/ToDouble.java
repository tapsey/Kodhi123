package com.bad_code.tapsey.codeonetwothree.app.model.expressions.data;

import com.bad_code.tapsey.codeonetwothree.app.controler.Element;
import com.bad_code.tapsey.codeonetwothree.app.controler.LowerDockable;
import com.bad_code.tapsey.codeonetwothree.app.controler.StringDock;
import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.view.expression.LeftUnaryOperatorView;
import com.bad_code.tapsey.codeonetwothree.environment.view.Window;

public class ToDouble   extends Element<Double> implements LowerDockable<Double>{


	StringDock dock1;
	
	public ToDouble(){
		dock1 = new StringDock(DockLocation.TODOUBLE);
		view = new LeftUnaryOperatorView<String>(dock1,"izwi ngarive double",this,"izwi rinopihwa pano rinoshandurwa kuita double kana zvichiita");
		
	}
	
	@Override
	public boolean runElement(boolean animate) {
		dock1.getElement().runElement(animate);		
		double value = Double.parseDouble(dock1.getElement().getData());
		setData(value);		
		return true;

	}

	@Override
	public boolean isDockablehere(DataType dockDataType,
			DockLocation dockLocation) {
		if (dockDataType == DataType.DOUBLE) {
			System.out.print("can be docked");
			return true;
		} else {
			Window.writeError(" to double haakwanise kugadzikwa pano");
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
