package com.bad_code.tapsey.codeonetwothree.app.model.factory.conditional;

import com.bad_code.tapsey.codeonetwothree.app.model.expressions.container.If;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.ExpressionFactory;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;

@SuppressWarnings("serial")
public class IfFactory extends ExpressionFactory {

public IfFactory(){
		
	}
	
	@Override
	public void upLoad() {

		//If f = new If();
		ClipBoard.putData(new If());
		registerIcon();
	}

}
