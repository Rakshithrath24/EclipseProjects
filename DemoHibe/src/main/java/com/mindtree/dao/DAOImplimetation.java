package com.mindtree.dao;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mindtree.model.Student;
import com.mindtree.utils.HibernateUtil;

public class DAOImplimetation implements DAOInterface 
{

	public String addStudent(Student s) 
	{
		 	Transaction trns = null;
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        try 
	        {
	            trns = session.beginTransaction();
	            session.save(s);
	            session.getTransaction().commit();
	            return "Record Added";
	        } 
	        catch (RuntimeException e) 
	        {
	            if (trns != null) 
	            {
	                trns.rollback();
	            }
	            e.printStackTrace();
	            return "Duplicate entry";
	        } 
	        finally 
	        {
	            session.flush();
	            session.close();
	        }
		
	}

	public String deleteStudent(int sid) 
	{
		Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try 
        {
            trns = session.beginTransaction();
            Student student = (Student) session.load(Student.class, new Integer(sid));
            session.delete(student);
            session.getTransaction().commit();
            return "Record Deleted!";
        } 
        catch (RuntimeException e) 
        {
            if (trns != null) 
            {
                trns.rollback();
            }
            e.printStackTrace();
            return "Record Not found!";
        } 
        finally 
        {
            session.flush();
            session.close();
        }
		
	}

	public String updateStudent(Student s) 
	{
		Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try 
        {
            trns = session.beginTransaction();
            session.update(s);
            session.getTransaction().commit();
            return "Record Updated!";
        } 
        catch (RuntimeException e) 
        {
            if (trns != null) 
            {
                trns.rollback();
            }
            System.out.println("Record Not Found!");
            e.printStackTrace();
            return null;
           
        } 
        finally 
        {
            session.flush();
            session.close();
        }
		
	}

	public Student getStudentById(int sid) 
	{
		
		Student student = null;
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try 
        {
            trns = session.beginTransaction();
            student = (Student) session.get(Student.class,sid);
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
        return student;
    
	}


}
