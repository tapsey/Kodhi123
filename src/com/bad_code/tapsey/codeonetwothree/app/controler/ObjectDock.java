package com.bad_code.tapsey.codeonetwothree.app.controler;

import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;

public class ObjectDock extends LowerDock<Object>{


	public ObjectDock(DockLocation loc) {
		super(loc, DataType.INTEGER);//todo error here
	}

	@Override
	public void dockLiteral() {	
		System.out.println(" Object literal docked");	
				element = new Literal();
				element.setData((Object)view.getInput());
				System.out.println("data docked in Object literal is + " +(Object) view.getInput());	
	}

}
