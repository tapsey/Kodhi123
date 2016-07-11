package com.bad_code.tapsey.codeonetwothree.app.controler;

import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;

@SuppressWarnings("serial")
public class UpperDockPane extends JPanel {

	Vector<UpperDock> upperDocks = new Vector<UpperDock>();

	public UpperDockPane(DockLocation docLoc) {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		UpperDock initialUpperDock = new UpperDock(this,docLoc);
		initialUpperDock.setPosition(0);
		upperDocks.add(initialUpperDock);
		reAdaptUpperDocks(upperDocks);
	}
	
	public UpperDock addUpperDock(int position, DockLocation loc) {// 
		UpperDock dock = new UpperDock(this, loc);
		dock.setPosition(position + 1);
		upperDocks.add(position + 1, dock);
		UpperDock dock2 = new UpperDock(this, loc);
		dock2.setPosition(position + 2);
		upperDocks.add(position + 2, dock2);
		reAdaptUpperDocks(upperDocks);
		return dock;
	}
	
	private void reAdaptUpperDocks(Vector<UpperDock> docks) {
		removeAll();
		System.out.println("params adapting for " + docks.size() + " items");

		for (int i = 0; i < docks.size(); i++) {
			add(docks.get(i).getView());
			System.out.println("added param view  " +docks.get(i).getView());
			docks.get(i).setPosition(i);
			System.out.println("at position "+ docks.get(i).getPosition());
		}

	}
	
	public Vector<UpperDock> getUpperDocks(){
		return upperDocks;
	}
	
	public void removeDock(int position) {
		System.out.println("list size b4 "+ upperDocks.size());
		upperDocks.remove(position);
		upperDocks.remove(position);
		System.out.println("list size after "+ upperDocks.size());
		reAdaptUpperDocks(upperDocks);
		
	}
}
