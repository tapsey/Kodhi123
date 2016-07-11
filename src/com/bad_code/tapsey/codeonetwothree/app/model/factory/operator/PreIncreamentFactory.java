package com.bad_code.tapsey.codeonetwothree.app.model.factory.operator;

import com.bad_code.tapsey.codeonetwothree.app.model.expressions.data.PreIncreament;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.ExpressionFactory;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;

@SuppressWarnings("serial")
public class PreIncreamentFactory extends ExpressionFactory{

	@Override
	public void upLoad() {
		//PreIncreament g = new PreIncreament();
		ClipBoard.putData(new PreIncreament());
		registerIcon();
	}

}
