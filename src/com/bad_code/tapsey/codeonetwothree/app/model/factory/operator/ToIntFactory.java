package com.bad_code.tapsey.codeonetwothree.app.model.factory.operator;

import com.bad_code.tapsey.codeonetwothree.app.model.expressions.data.ToInteger;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.ExpressionFactory;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;

public class ToIntFactory extends ExpressionFactory{

	@Override
	public void upLoad() {
		ClipBoard.putData(new ToInteger());
		registerIcon();
	}

}
