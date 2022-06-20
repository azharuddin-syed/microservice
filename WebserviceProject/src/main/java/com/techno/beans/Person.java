package com.techno.beans;

import lombok.Data;

@Data
public class Person {

	private String personName;
	private Integer age;
	
	public Person (String personName, Integer age){
		this.personName = personName;
		this.age = age;
	}
	

}
