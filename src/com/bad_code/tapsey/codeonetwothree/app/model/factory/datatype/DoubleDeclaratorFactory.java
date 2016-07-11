package com.bad_code.tapsey.codeonetwothree.app.model.factory.datatype;

import com.bad_code.tapsey.codeonetwothree.app.model.expressions.container.DoubleDeclarator;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.ExpressionFactory;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;

@SuppressWarnings("serial")
public class DoubleDeclaratorFactory extends ExpressionFactory {

public DoubleDeclaratorFactory(){
		
	}
	
	@Override
	public void upLoad() {

		//DoubleDeclarator mD = new DoubleDeclarator();
		ClipBoard.putData(new DoubleDeclarator());
		registerIcon();

	}

}
