package com.bmapi.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ApiRequest extends AuthDomain {
	private String referenceNo;
	private String transDate;
	private String senderFirstName;
	private String senderLastname;
	private String senderMiddlename;
	private String senderAddress1;
	private String senderAddress2;
	private String senderPhone;
	private String receiverFirstname;
	private String receiverLastname;
	private String receiverMiddlename;
	private String receiverAddress1;
	private String receiverAddress2;
	private String receiverMobilePhone;
	private String receiverGender;
	private String receiverBirthDate;
	private String transactionType;
	private String payableCode;
	private String bankCode;
	private String branchName;
	private String accountNo;
	private String landedCurrency;
	private String landedAmount;
	private String messageToBene1;
	private String messageToBene2;

	public ApiRequest(String userName, String password, String signedData, String conduitCode,
			String locatorCode, String referenceNo, String transDate, String senderFirstName, String senderLastname,
			String senderMiddlename, String senderAddress1, String senderAddress2, String senderPhone,
			String receiverFirstname, String receiverLastname, String receiverMiddlename, String receiverAddress1,
			String receiverAddress2, String receiverMobilePhone, String receiverGender, String receiverBirthDate,
			String transactionType, String payableCode, String bankCode, String branchName, String accountNo,
			String landedCurrency, String landedAmount, String messageToBene1, String messageToBene2) {
		super(userName, password, signedData, conduitCode, locatorCode);
		this.referenceNo = referenceNo;
		this.transDate = transDate;
		this.senderFirstName = senderFirstName;
		this.senderLastname = senderLastname;
		this.senderMiddlename = senderMiddlename;
		this.senderAddress1 = senderAddress1;
		this.senderAddress2 = senderAddress2;
		this.senderPhone = senderPhone;
		this.receiverFirstname = receiverFirstname;
		this.receiverLastname = receiverLastname;
		this.receiverMiddlename = receiverMiddlename;
		this.receiverAddress1 = receiverAddress1;
		this.receiverAddress2 = receiverAddress2;
		this.receiverMobilePhone = receiverMobilePhone;
		this.receiverGender = receiverGender;
		this.receiverBirthDate = receiverBirthDate;
		this.transactionType = transactionType;
		this.payableCode = payableCode;
		this.bankCode = bankCode;
		this.branchName = branchName;
		this.accountNo = accountNo;
		this.landedCurrency = landedCurrency;
		this.landedAmount = landedAmount;
		this.messageToBene1 = messageToBene1;
		this.messageToBene2 = messageToBene2;
	}

	public ApiRequest() {
	}

	public String getReferenceNo() {
		return referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public String getTransDate() {
		return transDate;
	}

	public void setTransDate(String transDate) {
		this.transDate = transDate;
	}

	public String getSenderFirstName() {
		return senderFirstName;
	}

	public void setSenderFirstName(String senderFirstName) {
		this.senderFirstName = senderFirstName;
	}

	public String getSenderLastname() {
		return senderLastname;
	}

	public void setSenderLastname(String senderLastname) {
		this.senderLastname = senderLastname;
	}

	public String getSenderMiddlename() {
		return senderMiddlename;
	}

	public void setSenderMiddlename(String senderMiddlename) {
		this.senderMiddlename = senderMiddlename;
	}

	public String getSenderAddress1() {
		return senderAddress1;
	}

	public void setSenderAddress1(String senderAddress1) {
		this.senderAddress1 = senderAddress1;
	}

	public String getSenderAddress2() {
		return senderAddress2;
	}

	public void setSenderAddress2(String senderAddress2) {
		this.senderAddress2 = senderAddress2;
	}

	public String getSenderPhone() {
		return senderPhone;
	}

	public void setSenderPhone(String senderPhone) {
		this.senderPhone = senderPhone;
	}

	public String getReceiverFirstname() {
		return receiverFirstname;
	}

	public void setReceiverFirstname(String receiverFirstname) {
		this.receiverFirstname = receiverFirstname;
	}

	public String getReceiverLastname() {
		return receiverLastname;
	}

	public void setReceiverLastname(String receiverLastname) {
		this.receiverLastname = receiverLastname;
	}

	public String getReceiverMiddlename() {
		return receiverMiddlename;
	}

	public void setReceiverMiddlename(String receiverMiddlename) {
		this.receiverMiddlename = receiverMiddlename;
	}

	public String getReceiverAddress1() {
		return receiverAddress1;
	}

	public void setReceiverAddress1(String receiverAddress1) {
		this.receiverAddress1 = receiverAddress1;
	}

	public String getReceiverAddress2() {
		return receiverAddress2;
	}

	public void setReceiverAddress2(String receiverAddress2) {
		this.receiverAddress2 = receiverAddress2;
	}

	public String getReceiverMobilePhone() {
		return receiverMobilePhone;
	}

	public void setReceiverMobilePhone(String receiverMobilePhone) {
		this.receiverMobilePhone = receiverMobilePhone;
	}

	public String getReceiverGender() {
		return receiverGender;
	}

	public void setReceiverGender(String receiverGender) {
		this.receiverGender = receiverGender;
	}

	public String getReceiverBirthDate() {
		return receiverBirthDate;
	}

	public void setReceiverBirthDate(String receiverBirthDate) {
		this.receiverBirthDate = receiverBirthDate;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getPayableCode() {
		return payableCode;
	}

	public void setPayableCode(String payableCode) {
		this.payableCode = payableCode;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getLandedCurrency() {
		return landedCurrency;
	}

	public void setLandedCurrency(String landedCurrency) {
		this.landedCurrency = landedCurrency;
	}

	public String getLandedAmount() {
		return landedAmount;
	}

	public void setLandedAmount(String landedAmount) {
		this.landedAmount = landedAmount;
	}

	public String getMessageToBene1() {
		return messageToBene1;
	}

	public void setMessageToBene1(String messageToBene1) {
		this.messageToBene1 = messageToBene1;
	}

	public String getMessageToBene2() {
		return messageToBene2;
	}

	public void setMessageToBene2(String messageToBene2) {
		this.messageToBene2 = messageToBene2;
	}

}
