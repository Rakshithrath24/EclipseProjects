package com.mindtree.eai.model;


import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="LEADS")
public class Leads  
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="L_Id")
	private int id;
	private String Lmid;
	private String Lname;
	
	@OneToMany(mappedBy="leads")
	@ElementCollection
	private Collection<CampusMinds> campusminds = new ArrayList<CampusMinds>();

	public Leads() {
		
	}

	public Leads(String lmid, String lname) {
		super();
		this.Lmid = lmid;
		this.Lname = lname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLmid() {
		return Lmid;
	}

	public void setLmid(String lmid) {
		Lmid = lmid;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}
	
	public Collection<CampusMinds> getCampusminds() {
		return campusminds;
	}

	public void setCampusminds(Collection<CampusMinds> campusminds) {
		this.campusminds = campusminds;
	} 
	@Override
	public String toString()
	{
		return "Leads[LMID:"+Lmid+" LNAME:"+Lname+" ]";
	}
}
