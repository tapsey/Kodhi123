/* this calss is the entry point to the program, it will inititate startup
 * and check the integrity of external environment.
 * 
 * It will check the environment integrity
 * then create the preference object.
 * then start the environment and pass it the preferences
 * */
package com.bad_code.tapsey.codeonetwothree.system;

import com.bad_code.tapsey.codeonetwothree.environment.context.PreferenceManager;
import com.bad_code.tapsey.codeonetwothree.environment.context.Preferences;
import com.bad_code.tapsey.codeonetwothree.environment.setup.Setup;
import com.bad_code.tapsey.codeonetwothree.environment.view.Splash;
import com.bad_code.tapsey.codeonetwothree.environment.view.Window;

public class StartupManager {

	public static void main(String... args) {

		Splash.open();
				
		if (verifyEnvironment()) {

				// load preferences and make object from it
				try {
					
					startUpSystem(loadPreferences());
					
				} catch (Exception epx2) {

					// make dialog , vital component missing
					//System.out.println("");
					Splash.setErrorMssg("vital component missing");
					epx2.printStackTrace();

					Splash.showError();
					
					// shutdown
				}

		} else {

			// make dialog software integrity compromised
			
			Splash.setErrorMssg("software integrity compromised");
		}
		
		
	}

	private static void startUpSystem(Preferences prefs) {
		// TODO Auto-generated method stub

		Splash.setMessage("starting up system");
		if(prefs != null){
		Setup.initialise(prefs);
		}else{
			
			Splash.setErrorMssg("prefs is null cannot start");
		}
	}


	private static Preferences loadPreferences() throws Exception {
		// TODO Auto-generated method stub
		PreferenceManager prefsManager = PreferenceManager.getPreferenceManager();

		Preferences prefs =  prefsManager.getPreferences();
		return prefs;
		
	}

	private static boolean verifyEnvironment() {
		// TODO Auto-generated method stub		
		Splash.setErrorMssg("system verification failed");
		
		return true;
	}

}
