package com.bad_code.tapsey.codeonetwothree.app.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Box;

import com.bad_code.tapsey.codeonetwothree.app.controler.UpperDock;

@SuppressWarnings("serial")
public class UpperDockView extends DockView {

	UpperDock d;

	public UpperDockView(UpperDock din) {
		setBackground(new Color(51, 51, 51));
		this.d = din;
		setLayout(new BorderLayout(0, 0));
		
		Component verticalStrut = Box.createVerticalStrut(6);
		add(verticalStrut, BorderLayout.CENTER);
		
		Component horizontalStrut = Box.createHorizontalStrut(6);
		add(horizontalStrut, BorderLayout.NORTH);

		addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// no need for this

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// No need for this
			}

			@Override
			public void mouseExited(MouseEvent e) {
				
				setBackground(new Color(51, 51, 51));
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				

				setBackground(Color.GREEN);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
								
			System.out.println("upperDockView called dock()");	
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


	
	public void unDockChild(){
		d.unDock();
	}

	@Override
	public String getInput() {
		// Do nothing
		return null;
	}

	

}
