package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {
	
	//fake contacts
	private List<Contact> contacts = List.of(
			new Contact(1L, "anth@google.com", "Anthony", 1L),
			new Contact(2L, "mike@google.com", "Mike", 1L),
			new Contact(3L, "steph@google.com", "Stephen", 1L),
			new Contact(4L, "jess@google.com", "Jess", 2L)
			);

	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		return this.contacts.stream().filter(c->c.getUserId()==userId).collect(Collectors.toList());
	}

}
