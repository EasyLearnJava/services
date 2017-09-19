package com.easylearnjava.services.sf.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import io.swagger.annotations.Api;

@Entity
@Api
public class Address {

	@Id
	@Column(name = "ADDRESS_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long addressId;

	@Column(name = "ADDRESS_LINE1", length = 30)
	private String addressLine1;

	@Column(name = "ADDRESS_LINE2", length = 30)
	private String addressLine2;

	@Column(name = "CITY", length = 30)
	private String city;

	@Column(name = "STATE", length = 30)
	private String state;

	@Column(name = "COUNTRY", length = 30)
	private String country;

	@Column(name = "ZIP_CODE", length = 15)
	private String zipCode;

	@Column(name = "NOTES", length = 200)
	private String notes;

	@ManyToOne
	@JoinColumn(name = "customer_id_fk")
	private Customer customerObj;

	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Customer getCustomerObj() {
		return customerObj;
	}

	public void setCustomerObj(Customer customerObj) {
		this.customerObj = customerObj;
	}

}
