package com.bmapi.services;

import com.bmapi.model.ReceiverBank;

public interface ReceiverBankService {
	ReceiverBank getReceiverBank(String id, String receiver_id);
}
