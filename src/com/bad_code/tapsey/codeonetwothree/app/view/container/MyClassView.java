package com.bad_code.tapsey.codeonetwothree.app.view.container;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.bad_code.tapsey.codeonetwothree.app.controler.Element;
import com.bad_code.tapsey.codeonetwothree.app.controler.UpperDock;
import com.bad_code.tapsey.codeonetwothree.app.controler.UpperDockPane;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.view.ElementView;
import com.bad_code.tapsey.codeonetwothree.app.view.ExpressionLabel;
import com.bad_code.tapsey.codeonetwothree.app.view.ExpressionTextField;

@SuppressWarnings("serial")
public class MyClassView extends ElementView {
	ExpressionTextField expressionTextField;
	UpperDockPane docksPane = new UpperDockPane(DockLocation.CLASS);
	public MyClassView(String name,Element element) {
		super(element);
		setBackground(new Color(51, 51, 51));
		setLayout(new BorderLayout(5, 0));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 0, 51));
		add(panel, BorderLayout.WEST);

		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_1.getLayout();
		flowLayout_1.setVgap(0);
		flowLayout_1.setHgap(0);
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_1.setBackground(new Color(51, 51, 51));
		add(panel_1, BorderLayout.SOUTH);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(153, 0, 51));
		FlowLayout flowLayout = (FlowLayout) panel_3.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_1.add(panel_3);
		
		ExpressionLabel xprsnlblMagumo = new ExpressionLabel();
		xprsnlblMagumo.setText("                      ");
		panel_3.add(xprsnlblMagumo);

		JPanel pane = new JPanel();
		pane.setBackground(new Color(51, 51, 51));
		add(pane, BorderLayout.CENTER);
		pane.setLayout(new BorderLayout(0, 0));
//		docksContainer = new JPanel();
//		docksContainer.setBackground(Color.WHITE);
//		pane.add(docksContainer);
//		docksContainer
//				.setLayout(new BoxLayout(docksContainer, BoxLayout.Y_AXIS));
		
		pane.add(docksPane);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(51, 51, 51));
		FlowLayout flowLayout_2 = (FlowLayout) panel_2.getLayout();
		flowLayout_2.setVgap(0);
		flowLayout_2.setHgap(0);
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		add(panel_2, BorderLayout.NORTH);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(153, 0, 51));
		panel_2.add(panel_4);
		panel_4.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		ExpressionLabel xprsnlblMhando = new ExpressionLabel();
		xprsnlblMhando.setText("Mhando");
		panel_4.add(xprsnlblMhando);
		
		expressionTextField = new ExpressionTextField();
		expressionTextField.setFont(new Font("Verdana", Font.BOLD, 10));
		expressionTextField.setColumns(7);
		panel_4.add(expressionTextField);
		setName(name);

		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				e.consume();
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				e.consume();
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// not now
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// not now
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}

		
	public void setName(String name){
		expressionTextField.setText(name);		 
	}

	@Override
	public void animate() throws InterruptedException {
		expressionTextField.setBackground(Color.GREEN);
		Thread.sleep(500);
		expressionTextField.setBackground(Color.WHITE);
	}

	@Override
	public void setViewColor(Color color) {
		//NOT NOW
		
	}
	
	public Vector<UpperDock> getDocks(){
		return docksPane.getUpperDocks();
	}


}
