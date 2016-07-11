package com.bad_code.tapsey.codeonetwothree.app.controler;

import java.awt.BorderLayout;

import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.view.UpperDockView;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;
import com.bad_code.tapsey.codeonetwothree.environment.view.Window;


public class UpperDock extends Dock<Void>{
	UpperDockPane pane;
	int position;
	UpperDock thisDock;
	public UpperDock(UpperDockPane upperDockPane, DockLocation loc) {
		super(loc);
		this.loc = loc;
		view = new UpperDockView(this);
		this.pane = upperDockPane;
	}
	
	public void dock(){
		System.out.println("upperDock's dock() called");
		Element tempEl = ClipBoard.getData();
		deRegisterIcon();
		
			if( tempEl != null){
								
				System.out.println("data to be docked is:  " + tempEl);
				if(tempEl instanceof UpperDockable && tempEl.isDockablehere(DataType.Void, loc)){
					System.out.println("inside upperdock dock() data is not null and is instance of upper dockable");
					thisDock  = this.pane.addUpperDock(position,loc);
					thisDock.setElement(tempEl);
					thisDock.getElement().setParentDock(thisDock);
					thisDock.view.removeAll();
					System.out.println("upperDock's view to dock on dock  "+ thisDock.getPosition() +" is " + tempEl.getView());
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
