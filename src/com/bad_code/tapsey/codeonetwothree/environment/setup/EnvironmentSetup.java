package com.bad_code.tapsey.codeonetwothree.environment.setup;

import com.bad_code.tapsey.codeonetwothree.environment.context.Context;
import com.bad_code.tapsey.codeonetwothree.environment.context.Preferences;
import com.bad_code.tapsey.codeonetwothree.environment.context.UILanguageManager;
import com.bad_code.tapsey.codeonetwothree.environment.view.Splash;
import com.bad_code.tapsey.codeonetwothree.environment.view.Window;

 class EnvironmentSetup {

	 static Context context; // this class will contain all loaded prefs.
	 
	 public static boolean bootUp( Preferences p){
			
			if (makeAllObjectsFromPreference(p)){
				
				inflateEnvironmentView(context);
				return true;
			}else{
				
				// make dialog failed to initialise environment, return false
				System.out.println("failed to initialise environment view");
				return false;
			}
			
			}

	private static void inflateEnvironmentView(Context context) { // will inflate all context objects and put all containers
		// TODO Auto-generated method stub
		
		Splash.setMessage("starting UI" );
		@SuppressWarnings("unused")
		Window win = new Window(context); // starting window
	}

	private static boolean makeAllObjectsFromPreference(Preferences p) { // make a context object
		
		try{
		context = new Context();
		UILanguageManager uiL = UILanguageManager.getUILanguageManager();
		context.setLanguage(uiL.loadLanguage(p.getString("language", "shona")));
		// TODO Auto-generated method stub
		return true;
		}catch(Exception epxx){

			return false;
		}
	}

}
