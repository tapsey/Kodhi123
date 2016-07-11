package com.bad_code.tapsey.codeonetwothree.app.model.factory.operator;

import com.bad_code.tapsey.codeonetwothree.app.model.expressions.data.Divide;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.ExpressionFactory;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;

@SuppressWarnings("serial")
public class DivideFactory extends ExpressionFactory {

	
public DivideFactory(){
		
	}
	
	@Override
	public void upLoad() {

		//Divide div = new Divide();
		ClipBoard.putData(new Divide());
		registerIcon();

	}

}
