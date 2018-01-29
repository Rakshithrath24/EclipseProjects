package com.mindtree.eai.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Table;

@Entity
//@Table(name="CAMUSMINDSDETAILS")
public class CamusMindsDetails 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="C_id")
	private int id;
	private String city;
	private int pincode;
	
	public CamusMindsDetails() {
	}
	
	
	public CamusMindsDetails(String city, int pincode) {
		super();
		this.city = city;
		this.pincode = pincode;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) 
	{
		this.pincode = pincode;
	}

	

}
