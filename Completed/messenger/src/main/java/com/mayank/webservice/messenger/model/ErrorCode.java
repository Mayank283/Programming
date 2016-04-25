package com.mayank.webservice.messenger.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorCode {

	String Code,reason;
	
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public ErrorCode(){
		
	}
	public ErrorCode(String Code,String reason){
		this.Code = Code;
		this.reason=reason;
	}

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}
}