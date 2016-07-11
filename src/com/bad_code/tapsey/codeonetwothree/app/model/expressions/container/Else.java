package com.bad_code.tapsey.codeonetwothree.app.model.expressions.container;

import java.util.Vector;

import com.bad_code.tapsey.codeonetwothree.app.controler.Element;
import com.bad_code.tapsey.codeonetwothree.app.controler.UpperDock;
import com.bad_code.tapsey.codeonetwothree.app.controler.UpperDockable;
import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.view.container.ElseView;
import com.bad_code.tapsey.codeonetwothree.app.view.container.IfView;
import com.bad_code.tapsey.codeonetwothree.environment.view.Window;

public class Else extends Element<Boolean> implements UpperDockable {

	Vector<UpperDock> ifDocks;
	Vector<UpperDock> elseDocks;

	public Else() {
		view = new ElseView(this);
		// UpperDock initialDock = new UpperDock(this, DockLocation.IF_ELSE);
		// docks.add(initialDock);
		// view.reAdaptBody(docks);
		//
		// elseDocks = new Vector<ElseDock>();
		// ElseDock initialElseDock = new ElseDock(this,DockLocation.IF_ELSE);
		// elseDocks.add(initialElseDock);
		// view.reAdaptElseBody(elseDocks);
	}

	//
	// public UpperDock addElseDock(int position, DockLocation loc) {//
	// ElseDock dock = new ElseDock(this, loc);
	// dock.setPosition(position + 1);
	// elseDocks.add(position + 1, dock);
	// ElseDock dock2 = new ElseDock(this, loc);
	// dock2.setPosition(position + 2);
	// elseDocks.add(position + 2, dock2);
	// view.reAdaptElseBody(elseDocks);
	// return dock;
	// }
	@Override
	public boolean runElement(boolean animate) {
		Element<Boolean> el = ((ElseView) view).getIfElseConditionElement();
		el.runElement(animate);
		if (el.getData()) {
			if (!runIfPane(animate)) {
				return false;

			}
		} else {
			if (!runElsePane(animate)) {
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
			Window.writeError(" IF -ELSE haakwanise kugadzikwa pano");
			System.out.print("cant be docked");
			return false;

		}
	}

	@Override
	public void flagNull() {
		// TODO Auto-generated method stub

		
	}
	

	public boolean runIfPane(boolean animate) {
		ifDocks = ((ElseView) view).getIfDocks();
		// runnning docks in pane
		for (UpperDock up : ifDocks) {

			Element<Void> upEl = up.getElement();

			if (upEl != null) {

				if (upEl.runElement(animate) != true) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean runElsePane(boolean animate) {
		elseDocks = ((ElseView) view).getElseDocks();
		// runnning docks in pane
		for (UpperDock up : elseDocks) {

			Element<Void> upEl = up.getElement();

			if (upEl != null) {

				if (upEl.runElement(animate) != true) {
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
