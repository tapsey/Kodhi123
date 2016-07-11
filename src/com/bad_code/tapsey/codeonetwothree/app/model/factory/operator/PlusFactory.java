package com.bad_code.tapsey.codeonetwothree.app.model.factory.operator;

import com.bad_code.tapsey.codeonetwothree.app.model.expressions.data.Plus;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.ExpressionFactory;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;

@SuppressWarnings("serial")
public class PlusFactory extends ExpressionFactory {

public PlusFactory(){
		
	}
	
	@Override
	public void upLoad() {

		//Plus p = new Plus();
		ClipBoard.putData(new Plus());
		registerIcon();

	}

}
