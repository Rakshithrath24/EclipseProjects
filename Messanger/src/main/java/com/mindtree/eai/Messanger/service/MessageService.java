package com.mindtree.eai.Messanger.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mindtree.Messanger.utils.HibernateUtil;
import com.mindtree.eai.Messanger.dao.DAOImpl;
import com.mindtree.eai.Messanger.dao.DAOInterface;
import com.mindtree.eai.Messanger.model.Message;

public class MessageService 
{
	public List<Message> getAllMessage()
	{
		DAOInterface dao = new DAOImpl();
		List<Message> list = dao.getAllMessages();
		return list; 
	}
	
	public Message getMessageById(int d) 
	{
		DAOInterface dao = new DAOImpl();
		Message message = dao.getMessageById(d);
        return message;
	}
	
	public Message addMessage(Message m)
	{
		DAOInterface dao = new DAOImpl();
		dao.addMessage(m);
		return m;
	}
	public Message updateMessage(Message m)
	{
		DAOInterface dao = new DAOImpl();
		dao.updateMessage(m);
		return m;
	}
	public void deleteMessage(int id)
	{
		DAOInterface dao = new DAOImpl();
		dao.deleteMEssage(id);
	}

}
