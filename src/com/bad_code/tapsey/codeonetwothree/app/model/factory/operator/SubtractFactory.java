package com.bad_code.tapsey.codeonetwothree.app.model.factory.operator;

import com.bad_code.tapsey.codeonetwothree.app.model.expressions.data.Subtract;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.ExpressionFactory;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;

@SuppressWarnings("serial")
public class SubtractFactory extends ExpressionFactory{

	@Override
	public void upLoad() {
		//Subtract g = new Subtract();
		ClipBoard.putData(new Subtract());
		registerIcon();
	}

}
