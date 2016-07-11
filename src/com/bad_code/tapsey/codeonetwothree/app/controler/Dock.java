package com.bad_code.tapsey.codeonetwothree.app.controler;

import java.awt.Cursor;

import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.view.DockView;
import com.bad_code.tapsey.codeonetwothree.environment.view.Window;

public abstract class Dock<T> {

	protected DockView view;
	protected Element<T> element;
	protected DockLocation loc;
	
	
			
	public Element<T> getElement() {
		return element;
	}


	public Dock(DockLocation loc){
		this.loc = loc;	
	}
		
	
	
	public void setElement(Element<T> element) {
		this.element = element;
	}


	public DockLocation getLoc() {
		return loc;
	}

	public DockView getView() {
		return view;
	}
	
	public void deRegisterIcon(){
		Window.getAppPanel().setCursor(Cursor.getDefaultCursor());
	}
	
	//public abstract void dockNull();
	public abstract void dock();
	public abstract void unDock();
}
