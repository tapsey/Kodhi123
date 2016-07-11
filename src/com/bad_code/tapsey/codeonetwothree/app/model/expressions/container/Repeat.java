package com.bad_code.tapsey.codeonetwothree.app.model.expressions.container;

import java.util.Vector;

import com.bad_code.tapsey.codeonetwothree.app.controler.Element;
import com.bad_code.tapsey.codeonetwothree.app.controler.UpperDock;
import com.bad_code.tapsey.codeonetwothree.app.controler.UpperDockable;
import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.view.container.RepeatView;
import com.bad_code.tapsey.codeonetwothree.environment.view.Window;


public class Repeat extends Element<Boolean> implements UpperDockable{
	Vector<UpperDock> docks;
	public Repeat(){
		
		view = new RepeatView(this);
//		UpperDock initialDock = new UpperDock(this, DockLocation.WHILE);
//		docks.add(initialDock);
//		view.reAdaptBody(docks);
	}


	@Override
	public boolean runElement(boolean animate) {
		Element<Integer> el = ((RepeatView) view).getRepeatNumberElement();
		el.runElement(animate);
		for(int i =0; i< el.getData(); i++){
		if(!runPane(animate)){
			return false;
			
		  }
		}
		return true;
	}

	@Override
	public boolean isDockablehere(DataType dockDataType,
			DockLocation dockLocation) {
		if (dockDataType == DataType.Void && dockLocation != DockLocation.CLASS) {
			System.out.print("can be docked");
			return true;
		} else {
			Window.writeError(" dzokorora haakwanise kugadzikwa pano");
			System.out.print("cant be docked");
			return false;

		}
	}

	@Override
	public void flagNull() {
		// TODO Auto-generated method stub
		
	}
	public boolean runPane(boolean animate){
		docks = ((RepeatView) view).getDocks();
		// runnning docks in pane
				for (UpperDock up : docks) { 

					Element<Void> upEl = up.getElement();

					if (upEl != null) {

						if(upEl.runElement(animate) != true){
							return false;
						}
					}
				}
				return true;
	}


	@Override
	public void renderSource() {
		// TODO Auto-generated method stub
		
	}

	

}
