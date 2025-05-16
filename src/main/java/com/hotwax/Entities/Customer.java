package com.hotwax.Entities;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<ContactMech> contactMechs;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<OrderHeader> orderHeaders;

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<ContactMech> getContactMechs() {
		return contactMechs;
	}

	public void setContactMechs(List<ContactMech> contactMechs) {
		this.contactMechs = contactMechs;
	}

	public List<OrderHeader> getOrderHeaders() {
		return orderHeaders;
	}

	public void setOrderHeaders(List<OrderHeader> orderHeaders) {
		this.orderHeaders = orderHeaders;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", contactMechs=" + contactMechs + ", orderHeaders=" + orderHeaders + "]";
	}

    // Getters and Setters
}
