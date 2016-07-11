package com.bad_code.tapsey.codeonetwothree.app.model.factory.conditional;

import com.bad_code.tapsey.codeonetwothree.app.model.expressions.container.Case;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.ExpressionFactory;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;

@SuppressWarnings("serial")
public class CaseFactory extends ExpressionFactory{
	
	
	public CaseFactory(){
		
	}
	@Override
	public void upLoad() {

		ClipBoard.putData( new Case());
		registerIcon();

	}


}
