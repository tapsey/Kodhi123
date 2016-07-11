package com.bad_code.tapsey.codeonetwothree.environment.view;

import java.awt.Color;

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
		
		JMenuItem mntmHelp = new JMenuItem("Rubatsiro");
		mnAbout.add(mntmHelp);
	}

}
