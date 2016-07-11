package com.bad_code.tapsey.codeonetwothree.environment.context;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

import org.json.JSONException;
import org.json.JSONObject;

import com.bad_code.tapsey.codeonetwothree.environment.view.Splash;

public class UILanguageManager {
	
	private static UILanguageManager mUILanguageManager;
	private JSONObject mlanguage;
	
	public static UILanguageManager getUILanguageManager(){
		
		if(mUILanguageManager == null){
			
			mUILanguageManager = new UILanguageManager();
		}
		
		return mUILanguageManager;
	}

	public JSONObject loadLanguage( String name){
		
		String path = System.getProperty("user.home") + "/.GCE/UILanguage/" + name + ".gce";	

		if(loadFromFile(path)){			
			return mlanguage;
			
		}else{
			
			System.out.println("failed to load language revalting to default");
			
			placeDefault();
			
			if(loadFromFile(path)){
				return mlanguage;
			}else{
				System.out.println("failed permanently to load language");	
				
				return null;
			}
			
		}
		
	}
	
private boolean loadFromFile(String path){
		
		File prefsFile = null;
			prefsFile = new File(path);
		Scanner prefsReader= null;
		try {
			prefsReader = new Scanner(prefsFile);
			prefsReader.useDelimiter("EOF");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		try {
			mlanguage = new JSONObject(prefsReader.next());
			prefsReader.close();
			
			Splash.setMessage("loaded language "+ prefsFile.getName() );
			
			return true;
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			prefsReader.close();
			return false;
		}
		
	}
	

private void placeDefault(){
	try {
		FileInputStream fis = new FileInputStream(new File(getClass().getResource("/defaultvalues/shona.gce").toURI()));
		File newFile = new File(System.getProperty("user.home") + "/.GCE/UILanguage");
		newFile.mkdirs();
		
		FileOutputStream fos = new FileOutputStream(new File(System.getProperty("user.home") + "/.GCE/UILanguage/shona.gce"), false);
		
		int read = 0;
		final byte[] bytes = new byte[1024];

		while ((read = fis.read(bytes)) != -1) {					
				fos.write(bytes, 0, read);	
	     	}

			if (fos != null)
				fos.close();
			if (fis != null)
				fis.close();
			
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("fatal error default UILanguage not available");
	}catch (IOException ioE){
		
		System.out.println("fatal error default UILanguage not available and cannot be placed");
		
	}catch (URISyntaxException e) {
		// TODO: handle exception
		System.out.print("path to UILanguage is mayaz");
	}

}


}


