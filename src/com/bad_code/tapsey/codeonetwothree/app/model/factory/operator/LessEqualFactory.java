package com.bad_code.tapsey.codeonetwothree.app.model.factory.operator;

import com.bad_code.tapsey.codeonetwothree.app.model.expressions.data.LessEqual;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.ExpressionFactory;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;

@SuppressWarnings("serial")
public class LessEqualFactory extends ExpressionFactory {

public LessEqualFactory(){
		
	}
	
	@Override
	public void upLoad() {

		//LessEqual lq = new LessEqual();
		ClipBoard.putData(new LessEqual());
		registerIcon();

	}

}
