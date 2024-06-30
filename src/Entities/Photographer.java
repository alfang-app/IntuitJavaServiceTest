package Entities;

import java.io.*; 
import java.util.*; 
// stores high lvl characteristics :  name, contact, avatar, event_types etc.

/*
 * 
 *  {
        "id": 4517,
        "uid": "37b31a48-0d66-4f3a-9c16-c18933d23c20",
        "password": "5BJbgKhL9P",
        "first_name": "Grady",
        "last_name": "Gislason",
        "username": "grady.gislason",
        "email": "grady.gislason@email.com",
        "avatar": "https://robohash.org/sitilloid.png?size=300x300&set=set1",
        "gender": "Genderfluid",
        "phone_number": "+1-758 917.054.6826 x730",
        "social_insurance_number": "591554290",
        "date_of_birth": "1971-09-18",
        "event_type": {
            "type": ["corporate events", "birthdays", "professional", "pet"]
        },
        "address": {
            "city": "North Fernando",
            "street_name": "Shery Prairie",
            "street_address": "515 Hilpert Locks",
            "zip_code": "82215",
            "state": "Wyoming",
            "country": "United States",
            "coordinates": {
                "lat": 87.61405442206959,
                "lng": 38.68903711957128
            }
        },
        "credit_card": {
            "cc_number": "4106046484607"
        },
        "subscription": {
            "plan": "Essential",
            "status": "Blocked",
            "payment_method": "Alipay",
w            "term": "Monthly"
        }
    },
 * 
 */
public class Photographer {
	// todo encapsulate
	public String id;
	public String name;
	public String contact;
	public String first_name;
	public String last_name;
	public String username;
	public String avatar;
	public Pair<String, List<String>> event_types;
	
	// todo rename
	public Photographer(String i, String n,String c,String f,String l,String u, String a, List<String> e) {
		 name= n;
		 id= i;
		 contact=c; 
		 first_name=f; 
		 last_name=l; 
		 username=u; 
		 avatar=a; 
		 event_types=e;
	}
	public void printDetails() {
		
		System.out.println(id+" ,name "+first_name+" "+last_name +" ,username "+username);
		for(String s : event_types) {

			System.out.print(s);
		}
	}
	/*
	 * todo
	 * 
	 * getter, setters.... 
	 *  
	 */
}
