package com.bad_code.tapsey.codeonetwothree.app.model.factory.operator;

import com.bad_code.tapsey.codeonetwothree.app.model.expressions.data.Greater;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.ExpressionFactory;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;

@SuppressWarnings("serial")
public class GreaterFactory extends ExpressionFactory {

public GreaterFactory(){
		
	}
	
	@Override
	public void upLoad() {

		//Greater g = new Greater();
		ClipBoard.putData(new Greater());
		registerIcon();

	}

}
