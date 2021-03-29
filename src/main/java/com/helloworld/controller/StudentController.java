package com.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/student")
public class StudentController {

	@RequestMapping(value="/get", method = RequestMethod.GET)
	public String checkAndStoreCustomerData() {
		
		System.out.println("Returning data student from server");
		//Thread.sleep(10*1000);
		return "Hello student from Server";
	}
}
