package com.techno.webservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.*;
import com.techno.beans.Employee;

@RestController
@RequestMapping("employee")
public class TechnoController {

	@GetMapping(value = "/getEmployee",produces = "application/json")
	public String getPerson() {
		Employee p = new Employee("Alexender",32);
		
		 return new Gson().toJson(p);
	}
}
