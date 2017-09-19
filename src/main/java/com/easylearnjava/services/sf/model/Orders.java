package com.easylearnjava.services.sf.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import io.swagger.annotations.Api;

@Entity
@Api
public class Orders {

	@Id
	@Column(name = "ORDER_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long orderId;

	@Temporal(TemporalType.DATE)
	@Column(name = "ORDER_DATE", nullable = false)
	private Date orderDate;

	@Temporal(TemporalType.TIME)
	@Column(name = "DELIVERY_DATE")
	private Date deliveryDate;

	@Column(name = "STATUS", length = 20, nullable = false)
	private String status;

	@Column(name = "NOTES", length = 200)
	private String notes;

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
