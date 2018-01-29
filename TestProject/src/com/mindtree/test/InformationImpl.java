package com.mindtree.test;

import java.util.HashMap;

public class InformationImpl implements Info 
{

	HashMap<Integer,Information> map = new HashMap<>();
	int id=0;
	public String addInfo(Information i) 
	{
		if(map.containsValue(i))
		return "Person Already Exist";
		
		map.put(id,i);
		id++;
		return "Person Added";
	}

	public Information getByMail(String email) 
	{
		
		return null;
	}

}
