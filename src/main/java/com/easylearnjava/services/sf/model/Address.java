package com.easylearnjava.services.sf.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Entity
@Data
public class Address {

	@Id
	@Column(name = "ADDRESS_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Setter(AccessLevel.PROTECTED)
	private long addressId;
	
	@Column(name = "ADDRESS_LINE1", length=30)
	private String addressLine1;
	
	@Column(name = "ADDRESS_LINE2", length=30)
	private String addressLine2;
	
	@Column(name = "CITY", length=30)
	private String city;
	
	@Column(name = "STATE", length=30)
	private String state;
	
	@Column(name = "COUNTRY", length=30)
	private String country;
	
	@Column(name = "ZIP_CODE", length=15)
	private String zipCode;
	
	@Column(name = "NOTES", length=200)
	private String notes;
	
	@ManyToOne
    @JoinColumn(name = "customer_id_fk")
    private Customer customerObj;
}
