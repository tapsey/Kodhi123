/*
 * this class will take a preference object and will
 * load all prerences into context
 * */

package com.bad_code.tapsey.codeonetwothree.environment.setup;

import com.bad_code.tapsey.codeonetwothree.environment.context.Preferences;

public class Setup {
	
	static Preferences preferences;
	
	public static void initialise(Preferences preferences){
		
		if(EnvironmentSetup.bootUp(preferences)){
			// at this moment we have the window showing.
			// if state requires call all startup callbacks on the environment
			
		}else{
			
			System.out.println("failed to Setup environment, shutting down");
		}
		
	}
	

}
