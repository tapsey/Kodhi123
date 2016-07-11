package com.bad_code.tapsey.codeonetwothree.app.model.expressions.data;

import com.bad_code.tapsey.codeonetwothree.app.controler.BooleanDock;
import com.bad_code.tapsey.codeonetwothree.app.controler.Element;
import com.bad_code.tapsey.codeonetwothree.app.controler.LowerDockable;
import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.view.expression.LeftUnaryOperatorView;
import com.bad_code.tapsey.codeonetwothree.environment.view.Window;

public class Not  extends Element<Boolean> implements LowerDockable<Boolean>{

	BooleanDock dock1;
	
	public Not() {
		dock1 = new BooleanDock(DockLocation.NOT);
		view = new LeftUnaryOperatorView<Boolean>(dock1,"shandura",this,"panodzoswa zvinopikisa boolean rinopihwa pano ");

	}



	@Override
	public boolean runElement(boolean animate) {
		dock1.getElement().runElement(animate);
		setData(!dock1.getElement().getData());
		return true;
	}

	@Override
	public boolean isDockablehere(DataType dockDataType,
			DockLocation dockLocation) {
		if ( dockDataType == DataType.BOOLEAN) {
			System.out.print("can be docked");
			return true;
		} else {
			Window.writeError(" shanudura kana kuti vakaenza haakwanise kugadzikwa pano");
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
