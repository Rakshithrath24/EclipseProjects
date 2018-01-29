package com.mindtree.eai.exception;

public class InvalidLeadIdException extends RuntimeException
{
	public InvalidLeadIdException() 
	{
		super();
		System.out.println("Invalid Lead Id!");
	}
}
