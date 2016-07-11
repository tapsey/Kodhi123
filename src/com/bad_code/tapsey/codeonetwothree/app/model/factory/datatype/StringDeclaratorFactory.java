package com.bad_code.tapsey.codeonetwothree.app.model.factory.datatype;

import com.bad_code.tapsey.codeonetwothree.app.model.expressions.container.StringDeclarator;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.ExpressionFactory;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;

@SuppressWarnings("serial")
public class StringDeclaratorFactory extends ExpressionFactory {

public StringDeclaratorFactory(){
		
	}
	
	@Override
	public void upLoad() {

		//StringDeclarator s = new StringDeclarator();
		ClipBoard.putData( new StringDeclarator());
		registerIcon();

	}

}
