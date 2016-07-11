package com.bad_code.tapsey.codeonetwothree.app.model.factory.datatype;

import com.bad_code.tapsey.codeonetwothree.app.model.expressions.container.BooleanDeclarator;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.ExpressionFactory;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;

@SuppressWarnings("serial")
public class BooleanDeclaratorFactory extends ExpressionFactory {

public BooleanDeclaratorFactory(){
		
	}
	
	@Override
	public void upLoad() {

		//BooleanDeclarator bool = new BooleanDeclarator();
		ClipBoard.putData(new BooleanDeclarator());
		registerIcon();

	}

}
