package com.bad_code.tapsey.codeonetwothree.app.controler;

import com.bad_code.tapsey.codeonetwothree.app.model.Data;

public interface HibridDockable <T>  {
	public Data<T> getData();
	public void  setData(Data<T> data);
}
