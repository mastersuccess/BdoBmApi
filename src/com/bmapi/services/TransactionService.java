package com.bmapi.services;

import com.bmapi.model.Transaction;

public interface TransactionService {
	Transaction getTransaction(String id);

	void changeStatusToProcessing(String id);

	void changeStatusToDelivered(String id);

	void changeStatusToForPickUp(String id);

	void changeStatusToPending(String id);
	
	
}
