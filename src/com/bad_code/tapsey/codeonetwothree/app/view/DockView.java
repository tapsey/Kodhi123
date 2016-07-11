package com.bad_code.tapsey.codeonetwothree.app.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

import com.bad_code.tapsey.codeonetwothree.app.controler.ParameterDock;
import com.bad_code.tapsey.codeonetwothree.app.controler.UpperDock;
import com.bad_code.tapsey.codeonetwothree.app.model.Data;

@SuppressWarnings("serial")
public abstract class DockView extends JPanel {

	protected JPanel docksContainer;
	protected DockView rootView;
//	JMenuItem mntmDelete;
//	JPopupMenu popupMenu;
	protected ArrayList<Data<String>> inputData = new ArrayList<Data<String>>();
	public DockView() {
		setToolTipText("Place element here.");
		setBackground(Color.WHITE);
		setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
//		popupMenu = new JPopupMenu( "Delete");
//		popupMenu.setLabel("Context Menu");
//		add(popupMenu);
//		
//		mntmDelete = new JMenuItem("Delete");
//		mntmDelete.setFont(new Font("Tahoma", Font.BOLD, 13));
//		mntmDelete.setForeground(Color.RED);
//		mntmDelete.setBackground(Color.WHITE);
//		popupMenu.add(mntmDelete);
		
	}

	public void reAdaptBody(Vector<UpperDock> bodyDocks) {
		docksContainer.removeAll();
		System.out.println("bodydock adapting for " + bodyDocks.size()
				+ " items");

		for (int i = 0; i < bodyDocks.size(); i++) {
			docksContainer.add(bodyDocks.get(i).getView());
			bodyDocks.get(i).setPosition(i);
		}

	}
	
	public abstract void animate() throws InterruptedException;
	public abstract String getInput();

	public void reAdaptParams(Vector<ParameterDock> parameterDocks) {
		// does nothing implemented later on in method view

	}

//	public void reAdaptElseBody(Vector<ElseDock> elseDocks) {
//		// does nothing implemented later on in else view
//
//	}

}
