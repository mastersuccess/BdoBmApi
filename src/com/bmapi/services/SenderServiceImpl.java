package com.bmapi.services;

import com.bmapi.dao.SenderDao;
import com.bmapi.dao.SenderDaoImpl;
import com.bmapi.model.Sender;

public class SenderServiceImpl implements SenderService {
	SenderDao senderDao;

	@Override
	public Sender getSender(String sender_id) {
		Sender sender = senderDao.getSender(sender_id);
		return sender;
	}

	public SenderServiceImpl() {
		senderDao = new SenderDaoImpl();
	}

}
