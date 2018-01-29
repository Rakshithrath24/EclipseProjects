package com.mindtree.DemoHibe;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mindtree.model.Student;

public class App 
{
    public static void main( String[] args )
    {
        
    	Student s = new Student();
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the Student Id:");
    	int id=sc.nextInt();
    	System.out.println("Enter the Student Name:");
    	String sname=sc.next();
    	System.out.println("Enter the Student Dept:");
    	String sdept=sc.next();
    	
    	s.setSid(id);
    	s.setSname(sname);
    	s.setSdept(sdept);
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
    	SessionFactory sf = con.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction tx = session.beginTransaction();
    	session.save(s);
    	tx.commit();
    }
}
