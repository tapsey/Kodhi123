package com.bad_code.tapsey.codeonetwothree.app.model.expressions.container;
import java.awt.Color;

import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.datatypes.Variable;

public class IntDeclarator  extends VariableDeclarator<Integer>{
	
	
	public IntDeclarator(){		
		super(DataType.INTEGER);
		view.setVariableDataTypeName(DataType.INTEGER, Variable.VAR);
		view.setViewColor(Color.BLACK);
		
		
	}

	@Override
	public void renderSource() {
		// TODO Auto-generated method stub
		
	}
	

}
