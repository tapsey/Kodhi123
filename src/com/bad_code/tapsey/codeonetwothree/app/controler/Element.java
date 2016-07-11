package com.bad_code.tapsey.codeonetwothree.app.controler;

import com.bad_code.tapsey.codeonetwothree.app.view.ElementView;

public abstract class Element<T> implements ElementCallBacks{

	protected ElementView view;
	protected T data;
	Dock parentDock;
	
	public Element() {
	}

	public ElementView getView() {
		return view;
	}

	public T getData() {
		
		if(data != null){
		return data;
		}else{
			// flag null stop execution
			flagNull();
			
		}
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public abstract void flagNull();

	public void unDockMe() {
		parentDock.unDock();
		
	}

	public Dock getParentDock() {
		return parentDock;
	}

	public void setParentDock(Dock parentDock) {
		this.parentDock = parentDock;
	}
	

}
