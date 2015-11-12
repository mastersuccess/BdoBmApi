package com.bmapi.dao;

public interface RemarksDao {
	int createRemark(String transaction_id,String status);
	int createLog(String transaction_id, String status);
}
