package com.bad_code.tapsey.codeonetwothree.app.model.expressions.container;

import java.util.ArrayList;
import java.util.Vector;

import com.bad_code.tapsey.codeonetwothree.app.controler.Element;
import com.bad_code.tapsey.codeonetwothree.app.controler.MainMethod;
import com.bad_code.tapsey.codeonetwothree.app.controler.UpperDock;
import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.view.container.MyClassView;
import com.bad_code.tapsey.codeonetwothree.environment.view.Window;

public class MyClass extends Element<Void> {

	String name;
	MainMethod main;
	Vector<UpperDock> docks;
	ArrayList<String> methodDeclarationNamespace = new ArrayList<String>();
	ArrayList<String> classVariableDeclarationNamespace = new ArrayList<String>();

	public MyClass(String name) {
		this.name = name;
		view = new MyClassView(name, this);
		Window.registerForRun(this);

	}

	@Override
	public boolean runElement(boolean animate) {

		docks = ((MyClassView) view).getDocks();
		// this returns the declaration phase of the class;
		for (UpperDock up : docks) {
			System.out.println("running dock " + up.getPosition());
			Element<Void> upEl = up.getElement();
			System.out.println("elemment is "+upEl +" @ position" + up.getPosition());
			if (upEl != null) {

				if (upEl.runElement(animate) != true) {
					
					return false;
				}
			}
		}

		if (methodDeclarationNamespace.contains("main")) {

			if (main.inVoke(animate)!= true) {
				// error in main run
				Window.getjConsole().println(
						"Error, App returned with exit status false");
				return false;
			}
			Window.getjConsole().println(
					"App returned successifully with exit status true");
			return true;
		} else {
			// no main method found, error
			Window.getjConsole().println(
					"Error, No main method found");
			
			return false;
		}
	}

	@Override
	public boolean isDockablehere(DataType dockDataType,
			DockLocation dockLocation) {
		// No need to implement this
		return false;
	}

	@Override
	public void flagNull() {
		// No need to implement this

	}

	public ArrayList<String> getMethodDeclarationNamespace() {
		return methodDeclarationNamespace;
	}

	public ArrayList<String> getClassVariableDeclarationNamespace() {
		return classVariableDeclarationNamespace;
	}

	public MainMethod getMain() {
		return main;
	}

	public void setMain(MainMethod main) {
		this.main = main;
	}

	@Override
	public void renderSource() {
		if(runElement(false)){
			
			Window.openFile();
			Window.writeSource("public class "+ name+ " {\n");
			//write other things
			
			for (UpperDock up : docks) {
				Element<Void> upEl = up.getElement();
				if (upEl != null) {

					 upEl.renderSource();
					
				}
			}
			
			Window.writeSource(" }");
			Window.closeFile();
			
			Window.getjConsole().println("Source rendered successifully");
		}else{
			
			Window.writeError("Programm contains Errors hence cannot render source");
		}
		
	}

	public String getName() {
		return name;
	}

}
