package com.easylearnjava.services.sf.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Entity
@Data
public class Customer {

	@Id
	@Column(name = "CUSTOMER_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Setter(AccessLevel.PROTECTED)
	private long customerId;
	
	@Column(name = "FIRST_NAME", length=20, nullable=false)
	private String firstName;
	
	@Column(name = "LAST_NAME", length=20, nullable=false)
	private String lastName;
	
	@Column(name = "EMAIL_ID", length=30)
	private String emailId;
	
	@Column(name = "PHONE_NUMBER", length=15)
	private String phoneNumber;

	@OneToMany(mappedBy = "customerObj", cascade = CascadeType.ALL)
	private List<Address> addressList;
	
}
