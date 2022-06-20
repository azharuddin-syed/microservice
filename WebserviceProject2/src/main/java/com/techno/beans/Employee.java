package com.techno.beans;

import lombok.Data;

@Data
public class Employee {

	private String employeeName;
	private Integer age;
	
	public Employee (String employeeName, Integer age){
		this.employeeName = employeeName;
		this.age = age;
	}
	

}
