package com.bmapi.services;

import com.bmapi.model.Auth;

public interface AuthService {
	Auth getAuth();

	Auth getAuthForApiRequest(String transaction_id, String landedAmount,String transDate,String accountNo);

	Auth getAuthForApiStatusRequest(String transaction_id);
}
