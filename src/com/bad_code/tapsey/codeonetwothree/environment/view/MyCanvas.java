package com.bad_code.tapsey.codeonetwothree.environment.view;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class MyCanvas extends Canvas {

	public void paint(Graphics g){
		
		Toolkit t = Toolkit.getDefaultToolkit();
		Image i = t.getImage("/res/arrow.png");
		g.drawImage(i, -800, -200, this);
		
	}
	
}
