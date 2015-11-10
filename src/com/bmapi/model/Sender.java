package com.bmapi.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Sender extends ClassDomain {
	private String rPhoneNo;

	public Sender(String rId, String rFirstname, String rLastname, String rMiddleInitial, String corporate_name,
			String rAddress1, String oAddress2, String rPhoneNo) {
		super(rId, rFirstname, rLastname, rMiddleInitial, corporate_name, rAddress1, oAddress2);
		this.rPhoneNo = rPhoneNo;
	}

	public String getrPhoneNo() {
		return rPhoneNo;
	}

	public void setrPhoneNo(String rPhoneNo) {
		this.rPhoneNo = rPhoneNo;
	}

	public Sender() {
		
	}

}
