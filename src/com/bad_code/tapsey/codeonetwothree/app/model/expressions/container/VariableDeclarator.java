package com.bad_code.tapsey.codeonetwothree.app.model.expressions.container;

import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.model.datatypes.Variable;
import com.bad_code.tapsey.codeonetwothree.app.view.ElementView;
import com.bad_code.tapsey.codeonetwothree.app.view.container.DeclaratorView;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;
import com.bad_code.tapsey.codeonetwothree.environment.view.Window;

public abstract class VariableDeclarator<T> extends Declarator{

	private Variable<T> variable;
	protected int varType = Variable.VAR;
	public DataType dataType;
	protected DeclaratorView view;
	protected String name;
		
	{
		
	}
	
	public VariableDeclarator(DataType dataType){
		this.dataType = dataType;
		variable = new Variable<T>(this ,varType,dataType);
		view  = new DeclaratorView(this);
		}

	public int getType() {
		return varType;
	}
	public Variable<T> getVariable(){
		return variable;
	}

	public DataType getDataType() {
		return dataType;
	}

	@Override
	public ElementView getView() {
		return view;
	}
	
	public void setVariableName(String name){		
		variable.setName(name);
	}

	@Override
	public void declare(String s) {
		this.name = s;
		variable.setName(s);
		ClipBoard.putData(variable);
		registerIcon();
		
		
	}


	@Override
	public boolean runElement(boolean animate) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isDockablehere(DataType dockDataType,
			DockLocation dockLocation) {
		if (dockDataType == DataType.Void) {
			System.out.print("can be docked");
			return true;
		} else {
			Window.writeError(" Declarator harikwanise kugadzikwa pano");
			System.out.print("cant be docked");
			return false;

		}
	}

	@Override
	public void flagNull() {
		// TODO Auto-generated method stub
		
	}


	
}
