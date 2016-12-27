package com.bad_code.tapsey.codeonetwothree.environment.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
class MenuBar extends JMenuBar{
	public MenuBar() {
		setBackground(Color.WHITE);
		
		JMenu mnAbout = new JMenu("Nezvedu");
		add(mnAbout);
		
		JMenuItem mntmGraphicalCodeExplorer = new JMenuItem("Graphical Code Explorer");
		mnAbout.add(mntmGraphicalCodeExplorer);
		mntmGraphicalCodeExplorer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				

				About about = new About();
				about.setVisible(true);
				
			}
		});
		
		JMenuItem mntmHelp = new JMenuItem("Rubatsiro");
		mnAbout.add(mntmHelp);
	}

}
