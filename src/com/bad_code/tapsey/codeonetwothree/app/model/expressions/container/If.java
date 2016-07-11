package com.bad_code.tapsey.codeonetwothree.app.model.expressions.container;

import java.util.Vector;

import com.bad_code.tapsey.codeonetwothree.app.controler.Element;
import com.bad_code.tapsey.codeonetwothree.app.controler.UpperDock;
import com.bad_code.tapsey.codeonetwothree.app.controler.UpperDockable;
import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.view.container.IfView;
import com.bad_code.tapsey.codeonetwothree.app.view.container.MyClassView;
import com.bad_code.tapsey.codeonetwothree.environment.view.Window;

public class If extends Element<Boolean> implements UpperDockable {
	Vector<UpperDock> docks;
	public If() {
		view = new IfView(this);
//		UpperDock initialDock = new UpperDock(this, DockLocation.IF);
//		docks.add(initialDock);
//		view.reAdaptBody(docks);

	}


	@Override
	public boolean runElement(boolean animate) {
		Element<Boolean> el = ((IfView) view).getIfConditionElement();
		el.runElement(animate);
		if(el.getData()){
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
			Window.writeError(" IF haakwanise kugadzikwa pano");
			System.out.print("cant be docked");
			return false;

		}
	}

	@Override
	public void flagNull() {
		// TODO Auto-generated method stub
		
	}
	
	public boolean runPane(boolean animate){
		docks = ((IfView) view).getDocks();
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
