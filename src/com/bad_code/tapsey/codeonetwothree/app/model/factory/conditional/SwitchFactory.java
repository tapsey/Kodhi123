package com.bad_code.tapsey.codeonetwothree.app.model.factory.conditional;

import com.bad_code.tapsey.codeonetwothree.app.model.expressions.container.Switch;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.ExpressionFactory;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;

@SuppressWarnings("serial")
public class SwitchFactory extends ExpressionFactory {

public SwitchFactory(){
		
	}
	
	@Override
	public void upLoad() {

		//Switch s = new Switch();
		ClipBoard.putData(new Switch());
		registerIcon();

	}

}
