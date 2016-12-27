package com.bad_code.tapsey.codeonetwothree.app.controler;

import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.model.datatypes.Variable;

public class VariableDock<T> extends LowerDock<Variable<T>>{

	public VariableDock(DockLocation loc) {
		super(loc, DataType.STRING);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dockLiteral() {
		// TODO Auto-generated method stub
		
	}

}
