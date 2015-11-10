package com.bmapi.services;

import com.bmapi.model.Transaction;
import com.bmapi.model.TransactionRequest;

public interface TransactionRequestService {
	TransactionRequest convertToRequest(Transaction transaction);

}
