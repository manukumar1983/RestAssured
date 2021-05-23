package org.restassuredpoc.org.restapiautomation;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Authenticator {
	private static ObjectMapper objectMapper;
	private static ObjectNode authRequest;
	public static String authRequestGeneraor(String userName,String passWord) {
		
		objectMapper = new ObjectMapper();
		authRequest = objectMapper.createObjectNode();
		authRequest.put("username", userName);
		authRequest.put("password", passWord);		
		return authRequest.toString();	
		/*
		 * { "username" : "admin", "password" : "password123" }'
		 */
		
		
	}
	
}
	

