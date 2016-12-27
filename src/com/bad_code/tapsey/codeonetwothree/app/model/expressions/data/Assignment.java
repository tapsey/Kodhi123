package com.bad_code.tapsey.codeonetwothree.app.model.expressions.data;

import java.awt.Color;

import com.bad_code.tapsey.codeonetwothree.app.controler.Element;
import com.bad_code.tapsey.codeonetwothree.app.controler.ObjectDock;
import com.bad_code.tapsey.codeonetwothree.app.controler.UpperDockable;
import com.bad_code.tapsey.codeonetwothree.app.controler.VariableDock;
import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.model.datatypes.Variable;
import com.bad_code.tapsey.codeonetwothree.app.view.LowerDockView;
import com.bad_code.tapsey.codeonetwothree.app.view.expression.BinaryOperatorView;
import com.bad_code.tapsey.codeonetwothree.environment.view.Window;

public class Assignment extends Element<Void> implements UpperDockable{

//	Object returnValue;
	VariableDock dock1;
	ObjectDock dock2;
	
	public Assignment(){
		dock1 = new VariableDock(DockLocation.ASSIGNMENT);
		((LowerDockView)dock1.getView()).clearDock();
		dock2 = new ObjectDock(DockLocation.ASSIGNMENT);
		view = new BinaryOperatorView<Object, Void>("ngaave", Color.BLACK,
				"hint", dock1, dock2,this);
		
	}
	
	
	@Override
	public boolean runElement(boolean animate) {
		
		dock2.getElement().runElement(animate);
		
		Variable var = (Variable) dock1.getElement();
		DataType dataType = var.getVariableDataType();
		
		if(var.getVariableDataType() == DataType.INTEGER){
			
			var.setData((int)dock2.getElement().getData());
			
		}else if(var.getVariableDataType() == DataType.DOUBLE){
			var.setData((Double)dock2.getElement().getData());
			
		} else if(var.getVariableDataType() == DataType.STRING){
			var.setData((String)dock2.getElement().getData());
			
		} else if(var.getVariableDataType() == DataType.BOOLEAN){
			
			var.setData((Boolean)dock2.getElement().getData());
		}
		
		return true;
	}
	@Override
	public boolean isDockablehere(DataType dockDataType,
			DockLocation dockLocation) {
		if (dockLocation != DockLocation.CLASS && dockLocation != DockLocation.METHOD_PARAMS && dockDataType == DataType.Void) {
			System.out.print("can be docked");
			return true;
		} else {
			Window.writeError(" ngaave haakwanise kugadzikwa pano");
			System.out.print("cant be docked");
			return false;

		}
	}

	@Override
	public void flagNull() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void renderSource() {
		 
		((Variable)dock1.getElement()).getName();
		
		Window.writeSource(((Variable)dock1.getElement()).getName() + " = " + dock2.getElement().getData() + ";\n");
		
	}
	

}
