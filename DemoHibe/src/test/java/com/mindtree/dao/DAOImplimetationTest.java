package com.mindtree.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mindtree.model.Student;

public class DAOImplimetationTest 
{

	@Test
	public void addStudent_InsertRecord() 
	{
		DAOImplimetation obj = new DAOImplimetation();
		Student s = new Student();
		s.setSid(10000);
		s.setSname("Ram");
		s.setSdept("EAI");
		assertEquals("Record Added",obj.addStudent(s));
	}
	@Test
	public void deleteStudent_deleteRecord()
	{
		DAOImplimetation obj = new DAOImplimetation();
		assertEquals("Record Not found!",obj.deleteStudent(105));
		
	}
	@Test
	public void updateStudent_recordUpdate()
	{
		DAOImplimetation obj = new DAOImplimetation();
		Student s = new Student();
		s.setSid(123);
		s.setSname("Rakshith");
		s.setSdept("EAI");
		assertEquals("Record Updated!",obj.updateStudent(s));
	}
}
