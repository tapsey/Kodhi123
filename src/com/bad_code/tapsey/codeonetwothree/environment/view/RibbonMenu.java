package com.bad_code.tapsey.codeonetwothree.environment.view;

import javax.swing.JButton;
import javax.swing.JToolBar;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class RibbonMenu extends JToolBar {
	Thread runThread;
	public RibbonMenu() {
		setBackground(new Color(51, 51, 51));

		JButton btnNewButton = new JButton("Fambisa");
		btnNewButton.setToolTipText("Execute logic");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBackground(new Color(51, 51, 51));
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

		JButton btnNewButton_1 = new JButton("Wona mafambiro");
		btnNewButton_1.setToolTipText("Animate through logic.");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBackground(new Color(51, 51, 51));
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

		JButton btnNewButton_2 = new JButton("Zorodza");
		btnNewButton_2.setToolTipText("Pause execution");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setBackground(new Color(51, 51, 51));
		add(btnNewButton_2);

		btnNewButton_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				runThread.suspend();
			}
		});
		
		JButton btnNewButton_6 = new JButton("Enderera mberi");
		btnNewButton_6.setToolTipText("Resume execution");
		btnNewButton_6.setForeground(new Color(255, 255, 255));
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_6.setBackground(new Color(51, 51, 51));
		add(btnNewButton_6);

		btnNewButton_6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				runThread.resume();
			}
		});

		JButton btnStop = new JButton("Mira");
		btnStop.setToolTipText("Stop execution");
		btnStop.setForeground(new Color(255, 255, 255));
		btnStop.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnStop.setBackground(new Color(51, 51, 51));
		add(btnStop);

		btnStop.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				runThread.stop();
				
				Window.getjConsole().println("Execution force stoped");
			}
		});

		JButton btnViewAs = new JButton("wona zvazviri kuJAVA");
		btnViewAs.setToolTipText("View logic as would be implemented in various languages.");
		btnViewAs.setForeground(new Color(255, 255, 255));
		btnViewAs.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnViewAs.setBackground(new Color(51, 51, 51));
		add(btnViewAs);
		
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
