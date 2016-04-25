package com.mayank.jax.messenger.service;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Names {
	
	private String FirstName;
	private String SecondName;
	public Names(){}
	
	public Names(String FirstName, String SecondName){
		this.FirstName=FirstName;
		this.SecondName=SecondName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getSecondName() {
		return SecondName;
	}

	public void setSecondName(String secondName) {
		SecondName = secondName;
	}
}