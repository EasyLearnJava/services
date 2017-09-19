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

//import java.sql.Blob;

@Entity
@Data
public class Products {

	@Id
	@Column(name = "PRODUCT_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Setter(AccessLevel.PROTECTED)
	private long productId;
	
	@Column(name = "PRODUCT_NAME", nullable=false)
	private Date productName;
	
	@Column(name = "PRODUCT_DESCRIPTION")
	private Date productDescription;
	
    @Column(name="price", precision=5, scale=2, nullable=false)
	private Double productPrice;
	
	/*@Column(name = "picture")
	private BLOB productPicture;	*/
}
