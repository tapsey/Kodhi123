package com.bad_code.tapsey.codeonetwothree.app.model.factory.operator;

import com.bad_code.tapsey.codeonetwothree.app.model.expressions.data.Modulus;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.ExpressionFactory;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;

@SuppressWarnings("serial")
public class ModulusFactory extends ExpressionFactory {

public ModulusFactory(){
		
	}
	
	@Override
	public void upLoad() {

		//Modulus mo = new Modulus();
		ClipBoard.putData(new Modulus());
		registerIcon();

	}

}
