package com.bad_code.tapsey.codeonetwothree.app.model.factory.operator;

import com.bad_code.tapsey.codeonetwothree.app.model.expressions.data.PreDecreament;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.ExpressionFactory;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;

@SuppressWarnings("serial")
public class PreDecreamentFactory extends ExpressionFactory{

	@Override
	public void upLoad() {
		//PreDecreament g = new PreDecreament();
		ClipBoard.putData(new PreDecreament());
		registerIcon();
	}

}
