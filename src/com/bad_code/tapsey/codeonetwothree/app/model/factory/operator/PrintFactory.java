package com.bad_code.tapsey.codeonetwothree.app.model.factory.operator;

import javax.swing.ImageIcon;

import com.bad_code.tapsey.codeonetwothree.app.model.expressions.container.Print;
import com.bad_code.tapsey.codeonetwothree.app.model.factory.ExpressionFactory;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;

public class PrintFactory extends ExpressionFactory {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PrintFactory() {

		
	}

	@Override
	public void upLoad() {
		//Print print = new Print();
		ClipBoard.putData(new Print());
		registerIcon();

	}

}
