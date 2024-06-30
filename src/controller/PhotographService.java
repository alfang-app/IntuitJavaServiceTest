package controller;

import java.util.*; 
import Entities.*; 
import model.*; 
/*
 * 
 * 
 * Your assignment is to create a microservice which serves the contents of photographers.json through a REST API.

The service should expose three REST endpoints:

GET /api/photographers - returns the list of all photographers.
GET /api/photographers/{photographerID} - returns a single photographer by ID.
GET /api/photographers/event/{eventType} - returns a list of photographers for the specified event type.
Examples of event_types:

wedding
birthdays
wildlife
sports
The above APIs should only return high-level characteristics of the photographer data. For example - name, contact, avatar, event_types etc.

Please create unit tests that cover the core logic.

With time permitting, package the application for distribution. Some examples of this:

Docker image (preferred)
Tomcat WAR
Static binary
 * 
 */
public class PhotographService {
	
	/*
	 * create file parser of json -> photographer 
	 *                                        ->  photograph storage: photographer
	 * 
	 * 
// todo fix naming inconsistencies
	 */
	PhotographStorage photoStorage;
	public PhotographService(String photographerConfigFile) {
		//photographerHm = new HashMap<>();
		//eventPhotographersHm= new HashMap<>();
		
		 photoStorage = new PhotographStorage();
		 // todo load from config file in another component
		 try {

			 	Photographer[] photographers = FileParser.loadPhotographerJson(photographerConfigFile);
			 	
			 	System.out.println("OBJECTS LOADED " + photographers.length);
			 	
			 	 
			 	photoStorage.setPhotographerList((List<Photographer>)Arrays.asList(photographers));
			 	
			 	
			 	HashMap<String, Photographer> hm = photoStorage.getPhotographerMap();
			 	for(Photographer ph : photographers) {
					//System.out.println("FOund" + ph.id  );
					hm.put(ph.id, ph);
				}
		}
		catch(Exception e){// use more specific catches of relevant error types and print/log differently
			
			 
			System.out.println("Load didn't work. Error: " + e);
			// Send alert for service unable to start  
		}
	}
	/**
	 * GET  /photographers  : activate the registered user.
	 *
	 * @param 
	 * @return the list of photographers, status 200 (OK)  
	 */
public  	List<Photographer> getPhotographers(){
		List<Photographer> list = new ArrayList<Photographer>();
		return list;
		
		
	}
	
	/**
	 * GET  GET /api/photographers/{photographerID}   : returns a single photographer by ID.
	 *
	 * @param 
	 * @return the list of photographers, status 200 (OK)  
	 */
	 
	public   Photographer getPhotographerId(String Id){
		return photoStorage.getPhotographerMap().get(Id);
		
		
	}
	 
	/**
	 * GET  GET /api/photographers/event/{eventType} - returns a list of photographers for the specified event type.
  
	 *
	 * @param  event type
	 * @return the list of photographers for an event type
		status 200 (OK) and the list in body, 
		status 500 (Internal Server Error) if the user couldn't be activated
	 */
	/*
	List<Photographer> getPhotographers(String eventType){
		
		
	}*/
	
}
