package com.bmapi.services;

import java.util.HashMap;
import java.util.Map;

import com.bmapi.dao.TransactionDao;
import com.bmapi.dao.TransactionDaoImpl;
import com.bmapi.model.Transaction;

public class TransactionServiceImpl implements TransactionService {
	Map<String, Transaction> transactions;
	
	public TransactionServiceImpl() {
		transactions = new HashMap<>();
	}

	@Override
	public Transaction getTransaction(String id) {
		TransactionDao transactionDao = new TransactionDaoImpl();
		return transactionDao.getTransaction(id);
	}

}
