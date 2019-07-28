package com.service.one.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Strudent implements Serializable{


	@JsonProperty("rollno")
	String rollno;
	
	@JsonProperty("name")
	String name;

	public Strudent(String rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	
	public Strudent() {

	}


	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	

}
