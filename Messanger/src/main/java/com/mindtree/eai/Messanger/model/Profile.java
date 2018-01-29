package com.mindtree.eai.Messanger.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile 
{
	private int id;
	private String message;
	private String fname;
	private String lname;
	
	public Profile()
	{
		
	}
	
	public Profile(int id, String message, String fname, String lname) {
		super();
		this.id = id;
		this.message = message;
		this.fname = fname;
		this.lname = lname;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
	
}
