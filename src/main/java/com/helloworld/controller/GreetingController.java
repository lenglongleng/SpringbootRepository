package com.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class GreetingController {

	@RequestMapping(value="/student/get", method = RequestMethod.GET)
	public String checkAndStoreCustomerData() {
		
		System.out.println("Returning data from server");
		//Thread.sleep(10*1000);
		return "Hello from Server";
	}
	
	/*
	@RequestMapping(value="/insert/student", method = RequestMethod.POST)
	public ResponseEntity<CheckAndStoreCustomerDataResponse> checkAndStoreCustomerData(@RequestBody CheckAndStoreCustomerDataRequest request) {
		
	}
	*/
}
