package com.bad_code.tapsey.codeonetwothree.app.model.factory.methods;

import com.bad_code.tapsey.codeonetwothree.app.controler.MethodDeclaration;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.ExpressionFactory;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;

@SuppressWarnings("serial")
public class MethodDeclarationFactory extends ExpressionFactory {

public MethodDeclarationFactory(){
		
	}
	
	@Override
	public void upLoad() {

		//MethodDeclaration m = new MethodDeclaration();
		ClipBoard.putData( new MethodDeclaration());
		registerIcon();

	}

}
