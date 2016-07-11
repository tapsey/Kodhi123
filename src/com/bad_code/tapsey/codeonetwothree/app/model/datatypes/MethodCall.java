package com.bad_code.tapsey.codeonetwothree.app.model.datatypes;

import java.util.ArrayList;
import java.util.Vector;

import com.bad_code.tapsey.codeonetwothree.app.controler.Element;
import com.bad_code.tapsey.codeonetwothree.app.controler.LowerDock;
import com.bad_code.tapsey.codeonetwothree.app.controler.LowerDockable;
import com.bad_code.tapsey.codeonetwothree.app.controler.MethodDeclaration;
import com.bad_code.tapsey.codeonetwothree.app.controler.UpperDock;
import com.bad_code.tapsey.codeonetwothree.app.controler.UpperDockable;
import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.view.container.MethodDeclarationView;
import com.bad_code.tapsey.codeonetwothree.app.view.variable.MethodCallView;

public class MethodCall extends Element implements LowerDockable, UpperDockable {
	ArrayList<Variable> varList;
	ArrayList<LowerDock> argumentDockList;
	MethodDeclaration methodDeclaration;
	Vector<UpperDock> bodyDocks;
	DataType returnType;
	public MethodCall(ArrayList<LowerDock> argumentDockList,
			ArrayList<Variable> varList, MethodDeclaration methodDeclaration, DataType returnType) {
		this.varList = varList;
		this.argumentDockList = argumentDockList;
		this.methodDeclaration = methodDeclaration;
		this.returnType = returnType;
		view = new MethodCallView(argumentDockList, this, ((MethodDeclarationView) methodDeclaration.getView()).getMethodName());
	}
	
	
	@Override
	public boolean runElement(boolean animate) {
		int i = 0;
		for(LowerDock ld :argumentDockList ){
			
			if(!(ld.getElement().runElement(animate))){
				return false;
			}
			varList.get(i).setData(ld.getElement().getData());
			i++;
		}
		// run method declaration body
		
		bodyDocks = ((MethodDeclarationView) methodDeclaration.getView()).getBodyDockList();
		
		for(UpperDock bd : bodyDocks){
			
			if(bd.getElement() != null){
				
				if(!(bd.getElement().runElement(animate))){
					
					return false;
				}
			}
			
			
		}
		
		return true;
	}

	@Override
	public boolean isDockablehere(DataType dockDataType,
			DockLocation dockLocation) {
		
		return true;
	}

	@Override
	public void flagNull() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void renderSource() {
		// TODO Auto-generated method stub
		
	}
	


}
