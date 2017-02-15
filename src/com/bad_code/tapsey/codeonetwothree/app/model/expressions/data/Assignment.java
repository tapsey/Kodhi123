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

public class Assignment extends Element<Void> implements UpperDockable {

	// Object returnValue;
	VariableDock dock1;
	ObjectDock dock2;

	public Assignment() {
		dock1 = new VariableDock(DockLocation.ASSIGNMENT);
		// ((LowerDockView)dock1.getView()).clearDock();
		dock1.getView().setEnabled(false);
		dock2 = new ObjectDock(DockLocation.ASSIGNMENT);
		view = new BinaryOperatorView<Object, Void>("ngaave", Color.BLACK, "hint", dock1, dock2, this);

	}

	@Override
	public boolean runElement(boolean animate) {

		dock2.getElement().runElement(animate);

		System.out.println("can be docked  in var " + dock2.getElement().getData());

		Variable var = (Variable) dock1.getElement();

		System.out.println(" var is " + var.getData());

		DataType dataType = var.getVariableDataType();

		if (var.getVariableDataType() == DataType.INTEGER) {

			try {
				var.setData((int) dock2.getElement().getData());
			} catch (ClassCastException cls) {

				var.setData(Integer.parseInt(dock2.getElement().getData().toString()));
			}

		} else if (var.getVariableDataType() == DataType.DOUBLE) {
			try {
				var.setData((Double) dock2.getElement().getData());
			} catch (ClassCastException cls) {

				var.setData(Double.parseDouble(dock2.getElement().getData().toString()));
			}

		} else if (var.getVariableDataType() == DataType.STRING) {
			try {

				var.setData((String) dock2.getElement().getData());
			} catch (ClassCastException cls) {

				var.setData(dock2.getElement().getData().toString());
			}

		} else if (var.getVariableDataType() == DataType.BOOLEAN) {
			try {

				var.setData((Boolean) dock2.getElement().getData());
			} catch (ClassCastException cls) {

				var.setData(Boolean.parseBoolean(dock2.getElement().getData().toString()));
			}
		}

		return true;
	}

	@Override
	public boolean isDockablehere(DataType dockDataType, DockLocation dockLocation) {
		if (dockLocation != DockLocation.CLASS && dockLocation != DockLocation.METHOD_PARAMS
				&& dockDataType == DataType.Void) {
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

		((Variable) dock1.getElement()).getName();

		Window.writeSource(((Variable) dock1.getElement()).getName() + " = " + dock2.getElement().getData() + ";\n");

	}

}
