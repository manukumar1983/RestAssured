package org.restassuredpoc.org.restapiautomation;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class BookingDetail {
	private static ObjectMapper bookingDetail;	
	private static ObjectNode bookingDetailNode;
	private static ObjectNode bookingDatesNode;
	
	
	public static String bookingRequestGenartor() {
		
		bookingDetail = new ObjectMapper();
		bookingDetailNode = bookingDetail.createObjectNode();
		bookingDetailNode.put("firstname", "manu");
		bookingDetailNode.put("lastname", "manu");
		bookingDetailNode.put("totalprice", 10);
		bookingDetailNode.put("depositpaid",true);
		bookingDetailNode.put("additionalneeds","Lunch");
		
		//form the booking date object
		
		bookingDatesNode = bookingDetail.createObjectNode();
		bookingDatesNode.put("checkin", "2021-08-01");
		bookingDatesNode.put("checkout", "2021-08-02");
		
		bookingDetailNode.set("bookingdates", bookingDatesNode);
		
		return bookingDetailNode.toString();
		
		/*
		 * { "firstname" : "Jim", "lastname" : "Brown", "totalprice" : 111,
		 * "depositpaid" : true, "bookingdates" : { "checkin" : "2018-01-01", "checkout"
		 * : "2019-01-01" }, "additionalneeds" : "Breakfast" }'
		 */
		
	}
	
	}
