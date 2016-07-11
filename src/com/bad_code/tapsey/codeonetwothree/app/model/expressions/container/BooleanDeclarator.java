package com.bad_code.tapsey.codeonetwothree.app.model.expressions.container;
import java.awt.Color;

import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.datatypes.Variable;

public class BooleanDeclarator extends VariableDeclarator<Boolean> {
	
	public BooleanDeclarator(){
		super(DataType.BOOLEAN);
		view.setVariableDataTypeName(DataType.BOOLEAN, Variable.VAR);
		view.setViewColor(Color.magenta);
	
	}

	@Override
	public void renderSource() {
		// TODO Auto-generated method stub
		
	}
	

}
