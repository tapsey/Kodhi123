package com.bad_code.tapsey.codeonetwothree.app.model.factory.loop;

import com.bad_code.tapsey.codeonetwothree.app.model.expressions.container.While;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.ExpressionFactory;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;

@SuppressWarnings("serial")
public class WhileFactory extends ExpressionFactory {

	
public WhileFactory(){
		
	}
	
	@Override
	public void upLoad() {

		//While w = new While();
		ClipBoard.putData(new While());
		registerIcon();

	}

}
