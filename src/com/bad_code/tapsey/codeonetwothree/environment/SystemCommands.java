package com.bad_code.tapsey.codeonetwothree.environment;

import java.awt.Color;

import com.bad_code.tapsey.codeonetwothree.environment.console.JConsole;

public class SystemCommands implements JConsole.Comms{

	@Override
	public void pushedValue(String command, JConsole console) {
	
		switch(command){
		
		case "unonzani" : {
			console.print("\nGraphical Code Explorer ndakagadzirwa na Evidence Hukuimwe na Tapiwanashe Matangira\n", Color.BLUE);
		}
		break;
		case "unoitei" : {
			console.print("\nI allow one to code using modern shona\n", Color.BLUE);
		}
		break;
		
		default :{
			
			console.print("\nNo such command\n", Color.RED);
		}
		
		}
		
	}


}
