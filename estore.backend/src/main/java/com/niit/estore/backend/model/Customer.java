package com.niit.estore.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customers")
public class Customer {
	@Id	
	@GeneratedValue//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cus_id")
	private int id;
	@Column(name="cus_name")
	private String name;
	@Column(name="cus_email")
	private String email;
	@Column(name="cus_contact")
	private String contact;
	@Column(name="cus_address")
	private String address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}