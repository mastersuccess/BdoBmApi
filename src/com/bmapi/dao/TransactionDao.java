package com.bmapi.dao;

import com.bmapi.model.Transaction;

public interface TransactionDao {
	Transaction getTransaction(String id);

	int updateStatus(String transaction_id, String status);
}
