package com.bad_code.tapsey.codeonetwothree.app.controler;

import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.view.LowerDockView;
import com.bad_code.tapsey.codeonetwothree.environment.view.Window;

public class IntDock extends LowerDock<Integer> {

	public IntDock(DockLocation loc) {
		super(loc, DataType.INTEGER);
	}

	@Override
	public void dockLiteral() {

		try {
			int d = Integer.parseInt(view.getInput());
			element = new Literal();
			element.setData(d);
		} catch (NumberFormatException ex) {
			Window.writeError("Dock highlited in red has invalid input");

			((LowerDockView) view).dockIsNull();
		} catch (NullPointerException ex2) {

			Window.writeError("Dock highlited in red has null value");
			((LowerDockView) view).dockIsNull();
		}

	}

}