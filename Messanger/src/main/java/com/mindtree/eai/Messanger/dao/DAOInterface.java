package com.mindtree.eai.Messanger.dao;

import java.util.List;

import com.mindtree.eai.Messanger.model.Message;

public interface DAOInterface 
{
	public List<Message> getAllMessages();
	public void addMessage(Message m);
	public void deleteMEssage(int id);
	public void updateMessage(Message m);
	public Message getMessageById(int id);
}
