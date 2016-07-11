package com.bad_code.tapsey.codeonetwothree.app.controler;

import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;

public interface ElementCallBacks {
	
	public boolean runElement(boolean animate);
	public boolean isDockablehere(DataType dockDataType, DockLocation dockLocation);
	public void renderSource();

}
