package com.bmapi.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ApiStatusRequest extends AuthDomain {
	private String referenceNo;

	public String getReferenceNo() {
		return referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public ApiStatusRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ApiStatusRequest(String userName, String password, String signedData, String conduitCode, String locatorCode,
			String referenceNo) {
		super(userName, password, signedData, conduitCode, locatorCode);
		this.referenceNo = referenceNo;
	}

}
