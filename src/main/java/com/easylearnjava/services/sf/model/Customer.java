package com.easylearnjava.services.sf.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import io.swagger.annotations.Api;

@Entity
@Api
public class Customer {

	@Id
	@Column(name = "CUSTOMER_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long customerId;

	@Column(name = "FIRST_NAME", length = 20, nullable = false)
	private String firstName;

	@Column(name = "LAST_NAME", length = 20, nullable = false)
	private String lastName;

	@Column(name = "EMAIL_ID", length = 30)
	private String emailId;

	@Column(name = "PHONE_NUMBER", length = 15)
	private String phoneNumber;

	@OneToMany(mappedBy = "customerObj", cascade = CascadeType.ALL)
	private List<Address> addressList;

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<Address> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}

}