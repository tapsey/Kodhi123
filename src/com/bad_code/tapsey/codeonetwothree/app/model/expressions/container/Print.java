package com.bad_code.tapsey.codeonetwothree.app.model.expressions.container;

import com.bad_code.tapsey.codeonetwothree.app.controler.Element;
import com.bad_code.tapsey.codeonetwothree.app.controler.UpperDockable;
import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.model.datatypes.Variable;
import com.bad_code.tapsey.codeonetwothree.app.view.container.PrintView;
import com.bad_code.tapsey.codeonetwothree.environment.console.JConsole;
import com.bad_code.tapsey.codeonetwothree.environment.view.Window;

public class Print extends Element<Object> implements UpperDockable{

		
	public Print(){
		
		view = new PrintView(this);
	}


	@Override
	public boolean runElement(boolean animate) {

		Element<Object> el = ((PrintView)view).getPrintElement();
		if(el.runElement(animate)){		
		System.out.println("after running literal element and data is " + el.getData());		
		JConsole jc = Window.getjConsole();
		jc.println(el.getData().toString());
		return true;
		}else{
		return false;
		}
	}

	@Override
	public boolean isDockablehere(DataType dockDataType,
			DockLocation dockLocation) {
		if (dockDataType == DataType.Void && dockLocation != DockLocation.CLASS) {
			System.out.print("can be docked");
			return true;
		} else {
			Window.writeError(" nyora haakwanise kugadzikwa pano");
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
		Element<Object> el = ((PrintView)view).getPrintElement();
		Window.writeSource("System.out.println(" + ((Variable )el).getName() + ");\n");
		
	}

}
