package com.bad_code.tapsey.codeonetwothree.app.model.factory.operator;

import com.bad_code.tapsey.codeonetwothree.app.model.expressions.data.Equal;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.ExpressionFactory;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;

@SuppressWarnings("serial")
public class EqualFactory extends ExpressionFactory {

	
public EqualFactory(){
		
	}
	@Override
	public void upLoad() {

		//Equal eq = new Equal();
		ClipBoard.putData( new Equal());
		registerIcon();

	}

}
