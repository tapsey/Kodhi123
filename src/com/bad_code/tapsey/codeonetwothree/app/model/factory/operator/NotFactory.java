package com.bad_code.tapsey.codeonetwothree.app.model.factory.operator;

import com.bad_code.tapsey.codeonetwothree.app.model.expressions.data.Not;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.ExpressionFactory;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;

@SuppressWarnings("serial")
public class NotFactory extends ExpressionFactory {

public NotFactory(){
		
	}
	
	@Override
	public void upLoad() {

		//Not n = new Not();
		ClipBoard.putData(new Not());
		registerIcon();

	}

}
