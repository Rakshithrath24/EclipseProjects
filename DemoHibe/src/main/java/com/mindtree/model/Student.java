package com.mindtree.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
public class Student 
{
	@Id
	@Column(name="SID")
	private int sid;
	@Column(name="SNAME")
	private String sname;
	@Column(name="SDEPT")
	private String sdept;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSdept() {
		return sdept;
	}
	public void setSdept(String sdept) {
		this.sdept = sdept;
	}
	
	@Override
	public String toString() 
	{
        return "STUDENT [SID=" + sid + ", SNAME=" + sname + ", SDEPT=" + sdept + "]";
	}

}
