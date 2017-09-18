package com.easylearnjava.services.sf.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Entity
@Data
public class Orders {

	@Id
	@Column(name = "ORDER_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Setter(AccessLevel.PROTECTED)
	private long orderId;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "ORDER_DATE", nullable=false)
	private Date orderDate;
	
	@Temporal(TemporalType.TIME)
	@Column(name = "DELIVERY_DATE")
	private Date deliveryDate;
	
	@Column(name = "STATUS", length=20, nullable=false)
	private String status;
	
	@Column(name = "NOTES", length=200)
	private String notes;	
}
