package com.bmapi.services;

import com.bmapi.model.Transaction;
import com.bmapi.model.ApiRequest;

public interface ApiRequestService {
	ApiRequest convertToRequest(Transaction transaction);

}
