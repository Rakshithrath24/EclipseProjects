package com.mindtree.eai.doa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mindtree.eai.exception.InvalidLeadIdException;
import com.mindtree.eai.model.CampusMinds;
import com.mindtree.eai.utils.HibernateUtil;

public class DAOImpl implements DAOInterface
{

	public CampusMinds getDetailsById(String Mid) 
	{
		Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        CampusMinds res = null;
        try 
        {
            trns = session.beginTransaction();
            Query query = session.createQuery(" from CampusMinds where mid=:mid");
            query.setString("mid",Mid);
            res = (CampusMinds) query.uniqueResult();
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
        return res;
	}

	public void getDetailsByLead(String lmid) throws InvalidLeadIdException
	{
		
		Transaction trns = null;
		List<Object[]> list = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
            trns = session.beginTransaction();
            Query query = session.createQuery("from CampusMinds,Leads where leads_FK = L_Id and lmid=:lmid");
            query.setString("lmid",lmid);
            list = query.list();
            if(list!=null)
            {
            	for(Object[] arr : list)
            	{
            		System.out.println(Arrays.toString(arr));
            	}
            }
            else
            {
            	InvalidLeadIdException id = new InvalidLeadIdException();
            	throw id;
            }
            session.getTransaction().commit();
            session.close();
     }

}
