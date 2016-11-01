package com.bad_code.tapsey.codeonetwothree.environment.view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JWindow;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
//import java.awt.Window.Type;
//import java.awt.Color;






import com.bad_code.tapsey.codeonetwothree.app.view.ExpressionLabel;

import java.awt.Font;

public class Splash extends JWindow{
	
	
	ImageIcon imageIcon = new ImageIcon(getClass().getResource("/res/logo.png"));
	
	Image img = imageIcon.getImage();
	
	static String mMessage = "loading..." , mDefMessage = "loading..." , errorMssg = "";
	
	static Splash n;
	
	private Splash() {
		
		
		//setLocation(100, 100);
			//	setLocationRelativeTo(null);
				setSize(500,400);
				setVisible(true);
				setAlwaysOnTop(true);
				
				Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
				this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
				

//		setSize(633, 300);
//		setLocationRelativeTo(null);
//		//show();
//		setVisible(true);
//		
		
		
	//	setType(Type.UTILITY);
	//	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//	setResizable(false);
		
	//	JPanel panel = new JPanel();
	//	panel.setBackground(Color.WHITE);
	//	getContentPane().add(panel, BorderLayout.CENTER);
	//	panel.setLayout(null);
		
	//	MyCanvas myCanvas = new MyCanvas();
	//	myCanvas.setBounds(420, 165, -392, -137);
	//	panel.add(myCanvas);
		
//		ExpressionLabel xprsnlblLoading = new ExpressionLabel();
//		xprsnlblLoading.setFont(new Font("Verdana", Font.BOLD, 12));
//		xprsnlblLoading.setText("loading.....");
//		xprsnlblLoading.setForeground(Color.RED);
//		xprsnlblLoading.setToolTipText("");
//		xprsnlblLoading.setBounds(128, 200, 200, 50);
//		//panel.add(xprsnlblLoading);
//		
//		getContentPane().add(xprsnlblLoading, BorderLayout.SOUTH);
//		
//		ExpressionLabel xprsnlblTestText = new ExpressionLabel();
//		xprsnlblTestText.setForeground(Color.BLUE);
//		xprsnlblTestText.setText("G.C.E");
//		xprsnlblTestText.setFont(new Font("Tahoma", Font.BOLD, 78));
//		xprsnlblTestText.setBounds(10, 34, 414, 135);
//		panel.add(xprsnlblTestText);
		
//		ExpressionLabel xprsnlblShonaEdition = new ExpressionLabel();
//		xprsnlblShonaEdition.setForeground(Color.BLUE);
//		xprsnlblShonaEdition.setFont(new Font("Verdana", Font.BOLD, 18));
//		xprsnlblShonaEdition.setText("Shona edition");
//		xprsnlblShonaEdition.setBounds(128, 165, 182, 15);
//		panel.add(xprsnlblShonaEdition);
	}

	
	
	public static void setMessage(String message) {
		mMessage = message;
	}

	
	public static void open(){
		
		if(n == null)
		n = new Splash();
	}

	public static void close(){
		
		n.dispose();
	}
	
	public static void setErrorMssg(String s){
		errorMssg += s;
	}
	
	public static void showError(){
		
		 JOptionPane.showMessageDialog(null, "Error", "fff", ERROR, null);
	}

	@Override
	public void paint(Graphics arg0) {

		arg0.drawImage(img, 0, 0, this);
		
		arg0.setFont(new Font("Verdana", Font.BOLD, 12));
		
		arg0.setColor(Color.BLUE);	
		arg0.drawString(mDefMessage, 340, 375);
		
		arg0.setColor(Color.BLACK);
		arg0.drawString(mMessage+ "...", 340, 390);
		
		//arg0.setPaintMode();
		
	}
}
