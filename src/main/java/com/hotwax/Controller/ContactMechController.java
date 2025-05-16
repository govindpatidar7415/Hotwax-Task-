package com.hotwax.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotwax.Entities.ContactMech;
import com.hotwax.Service.ContactMechService;

@RestController
@RequestMapping("/contacts")
public class ContactMechController {

	@Autowired
	private ContactMechService contactMechService;

	@PostMapping
	public ContactMech saveContact(@RequestBody ContactMech contactMech) {
		return contactMechService.saveContactMech(contactMech);
	}

	@GetMapping
	public List<ContactMech> getAllContacts() {
		return contactMechService.getAllContactMechs();
	}

	@GetMapping("/{id}")
	public ContactMech getContactById(@PathVariable Long id) {
		return contactMechService.getContactMechById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteContact(@PathVariable Long id) {
		contactMechService.deleteContactMech(id);
	}
}
