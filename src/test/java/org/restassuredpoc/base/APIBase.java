package org.restassuredpoc.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APIBase {
	
	public static Properties properties;
	
	
	@BeforeSuite
	public void initailization() {
		try {
			properties = new Properties();
			properties.load(new FileInputStream("Configs//Config.properties"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Not able to load the properties file");
			e.printStackTrace();
		}		
	// If you have any Excel utility/ Extent Report manager initialize it here	
	}
	
	
   @AfterSuite
   public void tearDown() {
	   
	   properties = null;
	   // close the excel utility/ exten report manager
	   
   }
}
