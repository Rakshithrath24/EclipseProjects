package com.mindtree.eai.DemoMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mindtree.eai.doa.DAOImpl;
import com.mindtree.eai.doa.DAOInterface;
import com.mindtree.eai.model.CampusMinds;
import com.mindtree.eai.model.CamusMindsDetails;
import com.mindtree.eai.model.Leads;
import com.mindtree.eai.utils.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
       
      
    /*	Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try 
		{
			transaction = session.beginTransaction();

			Leads l1 = new Leads();
			l1.setLmid("M111");
			l1.setLname("Prem");
			CamusMindsDetails cd1 = new CamusMindsDetails("BENGALURU",560018);
			CamusMindsDetails cd2 = new CamusMindsDetails("Bangalore",560018);
			 
			CampusMinds c1 = new CampusMinds("M104","RKR","rak@gmail.com",cd1,l1);
			CampusMinds c2 = new CampusMinds("M105","RAM","ram@gmail.com",cd2,l1);
			
			l1.getCampusminds().add(c1);
			l1.getCampusminds().add(c2);
			
			session.save(l1);
			session.save(c1);
			session.save(c2);
			transaction.commit();
		} 
		catch (Exception e) 
		{
			transaction.rollback();
			e.printStackTrace();
		} 
		finally 
		{
			session.close();
		
		}
		*/
    	Scanner sc = new Scanner(System.in);
    	//System.out.println("Enter the Campusminds name:");
    	//String s1 = sc.next();
    	
    	try
    	{
    		System.out.println("Enter the CampusMind MID:");
    		String Mid = sc.next();
    		DAOInterface dao = new DAOImpl(); 
    		CampusMinds res = dao.getDetailsById(Mid);
    		System.out.println(res);
    	 
    		System.out.println("Enter The Lead MID");
    		String mid= sc.next();
    		dao.getDetailsByLead(mid);
    	}
    	catch(RuntimeException e)
    	{
    		e.printStackTrace();
    	}
    	
    }
}
