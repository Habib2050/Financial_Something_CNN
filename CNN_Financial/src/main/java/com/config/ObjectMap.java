package com.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ObjectMap {

	
	public static String getconfig(String object) {
		
		String file="./config.properties";
		FileInputStream fis=null;
		
		
		try {
			fis= new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Properties properties=new Properties();
		try {
			properties.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value=properties.getProperty(object);
		
		return value;
	}
}
