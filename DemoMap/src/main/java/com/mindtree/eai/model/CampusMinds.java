package com.mindtree.eai.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="CAMPUSMINDS")
public class CampusMinds 
{
	private String mid;
	private String name;
	private String email;
	private CamusMindsDetails details;
	private Leads leads;
	
	public CampusMinds()
	{
		
	}
	
	
	public CampusMinds(String mid, String name, String email, CamusMindsDetails details,Leads leads) 
	{
		super();
		this.mid = mid;
		this.name = name;
		this.email = email;
		this.details = details;
		this.leads = leads;
	}
	@Id
	@Column(name="MID")
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	@Column(name="NAME")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="EMAIL")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="details_FK")
	public CamusMindsDetails getDetails() {
		return details;
	}
	public void setDetails(CamusMindsDetails details) {
		this.details = details;
	}
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="leads_FK")
	public Leads getLeads() {
		return leads;
	}


	public void setLeads(Leads leads) {
		this.leads = leads;
	}


	@Override
	public String toString()
	{
		return "CampusMinds [ MID:"+mid+" NAME:"+name+" EMAIL:"+email+" CITY:"+details.getCity()+" PINCODE:"+details.getPincode()+
				" LMID:"+leads.getLmid()+" LNAME:"+ leads.getLname()+" ]";
	}
	
}
