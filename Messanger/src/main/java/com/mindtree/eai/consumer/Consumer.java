package com.mindtree.eai.consumer;

import org.springframework.web.client.RestTemplate;

public class Consumer 
{

	public static void main(String[] args) 
	{
		
		String url = "http://localhost:8085/Messanger/webapi/messages";
		RestTemplate temp = new RestTemplate();
		String result = temp.getForObject(url,String.class);
		System.out.println(result);
		
	}

}