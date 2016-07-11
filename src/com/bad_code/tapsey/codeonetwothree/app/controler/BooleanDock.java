package com.bad_code.tapsey.codeonetwothree.app.controler;

import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.view.LowerDockView;
import com.bad_code.tapsey.codeonetwothree.environment.view.Window;

public class BooleanDock extends LowerDock<Boolean>{
		
	public BooleanDock(DockLocation loc) {
		super(loc, DataType.BOOLEAN);
	}

	@Override
	public void dockLiteral() {	
		
		try{
		if(view.getInput().equals("true") || view.getInput().equals("false")){
				element = new Literal();
				element.setData(Boolean.parseBoolean(view.getInput()));
				
				
			}else{
				
				Window.writeError("Dock highlited in red has invalid input");
				((LowerDockView) view).dockIsNull();
			}
		} catch(NullPointerException ep){
			Window.writeError("Dock highlited in red has null value");
			((LowerDockView) view).dockIsNull();

		}
			
	}
	
}