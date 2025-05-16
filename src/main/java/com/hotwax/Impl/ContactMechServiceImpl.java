package com.hotwax.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotwax.Entities.ContactMech;
import com.hotwax.Repository.ContactMechRepository;
import com.hotwax.Service.ContactMechService;

@Service
public class ContactMechServiceImpl implements ContactMechService {

	@Autowired
	private ContactMechRepository contactMechRepository;

	@Override
	public ContactMech saveContactMech(ContactMech contactMech) {
		return contactMechRepository.save(contactMech);
	}

	@Override
	public List<ContactMech> getAllContactMechs() {
		return contactMechRepository.findAll();
	}

	@Override
	public ContactMech getContactMechById(Long id) {
		return contactMechRepository.findById(id).orElse(null);
	}

	@Override
	public void deleteContactMech(Long id) {
		contactMechRepository.deleteById(id);
	}
}
