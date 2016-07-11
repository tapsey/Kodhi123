package com.bad_code.tapsey.codeonetwothree.app.model.expressions.container;

import java.util.Vector;

import com.bad_code.tapsey.codeonetwothree.app.controler.Element;
import com.bad_code.tapsey.codeonetwothree.app.controler.UpperDock;
import com.bad_code.tapsey.codeonetwothree.app.controler.UpperDockable;
import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.view.container.CaseView;
import com.bad_code.tapsey.codeonetwothree.app.view.container.IfView;
import com.bad_code.tapsey.codeonetwothree.environment.view.Window;

public class Case extends Element<Void> implements UpperDockable {

	int caseCondition;
	Vector<UpperDock> docks;

	public Case() {
		view = new CaseView(this);
		// UpperDock initialDock = new UpperDock(this,DockLocation.CASE);
		// docks.add(initialDock);
		// view.reAdaptBody(docks);

	}

	@Override
	public boolean runElement(boolean animate) {
		caseCondition = ((CaseView) view).getCaseValue();
		return true;
	}

	@Override
	public boolean isDockablehere(DataType dockDataType,
			DockLocation dockLocation) {

		if (dockDataType == DataType.Void
				&& dockLocation == DockLocation.SWITCH) {
			System.out.print("can be docked");
			return true;
		} else {
			Window.writeError("Case cannot be docked there");
			System.out.print("cant be docked");
			return false;

		}

	}

	@Override
	public void flagNull() {
		// TODO Auto-generated method stub

	}

	public boolean runPane(boolean animate) {
		docks = ((CaseView) view).getDocks();
		// runnning docks in pane
		for (UpperDock up : docks) {

			Element<Void> upEl = up.getElement();

			if (upEl != null) {

				if (upEl.runElement(animate) != true) {
					return false;
				}
			}
		}
		return true;
	}

	public int getCaseCondition() {
		return caseCondition;
	}

	@Override
	public void renderSource() {
		// TODO Auto-generated method stub

	}

}
