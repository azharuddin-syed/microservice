package com.techno.webservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.*;
import com.techno.beans.Person;

@RestController
@RequestMapping("person")
public class TechnoController {

	@GetMapping(value = "/getPerson",produces = "application/json")
	public String getPerson() {
		Person p = new Person("john",22);
		
		 return new Gson().toJson(p);
	}
}
