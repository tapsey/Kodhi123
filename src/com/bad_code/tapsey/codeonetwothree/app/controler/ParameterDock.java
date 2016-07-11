package com.bad_code.tapsey.codeonetwothree.app.controler;

import java.awt.BorderLayout;

import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.view.ParameterDockView;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;
import com.bad_code.tapsey.codeonetwothree.environment.view.Window;

public class ParameterDock extends Dock<Void>{
	DockLocation loc;
	ParameterDockPane pane;
	int position;
	ParameterDock thisDock;
	public ParameterDock(ParameterDockPane pane, DockLocation locIn ) {
		super(locIn);		
		this.pane = pane;
		view = new ParameterDockView(this);
		System.out.println("parameter dock created");
	}	
	
	
	
	public void dock(){
		System.out.println("upperDock's dock() called");
		Element tempEl = ClipBoard.getData();
		deRegisterIcon();
		
			if( tempEl != null){
								
				System.out.println("data to be docked is:  " + tempEl);
				if(tempEl instanceof ParameterDockable && tempEl.isDockablehere(DataType.Void, loc)){
					System.out.println("inside paramdock dock() data is not null and is instance of upper dockable");
					thisDock  = this.pane.addParameterDock(position,loc);
					thisDock.setElement(tempEl);
					thisDock.getElement().setParentDock(thisDock);
					thisDock.view.removeAll();
					System.out.println("paramDock's view to dock on dock  "+ thisDock.getPosition() +" is " + tempEl.getView());
					thisDock.view.add(thisDock.getElement().getView(), BorderLayout.CENTER);
					Window.repaintPane();
				}else{
					Window.writeError(" paDock nhamba :" + position);
				}				
			}
		}
	
	public void unDock() {
		setElement(null);
		view.removeAll();
		this.pane.removeDock(position);
		
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}


}
