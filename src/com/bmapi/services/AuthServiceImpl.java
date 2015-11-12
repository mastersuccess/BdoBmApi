package com.bmapi.services;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;

import com.bdo.remit.cipher.impl.CipherImpl;
import com.bdo.remit.pki.impl.PKIImpl;
import com.bmapi.model.Auth;

public class AuthServiceImpl implements AuthService {
	ResourceBundle credentials;

	public AuthServiceImpl() {
		credentials = ResourceBundle.getBundle("com.bmapi.resources.credentials");
		Logger logger = Logger.getLogger(this.getClass());
		logger.info("log something");
	}

	@Override
	public Auth getAuth() {

		Auth auth = new Auth();
		String userName = credentials.getString("credential.username");
		String password = credentials.getString("credential.password");

		auth.setUserName(userName);
		try {
			auth.setPassword(CipherImpl.encrypt(password));
		} catch (Exception e) {
			e.printStackTrace();
		}
		auth.setConduitCode(credentials.getString("credential.conduitCode"));
		auth.setLocatorCode(credentials.getString("credential.locatorCode"));
		return auth;
	}

	@Override
	public Auth getAuth(String transaction_id) {

		Auth auth = new Auth();
		String userName = credentials.getString("credential.username");
		String password = credentials.getString("credential.password");
		String keyStoreFile = credentials.getString("credential.keyStoreFile");
		String keyStorePassword = credentials.getString("credential.keyStorePassword");
		String jks = credentials.getString("credential.jks");
		String keyPassword = credentials.getString("credential.keyPassword");

		auth.setUserName(userName);
		try {
			auth.setPassword(CipherImpl.encrypt(password));
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			String signedData = PKIImpl.getStsSignedData(password, transaction_id, keyStoreFile, keyStorePassword,
					jks, keyPassword);
			auth.setSignedData(signedData);
		} catch (UnrecoverableKeyException e) {
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (KeyStoreException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (CertificateException e) {
			e.printStackTrace();
		} catch (SignatureException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		auth.setConduitCode(credentials.getString("credential.conduitCode"));
		auth.setLocatorCode(credentials.getString("credential.locatorCode"));
		return auth;
	}

}
