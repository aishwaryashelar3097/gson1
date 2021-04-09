package gson1;

public class Gson1 {
	package GSON;

	public class GSON {
		package com.GSON;

	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.List;

	import com.google.gson.Gson;

	public class JSON_Writer_GSON
	{
	    public static void main(String[] args)
	    {
	        try
	        {
	            //Create a new person object
	            Person person = new Person();
	            //Set values to its properties
	            person.setPersonName("Ayesha");
	            person.setpersonId(100);

	            List personList = new ArrayList();
	            personList.add("Aishwarya");
	            personList.add("Kedar");
	            personList.add("Karthik");
	            personList.add("Shreya");

	            personlist(personList);

	            // Create a new Gson object
	            Gson gson = new Gson();

	            //convert the Java object to json
	            String jsonString = gson.toJson(person);
	            //Write JSON String to file        
	            FileWriter fileWriter = new FileWriter("D:\\person.json");
	            fileWriter.write(jsonString);
	            fileWriter.close();
	            
	        } catch (IOException e)
	        {
	            e.printStackTrace();
	        }
	    }
	}


	}

}
