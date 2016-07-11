package com.bad_code.tapsey.codeonetwothree.app.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Box;

import com.bad_code.tapsey.codeonetwothree.app.controler.ParameterDock;

@SuppressWarnings("serial")
public class ParameterDockView extends DockView {
	ParameterDock d;

	public ParameterDockView(ParameterDock din) {
		setBackground(Color.WHITE);
		d = din;
		setLayout(new BorderLayout(0, 0));
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		add(horizontalStrut, BorderLayout.CENTER);
		System.out.println("paarameter dock view created");

		addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// no need for this

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// no need for this
			}

			@Override
			public void mouseExited(MouseEvent e) {
				setBackground(Color.WHITE);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				
				setBackground(Color.GREEN);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.out.println("ParameterDockView called dock()");
				d.dock();
			}
		});
	}

	@Override
	public void animate() throws InterruptedException {
		setBackground(Color.GREEN);
		Thread.sleep(500);
		setBackground(new Color(51, 51, 51));
	}

	
	public void unDockChild() {
		d.unDock();
	}

	@Override
	public String getInput() {
		// Do nothing
		return null;
	}
	

}
