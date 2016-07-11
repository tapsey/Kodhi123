/*this class will represent the software preferences*/
package com.bad_code.tapsey.codeonetwothree.environment.context;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.util.Scanner;

import org.json.JSONException;
import org.json.JSONObject;

public class Preferences{

	private static Preferences mPreferences;
	private JSONObject mPreferenceJsonObject;
	
	private Preferences() {
		// TODO Auto-generated constructor stub
		
		if(loadFromFile(System.getProperty("user.home") + "/.GCE/settings/settings.gce")){
			
			
		}else{
			
			System.out.println("failed to load prefs revalting to default");
			
			placeDefault();
			
			if(loadFromFile(System.getProperty("user.home") + "/.GCE/settings/settings.gce")){
				
			}else{
				System.out.println("failed permanently to load prefs");				
			}
			
		}
		
	}
	
	private void placeDefault(){
		try {
			FileInputStream fis = new FileInputStream(new File(getClass().getResource("/defaultvalues/settings.gce").toURI()));
			File newFile = new File(System.getProperty("user.home") + "/.GCE/settings");
			newFile.mkdirs();
			
			FileOutputStream fos = new FileOutputStream(new File(System.getProperty("user.home") + "/.GCE/settings/settings.gce"), false);
			
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
			System.out.println("fatal error default settings not available");
		}catch (IOException ioE){
			
			System.out.println("fatal error default settings not available and cannot be placed");
			
		}catch (URISyntaxException e) {
			// TODO: handle exception
			System.out.print("path to prefs is mayaz");
		}

	}
	
	public static Preferences getPreferenceObject() {
		// TODO Auto-generated method stub

		if(mPreferences == null){
			
			mPreferences = new Preferences();
		}
		return mPreferences;
	}

	public void commit() {
		// TODO Auto-generated method stub
		
		writePrefsToFile();
		mPreferences = null;
	}
	
	private void writePrefsToFile() {
		// TODO Auto-generated method stub
		PrintWriter ryter;
		try {
			ryter = new PrintWriter(new File(System.getProperty("user.dir") + ".GCE/settings/settings.gce"));
			if(mPreferenceJsonObject != null){
			ryter.write(mPreferenceJsonObject.toString() + "EOF");
			
			}else{
				System.out.println("failed to commit changes to prefs");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.print("no settings file found");
			e.printStackTrace();
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
			mPreferenceJsonObject = new JSONObject(prefsReader.next());
			prefsReader.close();
			System.out.println("loaded prefs "+ mPreferenceJsonObject.toString() );
			
			return true;
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			prefsReader.close();
			return false;
		}
		
	}
	
	
	/*  methods below edit actual preferences*/
	
	public int getInt(String key , int placeHolder){
		getPreferenceObject();
		
		try {
			return mPreferenceJsonObject.getInt(key);
		} catch (JSONException e) {
			return placeHolder;
		}
	}
	
	public void setInt(String key, int value){
		getPreferenceObject();
		try {
			mPreferenceJsonObject.put(key, value);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public boolean getBoolean(String key, boolean placeHolder){
		getPreferenceObject();
		try {
			return mPreferenceJsonObject.getBoolean(key);
		} catch (JSONException e) {
			return placeHolder;
		}
	}
	
	public void setBoolean(String key , boolean value){
		getPreferenceObject();
		try {
			mPreferenceJsonObject.put(key, value);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getString(String key , String placeHolder){
		getPreferenceObject();
		
		try {
			return mPreferenceJsonObject.getString(key);
		} catch (JSONException e) {
			return placeHolder;
		}
	}
	public void setString(String key, String value){
		getPreferenceObject();
		try {
			mPreferenceJsonObject.put(key, value);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public double getDouble(String key, double placeHolder){
		getPreferenceObject();
		
		try {
			return mPreferenceJsonObject.getDouble(key);
		} catch (JSONException e) {
			return placeHolder;
		}
	}
	
	public void setDouble(String key, double value){
		
		getPreferenceObject();
		
		try {
			mPreferenceJsonObject.put(key, value);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
