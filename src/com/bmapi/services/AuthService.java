package com.bmapi.services;

import com.bmapi.model.Auth;

public interface AuthService {
	Auth getAuth();

	Auth getAuth(String transaction_id);
}
