package com.mindtree.dao;

import com.mindtree.model.Student;

public interface DAOInterface 
{
	public String addStudent(Student s);
	public String deleteStudent(int sid);
	public String updateStudent(Student s);
	public Student getStudentById(int sid);
}
