package com.bmapi.services;

import java.util.HashMap;
import java.util.Map;

import com.bmapi.dao.RemarksDao;
import com.bmapi.dao.RemarksDaoImpl;
import com.bmapi.dao.TransactionDao;
import com.bmapi.dao.TransactionDaoImpl;
import com.bmapi.model.Transaction;

public class TransactionServiceImpl implements TransactionService {
	Map<String, Transaction> transactions;
	TransactionDao transactionDao;
	RemarksDao remarkDao;
	String status;
	
	public TransactionServiceImpl() {
		transactions = new HashMap<>();
		transactionDao = new TransactionDaoImpl();
	}

	@Override
	public Transaction getTransaction(String id) {
		transactionDao = new TransactionDaoImpl();
		return transactionDao.getTransaction(id);
	}

	@Override
	public void changeStatusToProcessing(String id) {
		this.status = "PROCESSING";
		transactionDao.updateStatus(id, this.status);
		remarkDao = new RemarksDaoImpl();
		remarkDao.createRemark(id, this.status);
		remarkDao.createLog(id, this.status);
	}

	@Override
	public void changeStatusToDelivered(String id) {
		this.status = "DELIVERED";
		transactionDao.updateStatus(id, this.status);
		remarkDao = new RemarksDaoImpl();
		remarkDao.createRemark(id, this.status);
		remarkDao.createLog(id, this.status);
	}

	@Override
	public void changeStatusToForPickUp(String id) {
		this.status = "FOR PICK-UP";
		transactionDao.updateStatus(id, this.status);
		remarkDao = new RemarksDaoImpl();
		remarkDao.createRemark(id, this.status);
		remarkDao.createLog(id, this.status);
	}

	@Override
	public void changeStatusToPending(String id) {
		this.status = "PENDING";
		transactionDao.updateStatus(id, this.status);
		remarkDao = new RemarksDaoImpl();
		remarkDao.createRemark(id, this.status);
		remarkDao.createLog(id, this.status);
	}
	public static void main(String[] args) {
		TransactionService service = new TransactionServiceImpl();
		service.changeStatusToPending("15111200001");
	}
}
