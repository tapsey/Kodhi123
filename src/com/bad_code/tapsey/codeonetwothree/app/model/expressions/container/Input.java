package com.bad_code.tapsey.codeonetwothree.app.model.expressions.container;

import java.awt.Color;

import com.bad_code.tapsey.codeonetwothree.app.controler.Element;
import com.bad_code.tapsey.codeonetwothree.app.controler.LowerDockable;
import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.view.container.InputView;
import com.bad_code.tapsey.codeonetwothree.environment.console.JConsole;
import com.bad_code.tapsey.codeonetwothree.environment.view.Window;

public class Input extends Element<String> implements
		LowerDockable<String>, JConsole.Comms {
	boolean continueFlow;

	public Input(){
		view = new InputView(this);
	}
	
	// JConsole.registerForInput(this);
	// while(checkTrue() == false){
	//
	// try {
	// Thread.sleep(100);
	// } catch (InterruptedException e) {
	// e.printStackTrace();
	// }
	// System.out.println(checkTrue());
	//
	// }
	// JConsole.deRegisterForInput();

	@Override
	public void pushedValue(String s, JConsole console) {

		if (s.length() == 0) {
			// print error to console and stop run
		} else {
			// retrive value here
			setTrue();
			setData(s);
		}

	}

	public boolean checkTrue(){

		return continueFlow;
	}

	public void setTrue(){

		continueFlow = true;
	}

	@Override
	public boolean runElement(boolean animate) {
		 JConsole.registerForInput(this);
		 JConsole jc = Window.getjConsole();
		 jc.print(((InputView) view).getInputHintElement().getData() + " :",Color.GREEN);
		 while(checkTrue() == false){
		
		 try {
		 Thread.sleep(100);
		 } catch (InterruptedException e) {
		 e.printStackTrace();
		 }
		 System.out.println(checkTrue());
		
		 }
		 JConsole.deRegisterForInput();
		return true;
	}

	@Override
	public boolean isDockablehere(DataType dockDataType,
			DockLocation dockLocation) {
		if (dockDataType == DataType.STRING) {
			System.out.print("can be docked");
			return true;
		} else {
			Window.writeError(" input haakwanise kugadzikwa pano");
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
		// TODO Auto-generated method stub
		
	}

}
