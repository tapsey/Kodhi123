package com.bad_code.tapsey.codeonetwothree.app.model.datatypes;

import java.awt.Color;

import com.bad_code.tapsey.codeonetwothree.app.controler.Element;
import com.bad_code.tapsey.codeonetwothree.app.controler.LowerDockable;
import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.model.expressions.container.Declarator;
import com.bad_code.tapsey.codeonetwothree.app.view.ElementView;
import com.bad_code.tapsey.codeonetwothree.app.view.variable.VariableView;
import com.bad_code.tapsey.codeonetwothree.environment.view.Window;

public class Variable<T> extends Element<T> implements LowerDockable<T> {

	private String name;
	private int varType;
//	ElementView parent;

	public static final int VAR = 1;
	public static final int CONST = 2;
	DataType dataType;
	Declarator dec;
		public Variable(Declarator dec, int varType, DataType dataType) {
			this.dataType = dataType;
			this.varType = varType;
			this.dec = dec;

		}

	public String getName() {
		return name;
	}
	
	public int getVarType() {
		return varType;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DataType getVariableDataType(){
		
		return dataType;
		
	}

	@Override
	public ElementView getView() {
		view = new VariableView(dec,this);
		view.setViewColor(Color.GRAY);
		view.setName(name);
		return super.getView();
	}

	@Override
	public boolean runElement(boolean animate) {
		// No logic to run
		return true;
	}

	@Override
	public boolean isDockablehere(DataType dockDataType,
			DockLocation dockLocation) {
		if (dockDataType != DataType.Void) {
			System.out.print("can be docked");
			return true;
		} else {
			Window.writeError(" variable haakwanise kugadzikwa pano");
			System.out.print("cant be docked");
			return false;

		}
	}

	@Override
	public void flagNull() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setData(T data) {	

		
		super.setData(data);
	}

	@Override
	public void renderSource() {
		// TODO Auto-generated method stub
		
	}
	
	

	

}
