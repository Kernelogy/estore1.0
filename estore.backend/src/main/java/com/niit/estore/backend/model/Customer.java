package com.niit.estore.backend.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
	//@Column(name="cus_address")
	@ManyToOne(cascade=CascadeType.ALL)
	private Address address;
	@Column(name="cus_password")	
	private String password;
	@Column(name="cus_role")
	private String role;
	@Column(name="cus_enabled")
	private boolean enabled;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	
	
}
