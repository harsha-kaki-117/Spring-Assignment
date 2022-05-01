package com.midhun.springAssignment.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.midhun.springAssignment.model.PersonsModel;

@Service
public class DBService {
	
	@Autowired
	DBInterface dblst;
	
	/*
	 * List<PersonsModel> lst = new ArrayList<> (Arrays.asList(new
	 * PersonsModel(1,"Singu","Midhun","TPT","Andhra"), new
	 * PersonsModel(2,"S","Mac","Georgia","USA"), new
	 * PersonsModel(3,"K","Kalyan","SKTH","Andhra")));
	 */
	
	public void addPersons(PersonsModel body) {
		// TODO Auto-generated method stub
		//lst.add(body);
		dblst.save(body);
	}

	public List<PersonsModel> getPersons() {
		List<PersonsModel> dblist = new ArrayList<>();
		for(PersonsModel p : dblst.findAll()) {
			dblist.add(p);
		}
		return dblist;
	}

	public void updatePersons(PersonsModel body, int id) {
		
		/*
		 * int len = lst.size();
		 * 
		 * for(int i=0;i<len;i++) { if(lst.get(i).getLastname().equals(name)) {
		 * lst.set(i, body); break; } }
		 */
		
		dblst.save(body);
		dblst.deleteById(id);
		 
	}

	public void deletePersons(int id) {
		
		/*
		 * int len = lst.size();
		 * 
		 * for(int i=0;i<len;i++) { if(lst.get(i).getLastname().equals(name)) {
		 * lst.remove(i); break; } }
		 */
		
		dblst.deleteById(id);
		
	}

	public PersonsModel getOnePerson(int id) {
		
		/*
		 * int len = lst.size();
		 * 
		 * for(int i=0;i<len;i++) { if(lst.get(i).getId()==id) { return lst.get(i); } }
		 */
		
		return dblst.findById(id).get();
	}

	

}
