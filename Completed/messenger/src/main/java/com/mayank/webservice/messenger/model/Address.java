package com.mayank.webservice.messenger.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Address {

	String Society,City,State,type;
	Long Pincode;

	public Address(){

	}

	public Address(String Society,String City,String State,Long Pincode){

		this.Society=Society;
		this.City=City;
		this.State=State;
		this.Pincode=Pincode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSociety() {
		return Society;
	}
	public void setSociety(String society) {
		Society = society;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}

	public Long getPincode() {
		return Pincode;
	}

	public void setPincode(Long pincode) {
		Pincode = pincode;
	}	
}