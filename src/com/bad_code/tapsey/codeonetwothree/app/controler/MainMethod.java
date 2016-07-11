package com.bad_code.tapsey.codeonetwothree.app.controler;

import java.util.ArrayList;
import java.util.Vector;

import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.view.container.MainMethodView;
import com.bad_code.tapsey.codeonetwothree.environment.view.Window;

public class MainMethod extends Element<Void> implements UpperDockable{

	ArrayList<String> methodDeclarationNamespace;
	Vector<UpperDock> docks;
	public MainMethod(){
		view = new MainMethodView(this);	
		methodDeclarationNamespace = Window.getRunClass().getMethodDeclarationNamespace();
		
		Window.getRunClass().setMain(this);
		
	}

	@Override
	public boolean runElement(boolean animate) {
		methodDeclarationNamespace.add("main");
		
		return true;
	}

	@Override
	public boolean isDockablehere(DataType dockDataType,
			DockLocation dockLocation) {
		if (dockDataType == DataType.Void && dockLocation == DockLocation.CLASS) {
			System.out.print("can be docked");
			return true;
		} else {
			Window.writeError(" mavambo haakwanise kugadzikwa pano");
			System.out.print("cant be docked");
			return false;

		}
	}

	@Override
	public void flagNull() {
		// TODO Auto-generated method stub
		
	}
	
	public boolean inVoke(boolean animate){
		docks = ((MainMethodView) view).getDocks();
		//running docks in main
				for (UpperDock up : docks) { 

					Element<Void> upEl = up.getElement();

					if (upEl != null) {

						if(upEl.runElement(animate) != true){
							System.out.println("main returned false");
							return false;
						}
					}
				}
				
				System.out.println("main method executed successifully");
		return true;
	}

	@Override
	public void renderSource() {
		Window.writeSource("public static void main(Strings args[]){\n");
		docks = ((MainMethodView) view).getDocks();
		//running docks in main
				for (UpperDock up : docks) { 

					Element<Void> upEl = up.getElement();

					if (upEl != null) {

						upEl.renderSource();
					}
				}
		
		Window.writeSource("}\n");
	}

	
	
}
