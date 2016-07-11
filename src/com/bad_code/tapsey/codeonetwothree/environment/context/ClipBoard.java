package com.bad_code.tapsey.codeonetwothree.environment.context;

import com.bad_code.tapsey.codeonetwothree.app.controler.Element;


public class ClipBoard {

	@SuppressWarnings("rawtypes")
	private static Element data;
	
	public static void putData(@SuppressWarnings("rawtypes") Element dataIn){

		System.out.println("data uploaded");
		System.out.println("data is:  " + dataIn);
		data = dataIn;
	}
		
	@SuppressWarnings("rawtypes")
	public static Element getData(){
		System.out.println("data retrieved");
		Element tempData = data;
		clearData();
		return tempData;
	}
	
			
	public static void clearData(){
		data = null;
		System.out.println("cleared");
	}
}
