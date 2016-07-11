package com.bad_code.tapsey.codeonetwothree.app.model.factory.operator;

import com.bad_code.tapsey.codeonetwothree.app.model.expressions.data.Or;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.ExpressionFactory;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;

@SuppressWarnings("serial")
public class OrFactory extends ExpressionFactory {
	
	public OrFactory() {
	}

	@Override
	public void upLoad() {
		//Or and = new Or();
		ClipBoard.putData(new Or());
		registerIcon();

	}
}
