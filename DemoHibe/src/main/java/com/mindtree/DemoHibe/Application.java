package com.mindtree.DemoHibe;

import java.util.Scanner;

import com.mindtree.dao.DAOImplimetation;
import com.mindtree.dao.DAOInterface;
import com.mindtree.model.Student;

public class Application 
{

	public static void main(String[] args) 
	{
		
		Student s = new Student();
		DAOInterface dao = new DAOImplimetation();
		String str="";
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("1.AddStudent");
			System.out.println("2.DeleteStudent");
			System.out.println("3.UpdateStudent");
			System.out.println("4.getStudentById");
			System.out.println("Enetr your Choice");
			int n = sc.nextInt();
			switch(n)
			{
			case 1:
				System.out.println("AddStudent!");
				System.out.println("----------------");
				System.out.println("Enter the Student Id:");
		    	int id=sc.nextInt();
		    	System.out.println("Enter the Student Name:");
		    	String sname=sc.next();
		    	System.out.println("Enter the Student Dept:");
		    	String sdept=sc.next();
		    	s.setSid(id);
		    	s.setSname(sname);
		    	s.setSdept(sdept);
		    	dao.addStudent(s);
		    	break;
			case 2:
				System.out.println("DeleteStudent!");
				System.out.println("---------------");
				System.out.println("Enter Student ID:");
				int id1=sc.nextInt();
				System.out.println(dao.deleteStudent(id1));
				break;
			case 3:
				System.out.println("UpadetStudent!");
				System.out.println("----------------");
				System.out.println("Enter the Student Id:");
		    	int id2=sc.nextInt();
		    	System.out.println("Enter the Student Name:");
		    	String sname2=sc.next();
		    	System.out.println("Enter the Student Dept:");
		    	String sdept2=sc.next();
		    	s.setSid(id2);
		    	s.setSname(sname2);
		    	s.setSdept(sdept2);
		    	System.out.println(dao.updateStudent(s));
		    	break;
			case 4:
				System.out.println("getRecordById!");
				System.out.println("----------------");
				System.out.println("Enter the Student ID:");
				int id3 = sc.nextInt();
				System.out.println(dao.getStudentById(id3));
			}
			System.out.println("Do you wish to continue:Yes/NO");
			str = sc.next();
			
		}while(str.equalsIgnoreCase("YES"));
	}

}
