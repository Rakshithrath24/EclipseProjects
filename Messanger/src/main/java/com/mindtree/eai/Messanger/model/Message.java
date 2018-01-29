package com.mindtree.eai.Messanger.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="Message")
public class Message 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String message;
	private String author;
	
	public Message()
	{
		
	}
	
	public Message(int id, String message, String author) 
	{
		super();
		this.id = id;
		this.message = message;
		this.author = author;
	}
	@Column(name="id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="message")
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Column(name="author")
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
