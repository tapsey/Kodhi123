package com.bad_code.tapsey.codeonetwothree.app.model.factory.operator;

import com.bad_code.tapsey.codeonetwothree.app.model.expressions.data.GreaterEqual;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.ExpressionFactory;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;

@SuppressWarnings("serial")
public class GreaterEqualFactory extends ExpressionFactory{
public GreaterEqualFactory(){
		
	}
	
	@Override
	public void upLoad() {

		//GreaterEqual g = new GreaterEqual();
		ClipBoard.putData(new GreaterEqual());
		registerIcon();

	}
}
