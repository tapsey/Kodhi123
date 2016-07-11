package com.bad_code.tapsey.codeonetwothree.app.model.factory;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import com.bad_code.tapsey.codeonetwothree.environment.view.Window;

import java.awt.Font;
import java.awt.Color;

@SuppressWarnings("serial")
public abstract class ExpressionFactory extends JButton {

	private ImageIcon icon;

	public ExpressionFactory() {
		setBackground(Color.WHITE);
		setFont(new Font("Verdana", Font.BOLD, 12));
		
		// setIcon(icon);
		icon = new ImageIcon(getClass().getResource("/res/arrow.png"));
		
		addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

				upLoad();
			}
		});

	}

	
	public abstract void upLoad();

	public void registerIcon() {
		
		if(icon != null){
		// Get the default toolkit
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image image = icon.getImage();
		// Create the hotspot for the cursor
		Point hotSpot = new Point(0, 3);
		// Create the custom cursor
		Cursor cursor = toolkit.createCustomCursor(image, hotSpot, "Pencil");
		// Use the custom cursor
		Window.getAppPanel().setCursor(cursor);
		}
	}

}
