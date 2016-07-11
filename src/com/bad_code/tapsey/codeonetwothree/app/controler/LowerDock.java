package com.bad_code.tapsey.codeonetwothree.app.controler;

import java.awt.BorderLayout;

import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.view.DockView;
import com.bad_code.tapsey.codeonetwothree.app.view.LowerDockView;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;
import com.bad_code.tapsey.codeonetwothree.environment.view.Window;

public abstract class LowerDock<T> extends Dock<T>{

	protected DataType supportedType;
		{
			view = new LowerDockView(this);
	}
	
	public LowerDock(DockLocation loc, DataType supportedType) {
		super(loc);
		this.supportedType = supportedType;
	}

	
	@SuppressWarnings("unchecked")
	public void dock(){
		element =  ClipBoard.getData();
		deRegisterIcon();
		System.out.println("before lower docking data is  " +element);
			if( element != null ){				
				System.out.println("lower docking data is not null ");
				if(element instanceof LowerDockable /* && element.isDockablehere(DataType.Void, loc )*/){
					System.out.println("lower docking successiful");
					element.setParentDock(this);
					((LowerDockView)view).clearDock();
					view.add(element.getView(),BorderLayout.CENTER);
					Window.repaintPane();
				}else{
					Window.writeError(" panodiwa ma:" + supportedType.getDesc() + " chete");
				}
				
			}
		}
		
	public abstract void dockLiteral();
	
	public void unDock() {
		element = null;
		(( LowerDockView) view).restoreDock();
				
	}
	
	public Element<T> getElement(){
		if(element == null){
			dockLiteral();
		}
			return element;
	}
	
	
	private void animateLiteral() throws InterruptedException{
		view.animate();
	}
	
	
	class Literal extends Element<T>{
				
		
		public void invokeAnimate() {
			try {
				animateLiteral();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		@Override
		public boolean runElement(boolean animate) {
			// No logic to run
			
			if(animate){
				invokeAnimate();
			}
			System.out.println("running literal element and data is " + getData());
			return true;
		}

		@Override
		public boolean isDockablehere(DataType dockDataType,
				DockLocation dockLocation) {
			// NEVER DOCKABLE
			return false;
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

}
