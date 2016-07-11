package com.bad_code.tapsey.codeonetwothree.app.controler;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.model.datatypes.MethodCall;
import com.bad_code.tapsey.codeonetwothree.app.model.datatypes.Variable;
import com.bad_code.tapsey.codeonetwothree.app.model.expressions.container.BooleanDeclarator;
import com.bad_code.tapsey.codeonetwothree.app.model.expressions.container.DoubleDeclarator;
import com.bad_code.tapsey.codeonetwothree.app.model.expressions.container.IntDeclarator;
import com.bad_code.tapsey.codeonetwothree.app.model.expressions.container.StringDeclarator;
import com.bad_code.tapsey.codeonetwothree.app.view.container.MethodDeclarationView;
import com.bad_code.tapsey.codeonetwothree.environment.context.ClipBoard;
import com.bad_code.tapsey.codeonetwothree.environment.view.Window;


public class MethodDeclaration extends Element<Void> implements UpperDockable {
	
	String methodName;

	private ImageIcon icon;
	ArrayList<String> methodDeclarationNamespace;
	ArrayList<String> classVariableDeclarationNamespace;
	ArrayList<String> innerMethodVariableDeclarationNamespace = new ArrayList<String>();
	ArrayList<LowerDock> argumentDockList = new ArrayList<LowerDock>();
	ArrayList<Variable> varList = new ArrayList<Variable>();
	public MethodDeclaration() {
		icon = new ImageIcon(getClass().getResource("/res/arrow.png"));
		classVariableDeclarationNamespace = Window.getRunClass().getClassVariableDeclarationNamespace();
		methodDeclarationNamespace = Window.getRunClass().getMethodDeclarationNamespace();
		view = new MethodDeclarationView(this);	


	}

	
	public void registerIcon() {

		if (icon != null) {
			// Get the default toolkit
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			Image image = icon.getImage();
			// Create the hotspot for the cursor
			Point hotSpot = new Point(0, 0);
			// Create the custom cursor
			Cursor cursor = toolkit
					.createCustomCursor(image, hotSpot, "Pencil");
			// Use the custom cursor
			Window.getAppPanel().setCursor(cursor);
		}
	}


	@Override
	public boolean runElement(boolean animate) {

		
		return true;
	}

	@Override
	public boolean isDockablehere(DataType dockDataType,
			DockLocation dockLocation) {
		if (dockDataType == DataType.Void && dockLocation == DockLocation.CLASS) {
			System.out.print("can be docked");
			return true;
		} else {
			Window.writeError(" method declaration haakwanise kugadzikwa pano");
			System.out.print("cant be docked");
			return false;

		}
	}

	@Override
	public void flagNull() {
		// TODO Auto-generated method stub
		
	}

	public void declareMethod() {
		((MethodDeclarationView)view).disableView();
		registerIcon();
		if(argumentDockList.isEmpty() && varList.isEmpty()){
	for(ParameterDock pd :((MethodDeclarationView)view).getParamDockList()){
			
		//if(){
			Element<Void> el = pd.getElement();
			//el.runElement(animate);
			
			if(el instanceof StringDeclarator){
				argumentDockList.add( new StringDock(DockLocation.METHOD_ARGUMENT));
				varList.add(((StringDeclarator)el).getVariable());
				innerMethodVariableDeclarationNamespace.add(((StringDeclarator)el).getVariable().getName());
			}else if(el instanceof IntDeclarator){
				argumentDockList.add( new IntDock(DockLocation.METHOD_ARGUMENT));
				varList.add(((IntDeclarator)el).getVariable());
				innerMethodVariableDeclarationNamespace.add(((IntDeclarator)el).getVariable().getName());				
			}else if(el instanceof DoubleDeclarator){				
				argumentDockList.add( new DoubleDock(DockLocation.METHOD_ARGUMENT));
				varList.add(((DoubleDeclarator)el).getVariable());
				innerMethodVariableDeclarationNamespace.add(((DoubleDeclarator)el).getVariable().getName());
			}else if(el instanceof BooleanDeclarator){
				argumentDockList.add( new BooleanDock(DockLocation.METHOD_ARGUMENT));
				varList.add(((BooleanDeclarator)el).getVariable());
				innerMethodVariableDeclarationNamespace.add(((BooleanDeclarator)el).getVariable().getName());				
			}else{
				//return false;
			}
			
		}
		}
		
	//	MethodCall<T> meth = new MethodCall(argumentDockList, ((MethodDeclarationView)view).getReturnType() );
		
		if(((MethodDeclarationView)view).getReturnType() == DataType.BOOLEAN){
			MethodCall meth = new MethodCall(argumentDockList, varList,this,((MethodDeclarationView)view).getReturnType() );
			System.out.println("method call created + " + meth);
			ClipBoard.putData(meth);
//			registerIcon();
		}else
			if(((MethodDeclarationView)view).getReturnType() == DataType.INTEGER){
				MethodCall meth = new MethodCall(argumentDockList, varList,this,((MethodDeclarationView)view).getReturnType() );
				System.out.println("method call created + " + meth);
				ClipBoard.putData(meth);
//				registerIcon();
			}else
				if(((MethodDeclarationView)view).getReturnType() == DataType.DOUBLE){
					MethodCall meth = new MethodCall(argumentDockList,varList, this,((MethodDeclarationView)view).getReturnType() );
					System.out.println("method call created + " +meth);
					ClipBoard.putData(meth);
//					registerIcon();
				}else
					if(((MethodDeclarationView)view).getReturnType() == DataType.STRING){
						MethodCall meth = new MethodCall(argumentDockList, varList,this,((MethodDeclarationView)view).getReturnType() );
						System.out.println("method call created + " +meth);
						ClipBoard.putData(meth);
//						registerIcon();
					}else
						if(((MethodDeclarationView)view).getReturnType() == DataType.Void){
							MethodCall meth = new MethodCall(argumentDockList, varList,this,((MethodDeclarationView)view).getReturnType() );
							System.out.println("method call created + " +meth);
							ClipBoard.putData(meth);
//							registerIcon();
						}
		
		
		
	}
	

	public boolean validateAndUpdatename(String text) {
		// adding method name to name space as it is being type
		if(!(methodDeclarationNamespace.contains(methodName))){
			methodName = text;
			//methodDeclarationNamespace.add(methodName);
			return true;
		}else{
			//error name already exits
			return false;
		}
		
	}

	@Override
	public void renderSource() {
		// TODO Auto-generated method stub
		
	}

		
	}
	
	

