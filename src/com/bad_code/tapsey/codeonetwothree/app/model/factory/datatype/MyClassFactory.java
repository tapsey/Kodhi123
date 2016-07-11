package com.bad_code.tapsey.codeonetwothree.app.model.factory.datatype;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.bad_code.tapsey.codeonetwothree.environment.view.ClassInitialiser;

@SuppressWarnings("serial")
public class MyClassFactory  extends JButton{
	JPanel panel;
	public MyClassFactory(JPanel panel){
		this.panel = panel;
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {		
				System.out.println("action performed");
				addClass();
			}
		});
	}
	
	@SuppressWarnings("unused")
	private void addClass(){
		
		ClassInitialiser c = new ClassInitialiser(panel);

	}

}
