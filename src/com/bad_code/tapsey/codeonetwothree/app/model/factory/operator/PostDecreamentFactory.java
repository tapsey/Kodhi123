package com.bad_code.tapsey.codeonetwothree.app.model.factory.operator;

import com.bad_code.tapsey.codeonetwothree.app.model.expressions.data.PostDecreament;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.ExpressionFactory;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;

@SuppressWarnings("serial")
public class PostDecreamentFactory extends ExpressionFactory{

	@Override
	public void upLoad() {

		//PostDecreament g = new PostDecreament();
		ClipBoard.putData(new PostDecreament());
		registerIcon();
	}

}
