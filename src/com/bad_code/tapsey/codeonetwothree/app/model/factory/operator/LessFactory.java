package com.bad_code.tapsey.codeonetwothree.app.model.factory.operator;

import com.bad_code.tapsey.codeonetwothree.app.model.expressions.data.Less;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.ExpressionFactory;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;

@SuppressWarnings("serial")
public class LessFactory extends ExpressionFactory {

public LessFactory(){
		
	}
	
	@Override
	public void upLoad() {

		//Less l = new Less();
		ClipBoard.putData( new Less());
		registerIcon();

	}

}
