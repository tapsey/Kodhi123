package com.bad_code.tapsey.codeonetwothree.app.model.factory.datatype;

import com.bad_code.tapsey.codeonetwothree.app.model.expressions.container.IntDeclarator;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.ExpressionFactory;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;

@SuppressWarnings("serial")
public class IntDeclaratorFactory extends ExpressionFactory {

public IntDeclaratorFactory(){
		
	}
	
	@Override
	public void upLoad() {

		//IntDeclarator mD = new IntDeclarator();
		ClipBoard.putData(new IntDeclarator());
		registerIcon();

	}

}
