package com.bmapi.model;

public class ReceiverBank {
	private String code;
	private String branch;
	private String accountNo;

	public ReceiverBank(String code, String branch, String accountNo) {
		this.code = code;
		this.branch = branch;
		this.accountNo = accountNo;
	}

	public ReceiverBank() {
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

}
