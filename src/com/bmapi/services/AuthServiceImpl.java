package com.bmapi.services;

import java.util.ResourceBundle;

import com.bmapi.model.Auth;

public class AuthServiceImpl implements AuthService{

	@Override
	public Auth getAuth() {
		ResourceBundle credentials = ResourceBundle.getBundle("com.bmapi.resources.credentials");
		Auth auth = new Auth();
		String userName = credentials.getString("credentials.username");
		auth.setUserName(userName);
		return auth;
	}
	
}
