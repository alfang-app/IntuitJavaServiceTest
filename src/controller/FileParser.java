package controller;

import java.io.*; 
import java.util.*; 

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import Entities.*;
import model.*;
 
// todo fix naming inconsistencies
public class FileParser {
	
 
	// storing data inmemory via hashmap that's quick and convenient (but requires lots of memory space )
	//more scalable approach would be using distributed DB, inmemory storages 
	public FileParser() { 
	} 
	/* 
	 * json output needs match application object output 
	 */
	public static Photographer[]  loadPhotographerJson(String fileName) throws Exception { 
		int numLoaded = 0;
		
		 //fileName =   "./src/Tests/ApplicationJsonTest.txt";
		
		
		
		// todo: remove prints, cleanup etc
		Gson gson = new Gson();  
		// read JSON:
		JsonReader reader = new JsonReader(new FileReader(fileName)); 
		Photographer[] photographers = new Gson().fromJson( reader , Photographer[].class);
		System.out.println(photographers.length);
		
		return   photographers ;
		// todo instead of direct create storage here, 
		/*PhotographStorage photostore = new PhotographStorage();
		for(Photographer ph : photographers) {
			System.out.println("FOund" + ph.id  );
			PhotographStorage.put(ph.id, ph);
		}*/
		 
		//return PhotographStorage;
		//return numLoaded;
	}
	 
	 
}
