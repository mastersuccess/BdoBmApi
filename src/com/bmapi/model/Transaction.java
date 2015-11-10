package com.bmapi.model;


import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Transaction {
	private String id;
	private String code;
	private String account;
	private String type_of_transaction;
	private String type;
	private Double exchange_rate;
	private String date_time;
	private String sender;
	private String receiver;
	private Double amt_in;
	private Double amt_out;
	private String purpose;
	private String special_instruction;
	private String service_charge;
	private String courier;
	private String other_details;

	public Transaction() {
		
	}

	public Transaction(String id, String code, String account, String type_of_transaction, String type,
			Double exchange_rate, String date_time, String sender, String receiver, Double amt_in, Double amt_out,
			String purpose, String special_instruction, String service_charge, String courier, String other_details) {
		this.id = id;
		this.code = code;
		this.account = account;
		this.type_of_transaction = type_of_transaction;
		this.type = type;
		this.exchange_rate = exchange_rate;
		this.date_time = date_time;
		this.sender = sender;
		this.receiver = receiver;
		this.amt_in = amt_in;
		this.amt_out = amt_out;
		this.purpose = purpose;
		this.special_instruction = special_instruction;
		this.service_charge = service_charge;
		this.courier = courier;
		this.other_details = other_details;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getType_of_transaction() {
		return type_of_transaction;
	}

	public void setType_of_transaction(String type_of_transaction) {
		this.type_of_transaction = type_of_transaction;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getExchange_rate() {
		return exchange_rate;
	}

	public void setExchange_rate(Double exchange_rate) {
		this.exchange_rate = exchange_rate;
	}

	public String getDate_time() {
		return date_time;
	}

	public void setDate_time(String date_time) {
		this.date_time = date_time;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public Double getAmt_in() {
		return amt_in;
	}

	public void setAmt_in(Double amt_in) {
		this.amt_in = amt_in;
	}

	public Double getAmt_out() {
		return amt_out;
	}

	public void setAmt_out(Double amt_out) {
		this.amt_out = amt_out;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getSpecial_instruction() {
		return special_instruction;
	}

	public void setSpecial_instruction(String special_instruction) {
		this.special_instruction = special_instruction;
	}

	public String getService_charge() {
		return service_charge;
	}

	public void setService_charge(String service_charge) {
		this.service_charge = service_charge;
	}

	public String getCourier() {
		return courier;
	}

	public void setCourier(String courier) {
		this.courier = courier;
	}

	public String getOther_details() {
		return other_details;
	}

	public void setOther_details(String other_details) {
		this.other_details = other_details;
	}

}
