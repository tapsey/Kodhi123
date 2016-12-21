package com.bad_code.tapsey.codeonetwothree.environment.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import com.bad_code.tapsey.codeonetwothree.app.model.expressions.container.MyClass;
import com.bad_code.tapsey.codeonetwothree.app.view.CodePanel;
import com.bad_code.tapsey.codeonetwothree.app.view.ConsolePane;
import com.bad_code.tapsey.codeonetwothree.app.view.ExpressionPanel;
import com.bad_code.tapsey.codeonetwothree.app.view.container.InputView;
import com.bad_code.tapsey.codeonetwothree.environment.console.JConsole;
import com.bad_code.tapsey.codeonetwothree.environment.context.Context;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;


@SuppressWarnings("serial")
public class Window extends JFrame{
	
	//private Context context;
	static CodePanel codePanel;
	static JSplitPane appPanel;
	static MyClass runClass;
	static JConsole jConsole;
	static PrintWriter pr;
	
	public Window(Context context) {
	//	this.context = context;
		//System.out.println();
		Splash.setMessage("constructing UI");
		setTitle("Graphical Code Explorer");
		setSize(1350, 740);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
				
		MenuBar menuBar = new MenuBar();
		menuBar.setBackground(new Color(153, 153, 153));
		setJMenuBar(menuBar);
		setResizable(true);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		RibbonMenu ribbonMenu = new RibbonMenu();
		ribbonMenu.setBackground(new Color(102, 102, 102));
		getContentPane().add(ribbonMenu, BorderLayout.NORTH);
		
		JSplitPane panel = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		getContentPane().add(panel, BorderLayout.CENTER);
		
		
		appPanel = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		appPanel.setBackground(new Color(102, 102, 102));
		panel.add(appPanel);
		
		
		codePanel = new CodePanel();
		codePanel.setBackground(new Color(102, 102, 102));
		appPanel.add(codePanel);
		
		ExpressionPanel expressionPanel = new ExpressionPanel();
		expressionPanel.setBackground(new Color(102, 102, 102));
		appPanel.add(expressionPanel);
		
		ConsolePane consolePane = new ConsolePane();
		panel.add(consolePane);
	//	System.out.println();
		Splash.setMessage("bringing UI to front");
		
		
		setVisible(true);
		Splash.close();
		
				
	}
	
	public static void repaintPane(){
		codePanel.revalidate();
	}
	
	public static JSplitPane getAppPanel(){
		return appPanel;
	}
	
	public static void registerForRun(MyClass c){
		runClass = c;
	}
	
	public static MyClass getRunClass(){
		return runClass;
	}

	public static JConsole getjConsole() {
		return jConsole;
	}

	public static void attachjConsole(JConsole jConsole) {
		Window.jConsole = jConsole;
	}
	
	public static void writeError(String s){
		jConsole.print(s + " \n",Color.RED);
	}
	
	public static void openFile(){
		try {
			pr = new PrintWriter(new File(System.getProperty("user.home") + "/.GCE/"+runClass.getName()+".java"));
		} catch (FileNotFoundException e) {
		}
	}
	
	public static void closeFile(){
		pr.close();
	}
	
	public static void writeSource(String s){
		
		pr.write(s);
	}
}
