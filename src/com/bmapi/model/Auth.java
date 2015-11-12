package com.bmapi.model;

public class Auth {
	private String userName;
	private String password;
	private String signedData;
	private static final String conduitCode = "BM";
	private static final String locatorCode = "133";

	public static String getLocatorcode() {
		return locatorCode;
	}

	public static String getConduitcode() {
		return conduitCode;
	}

	public String getUserName() {
		return userName;
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

}
