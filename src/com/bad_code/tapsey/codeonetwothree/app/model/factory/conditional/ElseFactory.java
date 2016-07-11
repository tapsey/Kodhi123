package com.bad_code.tapsey.codeonetwothree.app.model.factory.conditional;

import com.bad_code.tapsey.codeonetwothree.app.model.expressions.container.Else;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.ExpressionFactory;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;

@SuppressWarnings("serial")
public class ElseFactory extends ExpressionFactory {

public ElseFactory(){
		
	}
	
	@Override
	public void upLoad() {

		//Else el = new Else();
		ClipBoard.putData(new Else());
		registerIcon();

	}

}
