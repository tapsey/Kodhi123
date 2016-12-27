package com.bad_code.tapsey.codeonetwothree.environment.view;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.border.Border;

import com.bad_code.tapsey.codeonetwothree.app.view.MyButton;

import defaultvalues.Constants;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;

@SuppressWarnings("serial")
public class RibbonMenu extends JToolBar {
	Thread runThread;
	public RibbonMenu() {
		setBackground(new Color(51, 51, 51));
		
		Component rigidArea_5 = Box.createRigidArea(new Dimension(10, 10));
		add(rigidArea_5);

		JButton btnNewButton = new MyButton();
		btnNewButton.setIcon(new ImageIcon(getClass().getResource("/res/run.png")));
		btnNewButton.setToolTipText("Execute logic");
		add(btnNewButton);
		
	

		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				runThread = new Thread() {

					@Override
					public void run() {
						super.run();

						Window.getRunClass().runElement(false);
					}

				};

				runThread.start();
			}
		});
		
		Component rigidArea = Box.createRigidArea(new Dimension(10, 10));
		add(rigidArea);

		JButton btnNewButton_1 = new MyButton();
		btnNewButton_1.setIcon(new ImageIcon(getClass().getResource("/res/visualise.png")));
		btnNewButton_1.setToolTipText("Animate through logic.");
		add(btnNewButton_1);

		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				runThread = new Thread() {

					@Override
					public void run() {
						super.run();

						Window.getRunClass().runElement(true);
					}

				};

				runThread.start();
			}
		});
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(10, 10));
		add(rigidArea_1);

		JButton btnNewButton_2 = new MyButton();
		btnNewButton_2.setIcon(new ImageIcon(getClass().getResource("/res/pausebtn.png")));
		btnNewButton_2.setToolTipText("Pause execution");
		add(btnNewButton_2);

		btnNewButton_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				runThread.suspend();
			}
		});
		
		Component rigidArea_2 = Box.createRigidArea(new Dimension(10, 10));
		add(rigidArea_2);
		
		JButton btnNewButton_6 = new MyButton();
		btnNewButton_6.setIcon(new ImageIcon(getClass().getResource("/res/resume.png")));
		btnNewButton_6.setToolTipText("Resume execution");
		add(btnNewButton_6);

		btnNewButton_6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				runThread.resume();
			}
		});
		
		Component rigidArea_3 = Box.createRigidArea(new Dimension(10, 10));
		add(rigidArea_3);

		JButton btnStop = new MyButton();
		btnStop.setIcon(new ImageIcon(getClass().getResource("/res/stop.png")));
		btnStop.setToolTipText("Stop execution");
		add(btnStop);

		btnStop.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				runThread.stop();
				
				Window.getjConsole().println("Execution force stoped");
			}
		});
		
		Component rigidArea_4 = Box.createRigidArea(new Dimension(10, 10));
		add(rigidArea_4);

		JButton btnViewAs = new MyButton();
		btnViewAs.setIcon(new ImageIcon(getClass().getResource("/res/javasource.png")));
		btnViewAs.setToolTipText("View logic as would be implemented in various languages.");
		add(btnViewAs);
		
		Component rigidArea_6 = Box.createRigidArea(new Dimension(35, 35));
		add(rigidArea_6);
		
		btnViewAs.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				runThread = new Thread() {

					@Override
					public void run() {
						super.run();

						Window.getRunClass().renderSource();
					}

				};

				runThread.start();
			}
		});
	}

}
