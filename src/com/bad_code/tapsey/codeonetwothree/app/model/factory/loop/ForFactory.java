package com.bad_code.tapsey.codeonetwothree.app.model.factory.loop;

import com.bad_code.tapsey.codeonetwothree.app.model.expressions.container.For;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.ExpressionFactory;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;

@SuppressWarnings("serial")
public class ForFactory extends ExpressionFactory {

public ForFactory(){
		
	}
	@Override
	public void upLoad() {

		//For fo = new For();
		ClipBoard.putData(new For());
		registerIcon();
	}

}
