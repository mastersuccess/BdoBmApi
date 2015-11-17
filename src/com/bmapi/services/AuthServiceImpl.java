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
	public Auth getAuthForApiRequest(String transaction_id, String landedAmount, String transDate, String accountNo) {

		Auth auth = new Auth();
		//String userName = credentials.getString("credential.username");
		String userName = "133BMOFC1";
		String password = "3!1vjWwP5";
		String keyStoreFile = "C:/mrtristan.jks";
		String keyStorePassword = "bmm@$1n@g0ff1c3";
		String jks = "mrtristan";
		String keyPassword = "bmm@$1n@g1870";
		String encryptedPassword = "";
		try {
			encryptedPassword = CipherImpl.encrypt(password);
			auth.setPassword(encryptedPassword);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		
		auth.setUserName(userName);
		String signedData = "";
		try {
			signedData = PKIImpl.getTxnSignedData(password, transaction_id, landedAmount, transDate, accountNo,
					keyStoreFile, keyStorePassword, jks, keyPassword);
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
		System.out.println(transaction_id);
		System.out.println(accountNo);
		System.out.println(userName);
		System.out.println(password);
		System.out.println(keyStoreFile);
		System.out.println(keyStorePassword);
		System.out.println(jks);
		System.out.println(keyPassword);
		System.out.println(encryptedPassword);
		System.out.println(landedAmount);
		System.out.println(transDate);
		System.out.println(accountNo+" Account no");
		System.out.println(signedData);
		
		return auth;
	}

	@Override
	public Auth getAuthForApiStatusRequest(String transaction_id) {
		Auth auth = new Auth();
		String userName = credentials.getString("credential.username");
		String password = credentials.getString("credential.password");
		String keyStoreFile = credentials.getString("credential.keyStoreFile");
		String keyStorePassword = credentials.getString("credential.keyStorePassword");
		String jks = credentials.getString("credential.jks");
		String keyPassword = credentials.getString("credential.keyPassword");

		auth.setUserName(userName);
		
		System.out.println(transaction_id);
		System.out.println(userName);
		System.out.println(password);
		System.out.println(keyStoreFile);
		System.out.println(keyStorePassword);
		System.out.println(jks);
		System.out.println(keyPassword);
		
		try {
			auth.setPassword(CipherImpl.encrypt(password));
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			String signedData = PKIImpl.getStsSignedData(password, transaction_id, keyStoreFile, keyStorePassword, jks,
					keyPassword);
			System.out.println(signedData);
			auth.setSignedData(signedData);
			
			String sampleSignedData = PKIImpl.getStsSignedData("3!1vjWwP5", "15092100081", "C:/mrtristan.jks", "bmm@$1n@g0ff1c3", "mrtristan", "bmm@$1n@g1870");
			System.out.println(sampleSignedData);
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

		auth.setLocatorCode(credentials.getString("credential.locatorCode"));
		return auth;
	}

}
