package com.bmapi.services;

import com.bmapi.dao.ReceiverBankDao;
import com.bmapi.dao.ReceiverBankDaoImpl;
import com.bmapi.model.ReceiverBank;

public class ReceiverBankServiceImpl implements ReceiverBankService {
	ReceiverBankDao receiverBankDao;

	@Override
	public ReceiverBank getReceiverBank(String id, String receiver_id) {
		return receiverBankDao.getReceiverBank(id, receiver_id);
	}

	public ReceiverBankServiceImpl() {
		receiverBankDao = new ReceiverBankDaoImpl();
	}

}
