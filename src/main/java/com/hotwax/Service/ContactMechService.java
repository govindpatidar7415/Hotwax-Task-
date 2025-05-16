package com.hotwax.Service;

import java.util.List;

import com.hotwax.Entities.ContactMech;

public interface ContactMechService {
	ContactMech saveContactMech(ContactMech contactMech);

	List<ContactMech> getAllContactMechs();

	ContactMech getContactMechById(Long id);

	void deleteContactMech(Long id);
}
