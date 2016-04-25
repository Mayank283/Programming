package com.mayank.webservice.messenger.model;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@XmlRootElement
public class Names {


	String firstName,SecondName;
	int id;
	Map<String,Address> addressmap=new HashMap<>();

	public Names(){}

	public Names(String firstName,String SecondName){
		this.firstName=firstName;
		this.SecondName=SecondName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return SecondName;
	}

	public void setSecondName(String secondName) {
		SecondName = secondName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@XmlTransient
	public Map<String, Address> getAddressmap() {
		return addressmap;
	}

	public void setAddressmap(Map<String, Address> addressmap) {
		this.addressmap = addressmap;
	}
}