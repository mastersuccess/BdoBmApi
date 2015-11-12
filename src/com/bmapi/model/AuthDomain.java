package com.bmapi.model;

public class AuthDomain {
	private String userName;
	private String password;
	private String signedData;
	private String conduitCode;
	private String locatorCode;

	public String getUserName() {
		return userName;
	}

	public AuthDomain(String userName, String password, String signedData, String conduitCode, String locatorCode) {
		this.userName = userName;
		this.password = password;
		this.signedData = signedData;
		this.conduitCode = conduitCode;
		this.locatorCode = locatorCode;
	}

	public AuthDomain() {
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSignedData() {
		return signedData;
	}

	public void setSignedData(String signedData) {
		this.signedData = signedData;
	}

	public String getConduitCode() {
		return conduitCode;
	}

	public void setConduitCode(String conduitCode) {
		this.conduitCode = conduitCode;
	}

	public String getLocatorCode() {
		return locatorCode;
	}

	public void setLocatorCode(String locatorCode) {
		this.locatorCode = locatorCode;
	}

}
