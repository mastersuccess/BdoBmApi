package com.bmapi.services;

import com.bmapi.model.ApiStatusRequest;

public interface ApiStatusRequestService {
	ApiStatusRequest convertToRequest(String transaction_id);
}
