package com.bad_code.tapsey.codeonetwothree.app.model.expressions.container;

import java.awt.Color;

import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.datatypes.Variable;

public class DoubleDeclarator extends VariableDeclarator<Double>{
	
	public DoubleDeclarator(){		
		super(DataType.DOUBLE);
		view.setVariableDataTypeName(DataType.DOUBLE, Variable.VAR);
		view.setViewColor(Color.ORANGE);
		
	}

	@Override
	public void renderSource() {
		// TODO Auto-generated method stub
		
	}


}
