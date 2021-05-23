package org.restassuredpoc.org.restapiautomation;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class userRegister {
	
	private static ObjectMapper objectMapper;
	private static ObjectNode authRequest;
	public static String userCreateRequestGeneraor(String userName,String job) {
		
		objectMapper = new ObjectMapper();
		authRequest = objectMapper.createObjectNode();
		authRequest.put("name", userName);
		authRequest.put("job", job);		
		return authRequest.toString();	
		
		
		
	}


}
