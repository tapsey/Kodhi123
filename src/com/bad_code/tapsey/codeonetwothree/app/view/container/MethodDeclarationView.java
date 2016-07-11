package com.bad_code.tapsey.codeonetwothree.app.view.container;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import com.bad_code.tapsey.codeonetwothree.app.controler.Element;
import com.bad_code.tapsey.codeonetwothree.app.controler.MethodDeclaration;
import com.bad_code.tapsey.codeonetwothree.app.controler.ObjectDock;
import com.bad_code.tapsey.codeonetwothree.app.controler.ParameterDock;
import com.bad_code.tapsey.codeonetwothree.app.controler.ParameterDockPane;
import com.bad_code.tapsey.codeonetwothree.app.controler.UpperDock;
import com.bad_code.tapsey.codeonetwothree.app.controler.UpperDockPane;
import com.bad_code.tapsey.codeonetwothree.app.model.DataType;
import com.bad_code.tapsey.codeonetwothree.app.model.DockLocation;
import com.bad_code.tapsey.codeonetwothree.app.view.ElementView;
import com.bad_code.tapsey.codeonetwothree.app.view.ExpressionLabel;
import com.bad_code.tapsey.codeonetwothree.app.view.ExpressionTextField;
import com.bad_code.tapsey.codeonetwothree.app.view.LowerDockView;

@SuppressWarnings("serial")
public class MethodDeclarationView extends ElementView{

	//JPanel paramDockContainer = new JPanel();
	MethodDeclaration md;
	ParameterDockPane paramsPane = new ParameterDockPane();
	UpperDockPane upperDockPane = new UpperDockPane(DockLocation.METHOD);
	ExpressionTextField xprsntxtfldMethodName;
	JComboBox comboBox;
	public MethodDeclarationView(MethodDeclaration m) {
		super(m);
		
		md = m;
		setBackground(new Color(51, 51, 51));
		setLayout(new BorderLayout(2, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 51, 51));
		add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		JPanel lstnView = new JPanel();
		lstnView.setBackground(Color.ORANGE);
		panel.add(lstnView);
		lstnView.setLayout(new FlowLayout(FlowLayout.LEFT, 3, 0));
		
		ExpressionLabel xprsnlblO = new ExpressionLabel();
		xprsnlblO.setToolTipText("baya pano kuti ukwanise \r\nkutora method ino uishandise.");
		xprsnlblO.setForeground(new Color(0, 102, 0));
		xprsnlblO.setFont(new Font("Snap ITC", Font.BOLD, 24));
		xprsnlblO.setText("O");
		lstnView.add(xprsnlblO);
		
		xprsntxtfldMethodName = new ExpressionTextField();
		xprsntxtfldMethodName.setToolTipText("Isa zita raunoda kupa method ino");
		xprsntxtfldMethodName.setColumns(5);
		xprsntxtfldMethodName.setText("");
		lstnView.add(xprsntxtfldMethodName);
		
		ExpressionLabel expressionLabel = new ExpressionLabel();
		expressionLabel.setText("(");
		lstnView.add(expressionLabel);
		
//		paramDockContainer.setBackground(Color.WHITE);
//		paramDockContainer.setLayout(new BoxLayout(paramDockContainer, BoxLayout.X_AXIS));
		lstnView.add(paramsPane);
		
		xprsntxtfldMethodName.addCaretListener(new CaretListener() {
			
			@Override
			public void caretUpdate(CaretEvent e) {
				if(md.validateAndUpdatename(xprsntxtfldMethodName.getText())){
					xprsntxtfldMethodName.setBackground(Color.GREEN);
				}else{
					xprsntxtfldMethodName.setBackground(Color.RED);
				}
			}
		});
		
		xprsnlblO.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				MethodDeclarationView.this.md.declareMethod();
				System.out.println("method declaration called");
			}
		});
		
		Component verticalStrut = Box.createVerticalStrut(25);
		paramsPane.add(verticalStrut);
		
		ExpressionLabel expressionLabel_1 = new ExpressionLabel();
		expressionLabel_1.setText(")");
		lstnView.add(expressionLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		add(panel_1, BorderLayout.WEST);
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_2.getLayout();
		flowLayout_1.setVgap(0);
		flowLayout_1.setHgap(0);
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_2.setBackground(new Color(51, 51, 51));
		add(panel_2, BorderLayout.SOUTH);
		
		JPanel panel_4 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_4.getLayout();
		flowLayout.setVgap(3);
		panel_4.setBackground(Color.ORANGE);
		panel_2.add(panel_4);
		
		ExpressionLabel xprsnlblReturnType = new ExpressionLabel();
		xprsnlblReturnType.setText("mhando yezvichadzorwa ");
		panel_4.add(xprsnlblReturnType);
		
		comboBox = new JComboBox();
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setBackground(Color.ORANGE);
		panel_4.add(comboBox);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox.setModel(new DefaultComboBoxModel(DataType.values()));
		
		ObjectDock od = new ObjectDock(DockLocation.METHOD_RETRUN);
		LowerDockView ev = (LowerDockView)od.getView();
		ev.clearDock();
		
		add(upperDockPane, BorderLayout.CENTER);
	
	}
	
//	public void reAdaptParams(Vector<ParameterDock> docks) {
//		//paramDockContainer.removeAll();
//		System.out.println("params adapting for " + docks.size()+ " items");
//
//		for (int i = 0; i < docks.size(); i++) {
//			paramDockContainer.add(docks.get(i).getView());
//			System.out.println("added param view  " +docks.get(i).getView());
//			docks.get(i).setPosition(i);
//			System.out.println("at position "+ docks.get(i).getPosition());
//		}
//
//	}
	
	
	@Override
	public void animate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setViewColor(Color color) {
		// TODO Auto-generated method stub
		
	}

	public Vector<ParameterDock> getParamDockList(){
		return paramsPane.getParameterDocks();
	}

	public Vector<UpperDock> getBodyDockList(){
		return upperDockPane.getUpperDocks();
	}
	
	public DataType getReturnType(){
		return (DataType) comboBox.getSelectedItem();
	}

	public String getMethodName(){
		return xprsntxtfldMethodName.getText();
	}
	
	public void disableView(){
		xprsntxtfldMethodName.setBackground(Color.ORANGE);
		xprsntxtfldMethodName.setEditable(false);
		comboBox.setEnabled(false);
		paramsPane.disableMe();
	}
	

}
