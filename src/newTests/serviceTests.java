package newTests;
//package Tests;

import java.util.*; 
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

import Entities.*;
import model.*;
import controller.*; 

class serviceTests {
// todo create testing for each of the components 
	// test load by id, list, sorted lisit, by event...
	
	// TODO CARE: ANNOTATION: name of test case marking!!
	@Test
	void loadPhotographers() {
		String fileName =   "./src/PhotoJson.txt";
		PhotographService ps = new PhotographService(fileName);
		//HashMap<String, Photographer> hm 
		List<Photographer> li= ps.getPhotographers();
		/*
		for(Photographer p : li) {
			p.printDetails();
		}
		*/
		
	}
	
	
	@Test
	void loadPhotographerId() {
		String fileName =   "./src/PhotoJson.txt";
		PhotographService ps = new PhotographService(fileName);
		//HashMap<String, Photographer> hm 
		//List<Photographer> li= ps.getPhotographers();
		
		Photographer p = ps.getPhotographerId(""+6426);
		p.printDetails();
		/*
		for(Photographer p : li) {
			p.printDetails();
		}
		*/
		
	}/*
	
	
	/*
	void getListPhotographerService() {
		String fileName =   "./src/photographData.txt";
		PhotographService ps = new PhotographService(fileName);

		ps.getPhotographers();
		}
	}*/
}
