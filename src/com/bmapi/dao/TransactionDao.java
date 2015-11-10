package com.bmapi.dao;

import com.bmapi.model.Transaction;

public interface TransactionDao {
	Transaction getTransaction(String id);
}
