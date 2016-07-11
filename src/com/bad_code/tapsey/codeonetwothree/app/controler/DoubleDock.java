package com.bad_code.tapsey.codeonetwothree.app.controler;

import java.awt.BorderLayout;

import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.view.LowerDockView;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;
import com.bad_code.tapsey.codeonetwothree.environment.view.Window;


public class DoubleDock  extends LowerDock<Double>{

	
	public DoubleDock(DockLocation loc) {
		super(loc, DataType.DOUBLE);
	}

	@Override
	public void dockLiteral() {	
		
		try{
			double d = Double.parseDouble(view.getInput());
				element = new Literal();
				element.setData(d);
			}catch(NumberFormatException ex){
				// cannot be parsed
				
			}catch(NullPointerException ex2){
				
				// is null
			}
			
	}

	@Override
	public void dock() {
		Element element =  ClipBoard.getData();
		
		if( element != null ){				
			System.out.println("lower docking data is not null ");
			if(element instanceof LowerDockable ){
				System.out.println("lower docking successiful");
				element.setParentDock(this);
				((LowerDockView)view).clearDock();
				view.add(element.getView(),BorderLayout.CENTER);
				Window.repaintPane();
			}
			}

		try{
			double d = Double.parseDouble(element.getData().toString());
				this.element = new Literal();
				this.element.setData(d);
			}catch(NumberFormatException ex){
				Window.writeError("Dock highlited in red has invalid input");
				((LowerDockView) view).dockIsNull();
				
			}catch(NullPointerException ex2){
				
				Window.writeError("Dock highlited in red has null value");
				((LowerDockView) view).dockIsNull();
			}
	}

	@Override
	public void unDock() {
		
		super.unDock();
	}
	
	
	
	
	

}