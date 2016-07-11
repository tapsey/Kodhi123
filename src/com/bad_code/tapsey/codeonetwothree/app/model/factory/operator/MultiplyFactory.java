package com.bad_code.tapsey.codeonetwothree.app.model.factory.operator;

import com.bad_code.tapsey.codeonetwothree.app.model.expressions.data.Multiply;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.ExpressionFactory;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;

@SuppressWarnings("serial")
public class MultiplyFactory extends ExpressionFactory {

public MultiplyFactory(){
		
	}
	
	@Override
	public void upLoad() {

		//Multiply m = new Multiply();
		ClipBoard.putData(new Multiply());
		registerIcon();

	}

}
