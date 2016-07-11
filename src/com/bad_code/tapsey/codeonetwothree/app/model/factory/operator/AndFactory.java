package com.bad_code.tapsey.codeonetwothree.app.model.factory.operator;

import com.bad_code.tapsey.codeonetwothree.app.model.expressions.data.And;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.ExpressionFactory;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;

@SuppressWarnings("serial")
public class AndFactory extends ExpressionFactory {

	
	public AndFactory(){
		
	}
	
	@Override
	public void upLoad() {

		//And and = new And();
		ClipBoard.putData(new And());
		registerIcon();

	}

}
