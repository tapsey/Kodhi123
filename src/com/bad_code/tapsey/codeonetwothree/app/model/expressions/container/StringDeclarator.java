package com.bad_code.tapsey.codeonetwothree.app.model.expressions.container;

import java.awt.Color;

import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.datatypes.Variable;
import com.bad_code.tapsey.codeonetwothree.environment.view.Window;

public class StringDeclarator extends VariableDeclarator<String>{
	
	public StringDeclarator(){		
		super(DataType.STRING);
		view.setVariableDataTypeName(DataType.STRING, Variable.VAR);
		view.setViewColor(Color.BLUE);
		
		
	}

	@Override
	public void renderSource() {
		Window.writeSource("String " + name + ";\n");
		
	}
	
	

}
