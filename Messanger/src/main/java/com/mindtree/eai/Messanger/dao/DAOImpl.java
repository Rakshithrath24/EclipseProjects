package com.mindtree.eai.Messanger.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mindtree.eai.Messanger.model.Message;
import com.mindtree.Messanger.utils.HibernateUtil;

public class DAOImpl implements DAOInterface
{

	@Override
	public List<Message> getAllMessages() 
	{
		Transaction trns = null;
		List<Message> list = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try 
        {
            trns = session.beginTransaction();
            Query query = session.createQuery("from Message");
            list = query.list();
            session.getTransaction().commit();
        } 
        catch (RuntimeException e) 
        {
            if (trns != null) 
            {
                trns.rollback();
            }
            e.printStackTrace();
        } 
        finally 
        {
            session.flush();
            session.close();
        }
		
        return list;
	}

	@Override
	public void addMessage(Message m) 
	{
		Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try 
        {
            trns = session.beginTransaction();
            session.save(m);
            session.getTransaction().commit();
        } 
        catch (RuntimeException e) 
        {
            if (trns != null) 
            {
                trns.rollback();
            }
            e.printStackTrace();
        } 
        finally 
        {
            session.flush();
            session.close();
        }
		
	}

	@Override
	public void deleteMEssage(int d) 
	{
		Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try 
        {
            trns = session.beginTransaction();
            Query query = session.createQuery("delete from Message where id=:id");
            query.setInteger("id",d);
            query.executeUpdate();
            session.getTransaction().commit();
        } 
        catch (RuntimeException e) 
        {
            if (trns != null) 
            {
                trns.rollback();
            }
            e.printStackTrace();
        } 
        finally 
        {
            session.flush();
            session.close();
        }
		
		
	}

	@Override
	public void updateMessage(Message m) 
	{
		Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try 
        {
            trns = session.beginTransaction();
            session.update(m);
            session.getTransaction().commit();
        } 
        catch (RuntimeException e) 
        {
            if (trns != null) 
            {
                trns.rollback();
            }
            e.printStackTrace();
        } 
        finally 
        {
            session.flush();
            session.close();
        }
	}

	@Override
	public Message getMessageById(int id1) 
	{
		
		Message message = null;
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try 
        {
            trns = session.beginTransaction();
            Query query = session.createQuery("from Message where id=:id");
            query.setInteger("id",id1);
            message = (Message) query.uniqueResult();
            session.getTransaction().commit();
        } 
        catch (RuntimeException e) 
        {
        	if(trns != null)
            {
                trns.rollback();
            }
            e.printStackTrace();
        } 
        finally 
        {
            session.flush();
            session.close();
        }
        return message;
     }

}
