package com.bad_code.tapsey.codeonetwothree.app.model.factory.loop;

import com.bad_code.tapsey.codeonetwothree.app.model.expressions.container.Repeat;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.ExpressionFactory;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;

@SuppressWarnings("serial")
public class RepeatFactory extends ExpressionFactory {

	
public RepeatFactory(){
		
	}
	
	@Override
	public void upLoad() {

		//While w = new While();
		ClipBoard.putData(new Repeat());
		registerIcon();

	}

}
