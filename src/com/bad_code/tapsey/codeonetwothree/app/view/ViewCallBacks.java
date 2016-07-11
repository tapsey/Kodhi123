package com.bad_code.tapsey.codeonetwothree.app.view;

import java.awt.Color;

public interface ViewCallBacks {

	public void animate() throws InterruptedException;

	public void setViewColor(Color color);
		
	public void setRootView(ElementView parent);

	public ElementView getRootView();
}
