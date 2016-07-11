package com.bad_code.tapsey.codeonetwothree.environment.console;

import java.awt.Color;

public interface GUIConsoleInterface extends ConsoleInterface 
{
	public void print( Object o, Color color );
	public void setNameCompletion( NameCompletion nc );
	
	/** e.g. the wait cursor */
	public void setWaitFeedback( boolean on );
}