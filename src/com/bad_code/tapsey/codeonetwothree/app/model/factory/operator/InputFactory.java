package com.bad_code.tapsey.codeonetwothree.app.model.factory.operator;

import com.bad_code.tapsey.codeonetwothree.app.model.expressions.container.Input;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.ExpressionFactory;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;

@SuppressWarnings("serial")
public class InputFactory extends ExpressionFactory{

	public InputFactory() {

		//setIcon(new ImageIcon(getClass().getResource("/res/icon.jpg")));
	}

	@Override
	public void upLoad() {
		//Input print = new Input();
		ClipBoard.putData(new Input());
		registerIcon();

	}
}
