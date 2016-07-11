package com.bad_code.tapsey.codeonetwothree.app.controler;

import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;

@SuppressWarnings("serial")
public class ParameterDockPane extends JPanel {

	Vector<ParameterDock> parameterDocks = new Vector<ParameterDock>();

	public ParameterDockPane() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		ParameterDock initialParamDock = new ParameterDock(this,DockLocation.METHOD_PARAMS);
		parameterDocks.add(initialParamDock);
		reAdaptParams(parameterDocks);
	}
	
	public ParameterDock addParameterDock(int position, DockLocation loc) {// 
		ParameterDock dock = new ParameterDock(this, loc);
		dock.setPosition(position + 1);
		parameterDocks.add(position + 1, dock);
		ParameterDock dock2 = new ParameterDock(this, loc);
		dock2.setPosition(position + 2);
		parameterDocks.add(position + 2, dock2);
		reAdaptParams(parameterDocks);
		return dock;
	}
	
	private void reAdaptParams(Vector<ParameterDock> docks) {
		removeAll();
		System.out.println("params adapting for " + docks.size()+ " items");

		for (int i = 0; i < docks.size(); i++) {
			add(docks.get(i).getView());
			System.out.println("added param view  " +docks.get(i).getView());
			docks.get(i).setPosition(i);
			System.out.println("at position "+ docks.get(i).getPosition());
		}

	}
	
	public Vector<ParameterDock> getParameterDocks(){
		return parameterDocks;
	}

	public void removeDock(int position) {
		System.out.println("list size b4 "+ parameterDocks.size());
		parameterDocks.remove(position);
		parameterDocks.remove(position);
		System.out.println("list size after "+ parameterDocks.size());
		reAdaptParams(parameterDocks);
		
	}

	public void disableMe() {
		// TODO Auto-generated method stub
		
	}
}
