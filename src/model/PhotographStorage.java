package model;

import java.io.*; 
import java.util.*; 
import Entities.*;
import model.*;

public class PhotographStorage {
	// todo encapsulate, get/sets, cleanup, rename, etc
	// todo comment functions
	List<Photographer> photographerList;
	 private HashMap<String, Photographer> photographerHm;
	 private HashMap<Event, List<Photographer>> eventPhotographersHm; 
	 public PhotographStorage() {
		 photographerHm = new HashMap<>();
		 eventPhotographersHm = new HashMap<>();
		 photographerList = new ArrayList<Photographer> ();
	 }
	 public List<Photographer> getPhotographerList(){
		 return photographerList;
	 }
	 public void  setPhotographerList( List<Photographer> input){
		 photographerList = input;
	 }
	 public HashMap<String, Photographer> getPhotographerMap(){
		 return photographerHm;
	 }
	 public  HashMap<Event, List<Photographer>>  getEventPhotographerMap(){
		 return eventPhotographersHm;
	 }
	 
	 //todo rename
	 public void setPhotographerHm( HashMap<String, Photographer>  input) {
		 photographerHm = input;
	 }
	 public void setEventPhotographersHm( HashMap<Event, List<Photographer>> input) {
		 eventPhotographersHm = input;
	 }
	 
}
