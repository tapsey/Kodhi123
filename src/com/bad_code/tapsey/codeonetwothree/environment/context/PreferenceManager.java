package com.bad_code.tapsey.codeonetwothree.environment.context;

import com.bad_code.tapsey.codeonetwothree.environment.view.Splash;


public class PreferenceManager {
	
	private static PreferenceManager  mPreferenceManager;
	private Preferences mPreferences;
	
	private PreferenceManager(){
		
		//System.out.println();
		Splash.setMessage("prefs manager called");
	}
	
	public static PreferenceManager getPreferenceManager(){
		
		if (mPreferenceManager == null){
			
			mPreferenceManager = new PreferenceManager();
		}
		
		return mPreferenceManager;
	}
	
	public Preferences getPreferences(){
		loadPreferences();
		return mPreferences;
	}
	
	private void loadPreferences(){		
		mPreferences = Preferences.getPreferenceObject();
	}
	
	public void commitChangesToPreferences(){
		mPreferences.commit();
	}

}
