package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	List<Contact> listOfContact = List.of(new Contact(101,"arjun@123","arjun",1),
			new Contact(101,"kamal@123","kamal",1),
			new Contact(101,"dilip@123","dilip",1),
			new Contact(101,"raju@123","raju",2),
			new Contact(101,"virat@123","virat",2)
			);

	@Override
	public List<Contact> getListOfContact(long userId) {


		System.out.println("inside service");
		
		return this.listOfContact.stream().filter(contact->contact.getUserId()==userId).collect(Collectors.toList());
		
		
	}

}
