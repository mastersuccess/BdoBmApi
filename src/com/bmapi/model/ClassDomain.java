package com.bmapi.model;

public class ClassDomain {
	private String rId;
	private String rFirstname;
	private String rLastname;
	private String rMiddleInitial;
	private String corporate_name;
	private String rAddress1 = "";
	private String oAddress2 = "";

	public ClassDomain() {
		
	}

	public String getrId() {
		return rId;
	}

	public void setrId(String rId) {
		this.rId = rId;
	}

	public String getrFirstname() {
		return rFirstname;
	}

	public void setrFirstname(String rFirstname) {
		this.rFirstname = rFirstname;
	}

	public String getrLastname() {
		return rLastname;
	}

	public void setrLastname(String rLastname) {
		this.rLastname = rLastname;
	}

	public String getrMiddleInitial() {
		return rMiddleInitial;
	}

	public void setrMiddleInitial(String rMiddleInitial) {
		this.rMiddleInitial = rMiddleInitial;
	}

	public String getCorporate_name() {
		return corporate_name;
	}

	public void setCorporate_name(String corporate_name) {
		this.corporate_name = corporate_name;
	}

	public String getrAddress1() {
		return rAddress1;
	}

	public void setrAddress1(String rAddress1) {
		this.rAddress1 = rAddress1;
	}

	public String getoAddress2() {
		return oAddress2;
	}

	public void setoAddress2(String oAddress2) {
		this.oAddress2 = oAddress2;
	}

	public ClassDomain(String rId, String rFirstname, String rLastname, String rMiddleInitial, String corporate_name,
			String rAddress1, String oAddress2) {
		this.rId = rId;
		this.rFirstname = rFirstname;
		this.rLastname = rLastname;
		this.rMiddleInitial = rMiddleInitial;
		this.corporate_name = corporate_name;
		this.rAddress1 = rAddress1;
		this.oAddress2 = oAddress2;
	}

}
