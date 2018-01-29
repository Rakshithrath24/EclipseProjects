package com.mindtree.eai.Messanger.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.mindtree.eai.Messanger.model.Message;

public class TEST1 
{
	DAOInterface dao;
	Message m;
	@Before
	public void init()
	{
		dao = new DAOImpl();
		m=dao.getMessageById(1);
	}
	@Test
	public void getMessage() 
	{
		assertEquals(m,dao.getMessageById(1));
	}
}
