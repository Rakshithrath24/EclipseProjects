package com.mindtree.eai.Messanger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mindtree.eai.Messanger.model.Message;
import com.mindtree.eai.Messanger.service.MessageService;

@Path("/messages")
public class MessageResource 
{
	MessageService messageservice = new MessageService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages()
	{
		return messageservice.getAllMessage();
	}
	
	@GET
	@Path("/{MessageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessageById(@PathParam("MessageId") int id)
	{
		return messageservice.getMessageById(id);
	}
	
	@PUT
	@Path("/{MessageId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Message updateMessage(@PathParam("MessageId") int id,Message m)
	{
		m.setId(id);
		return messageservice.updateMessage(m);
	}
	
	@DELETE
	@Path("/{MessageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteMessage(@PathParam("MessageId") int id)
	{
		messageservice.deleteMessage(id);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Message addMessage(Message m)
	{
		return messageservice.addMessage(m);
	}
}
