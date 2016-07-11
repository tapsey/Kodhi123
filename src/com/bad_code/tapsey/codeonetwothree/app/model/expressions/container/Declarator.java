package com.bad_code.tapsey.codeonetwothree.app.model.expressions.container;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.ImageIcon;

import com.bad_code.tapsey.codeonetwothree.app.controler.Element;
import com.bad_code.tapsey.codeonetwothree.app.controler.ParameterDockable;
import com.bad_code.tapsey.codeonetwothree.app.controler.UpperDockable;
import com.bad_code.tapsey.codeonetwothree.environment.view.Window;

public abstract class Declarator extends Element<Void> implements
		UpperDockable , ParameterDockable{
	private ImageIcon icon;
	
	public Declarator(){
		icon = new ImageIcon(getClass().getResource("/res/arrow.png"));
	}

	public void registerIcon() {

		if (icon != null) {
			// Get the default toolkit
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			Image image = icon.getImage();
			// Create the hotspot for the cursor
			Point hotSpot = new Point(0, 3);
			// Create the custom cursor
			Cursor cursor = toolkit
					.createCustomCursor(image, hotSpot, "Pencil");
			// Use the custom cursor
			Window.getAppPanel().setCursor(cursor);
		}
	}

	public void setIcon(ImageIcon icon) {
		this.icon = icon;
	}

	public abstract void declare(String s);
}
