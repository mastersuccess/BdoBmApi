package com.bmapi.services;

import com.bmapi.model.ApiStatusRequest;
import com.bmapi.model.Auth;

public class ApiStatusRequestServiceImpl implements ApiStatusRequestService {

	@Override
	public ApiStatusRequest convertToRequest(String transaction_id) {
		AuthService authService = new AuthServiceImpl();
		Auth auth = authService.getAuthForApiStatusRequest(transaction_id);

		ApiStatusRequest apiStatusRequest = new ApiStatusRequest();
		apiStatusRequest.setUserName(auth.getUserName());
		apiStatusRequest.setPassword(auth.getPassword());
		apiStatusRequest.setSignedData(auth.getSignedData());
		apiStatusRequest.setLocatorCode(auth.getLocatorCode());
		apiStatusRequest.setReferenceNo(transaction_id);
		return apiStatusRequest;
	}

}
