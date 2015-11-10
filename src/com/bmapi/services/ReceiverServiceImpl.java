package com.bmapi.services;

import com.bmapi.dao.ReceiverDao;
import com.bmapi.dao.ReceiverDaoImpl;
import com.bmapi.model.Receiver;

public class ReceiverServiceImpl implements ReceiverService {
	ReceiverDao receiverDao;

	@Override
	public Receiver getReceiver(String receiverId) {
		Receiver receiver = receiverDao.getReceiver(receiverId);
		return receiver;
	}

	public ReceiverServiceImpl() {
		receiverDao = new ReceiverDaoImpl();
	}

}
