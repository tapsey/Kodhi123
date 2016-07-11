package com.bad_code.tapsey.codeonetwothree.app.model.factory.methods;

import com.bad_code.tapsey.codeonetwothree.app.controler.MainMethod;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.ExpressionFactory;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;

@SuppressWarnings("serial")
public class MainMethodFactory extends  ExpressionFactory {

public MainMethodFactory(){
		
	}
	
	@Override
	public void upLoad() {

		//MainMethod m = new MainMethod();
		ClipBoard.putData(new MainMethod());
		registerIcon();

	}
}
