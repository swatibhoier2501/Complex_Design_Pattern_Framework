package dataSource;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	/*
	 * Objective as a user,i want to pass key,and i should get it value for that
	 * param String key
	 * return-String value
	 */
	//Registration Page
	public static String getKeyValue(String key) throws IOException{
		FileReader configFile =new FileReader("C:/MyWorkspace/Complex_Design_Pattern_Framework/TestData/Knowledgeware/testData.properties");
		Properties prop = new Properties();
		prop.load(configFile);
		return prop.getProperty(key);
		
	
	}
	
	public static String[] getMultipleValue(String key) throws IOException{
		FileReader configFile =new FileReader("C:/MyWorkspace/Complex_Design_Pattern_Framework/TestData/Knowledgeware/testData.properties");
		Properties prop = new Properties();
		prop.load(configFile);
		//get key value
		String[] multileval=prop.getProperty(key).split(",");
		return multileval;
		
	
	}
	
//**********************************************************************************************
//Nursing Demo
	public static String get_Key_Value(String key) throws IOException{
		FileReader configFile =new FileReader("C:/MyWorkspace/Complex_Design_Pattern_Framework/TestData/NursingDemo/testData.properties");
		Properties prop = new Properties();
		prop.load(configFile);
		return prop.getProperty(key);
		
	
	}
	
	public static String[] get_Multiple_Value(String key) throws IOException{
		FileReader configFile =new FileReader("C:/MyWorkspace/Complex_Design_Pattern_Framework/TestData/NursingDemo/testData.properties");
		Properties prop = new Properties();
		prop.load(configFile);
		//get key value
		String[] multileval=prop.getProperty(key).split(",");
		return multileval;
		
	
	}
}
