package com.bad_code.tapsey.codeonetwothree.app.model.factory.operator;

import com.bad_code.tapsey.codeonetwothree.app.model.expressions.data.Assignment;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.ExpressionFactory;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;

@SuppressWarnings("serial")
public class AssignmentFactory extends ExpressionFactory{

	@Override
	public void upLoad() {
		//Assignment g = new Assignment();
		ClipBoard.putData(new Assignment());
		registerIcon();
	}

}
