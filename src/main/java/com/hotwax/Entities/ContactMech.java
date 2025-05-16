package com.hotwax.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ContactMech {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contactMechId;

    private String streetAddress;
    private String city;
    private String state;
    private String postalCode;
    private String phoneNumber;
    private String email;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

	public Long getContactMechId() {
		return contactMechId;
	}

	public void setContactMechId(Long contactMechId) {
		this.contactMechId = contactMechId;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "ContactMech [contactMechId=" + contactMechId + ", streetAddress=" + streetAddress + ", city=" + city
				+ ", state=" + state + ", postalCode=" + postalCode + ", phoneNumber=" + phoneNumber + ", email="
				+ email + ", customer=" + customer + "]";
	}

    // Getters and Setters
    
}

