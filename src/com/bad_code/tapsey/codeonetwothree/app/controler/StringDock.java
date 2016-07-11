package com.bad_code.tapsey.codeonetwothree.app.controler;

import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.view.LowerDockView;
import com.bad_code.tapsey.codeonetwothree.environment.view.Window;

public class StringDock extends LowerDock<String> {

	public StringDock(DockLocation loc) {
		super(loc, DataType.STRING);
	}

	@Override
	public void dockLiteral() {

		if (view.getInput() != null) {
			element = new Literal();
			element.setData(view.getInput());

		} else {

			Window.writeError("Dock highlited in red has null value");
			((LowerDockView) view).dockIsNull();
		}
	}

}