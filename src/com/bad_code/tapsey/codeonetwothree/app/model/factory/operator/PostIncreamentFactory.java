package com.bad_code.tapsey.codeonetwothree.app.model.factory.operator;

import com.bad_code.tapsey.codeonetwothree.app.model.expressions.data.PostIncreament;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.ExpressionFactory;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;

@SuppressWarnings("serial")
public class PostIncreamentFactory extends ExpressionFactory{

	@Override
	public void upLoad() {

		//PostIncreament g = new PostIncreament();
		ClipBoard.putData(new PostIncreament());
		registerIcon();
	}

}
