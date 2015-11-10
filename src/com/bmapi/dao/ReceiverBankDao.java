package com.bmapi.dao;

import com.bmapi.model.ReceiverBank;

public interface ReceiverBankDao {
	ReceiverBank getReceiverBank(String id, String receiver_id);
}
