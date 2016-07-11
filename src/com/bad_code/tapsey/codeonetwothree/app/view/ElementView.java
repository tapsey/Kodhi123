package com.bad_code.tapsey.codeonetwothree.app.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

import com.bad_code.tapsey.codeonetwothree.app.controler.Element;
import com.bad_code.tapsey.codeonetwothree.environment.view.Window;

@SuppressWarnings("serial")
public abstract class ElementView extends JPanel implements ViewCallBacks {
	protected ElementView rootView;
	JMenuItem mntmDelete;
	JPopupMenu popupMenu;
	private Element element;
	public ElementView(Element element) {
		this.element = element;
		setBackground(Color.WHITE);
		setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		popupMenu = new JPopupMenu( "Delete");
		popupMenu.setLabel("Context Menu");
		add(popupMenu);
		
		mntmDelete = new JMenuItem("Delete");
		mntmDelete.setFont(new Font("Tahoma", Font.BOLD, 13));
		mntmDelete.setForeground(Color.RED);
		mntmDelete.setBackground(Color.WHITE);
		
		mntmDelete.addActionListener(new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent e) {
				// this is  to delete an element
				ElementView.this.element.unDockMe();
				Window.repaintPane();
				System.out.println("undocking now");
			}
		});
		
		popupMenu.add(mntmDelete);
		addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent event) {
				// do nothing for now
				if (event.isPopupTrigger()) {
					popupMenu.show((Component) event.getSource(), event.getX(), event.getY());
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// do nothing for now
				if(e.isPopupTrigger()){
					popupMenu.show((Component) e.getSource(), e.getX(), e.getY());
					System.out.println("mouse in here");
					}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// do nothing for now

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// do nothing for now
				
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// do nothing for now

			}
		});
	}


	@Override
	public ElementView getRootView() {
		return rootView;
	}

	@Override
	public void setRootView(ElementView parent) {
		rootView = parent;
		
	}

}
