package com.bad_code.tapsey.codeonetwothree.app.model.factory.loop;

import com.bad_code.tapsey.codeonetwothree.app.model.expressions.container.Do;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.ExpressionFactory;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;

@SuppressWarnings("serial")
public class DoFactory extends ExpressionFactory {

public DoFactory(){
		
	}
	
	@Override
	public void upLoad() {

		//Do myDo = new Do();
		ClipBoard.putData(new Do());
		registerIcon();

	}

}
