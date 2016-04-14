package com.imlabs.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "ADDRESS")
public class AddressMysql {
	@Id
	@GeneratedValue
	private long addressId;
	private String street;
	private String city;
	private String state;
	private String zipcode;
	@OneToOne  
    @JoinColumn(name="contact_Id")  
private ContactMysql contact;  

	public ContactMysql getContact() {
		return contact;
	}

	public void setContact(ContactMysql contact) {
		this.contact = contact;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
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

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	

	public AddressMysql() {
		super();
	}
	
}
