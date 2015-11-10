package com.bmapi.model;

public class Receiver extends ClassDomain {

	public Receiver() {
	}

	public Receiver(String rId, String rFirstname, String rLastname, String rMiddleInitial, String corporate_name,
			String rAddress1, String oAddress2, String rMobilePhone, String rReceiverGender, String rReceiverBirthDate,
			ReceiverBank receiverBank) {
		super(rId, rFirstname, rLastname, rMiddleInitial, corporate_name, rAddress1, oAddress2);
		this.rMobilePhone = rMobilePhone;
		this.rReceiverGender = rReceiverGender;
		this.rReceiverBirthDate = rReceiverBirthDate;
	}

	private String rMobilePhone;
	private String rReceiverGender = "";
	private String rReceiverBirthDate;

	public String getrMobilePhone() {
		return rMobilePhone;
	}

	public void setrMobilePhone(String rMobilePhone) {
		this.rMobilePhone = rMobilePhone;
	}

	public String getrReceiverGender() {
		return rReceiverGender;
	}

	public void setrReceiverGender(String rReceiverGender) {
		this.rReceiverGender = rReceiverGender;
	}

	public String getrReceiverBirthDate() {
		return rReceiverBirthDate;
	}

	public void setrReceiverBirthDate(String rReceiverBirthDate) {
		this.rReceiverBirthDate = rReceiverBirthDate;
	}
}
