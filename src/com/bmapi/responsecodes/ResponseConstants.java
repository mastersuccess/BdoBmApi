package com.bmapi.responsecodes;

public class ResponseConstants {
	private static final String RECEIVED_TRANSACTION_SUCCESSFULLY_RCV = "RCV";
	private static final String RECEIVED_TRANSACTION_SUCCESSFULLY_PRC = "RCV";
	private static final String RECEIVED_TRANSACTION_SUCCESSFULLY_1 = "1";
	private static final String RECEIVED_TRANSACTION_SUCCESSFULLY_01 = "01";
	private static final String INVALID_SIGNED_DATA = "VSD";
	private static final String INVALID_USER_PASSWORD = "VUP";
	private static final String INVALID_REFERENCE_NO = "VRN";
	private static final String INVALID_RECEIVER_ADD_1 = "RA1";
	private static final String INVALID_RECEIVER_MOBILE_NO = "RMP";
	private static final String INVALID_RECEIVER_GENDER = "VRG";
	private static final String INVALID_RECEIVER_BIRTHDATE = "VRB";
	private static final String INVALID_TRANSACTION_TYPE = "VTT";
	private static final String INVALID_PAYABLE_CODE = "VPC";

	private static final String INVALID_LANDED_CURRENCY = "VLC";
	private static final String INVALID_MESSAGE_TO_BENE_1 = "MB1";
	private static final String INVALID_MESSAGE_TO_BENE_2 = "MB2";
	private static final String UNABLE_TO_LOG_TXN = "STT";
	private static final String BRS_PASSWORD_EXCEPTION = "BPE";
	private static final String SIGNED_DATA_EXCEPTION = "PKI";
	private static final String TIE_UP_DATA_EXCEPTION = "SQL";
	private static final String INVALID_USER_CREDENTIALS = "BCR";
	private static final String INVALID_CONDUIT_CODE = "ICC";
	private static final String INVALID_LOCATOR_CODE = "ILC";
	private static final String INVALID_ACCOUNT_NUMBER = "FAN";

	private static final String UNABLE_TO_DECRYPT_PASSWORD = "PDC";
	private static final String CHECK_STATUS_ERROR = "CHK";
	private static final String INVALID_SENDER_PHONE = "VSP";
	private static final String INVALID_SENDER_LASTNAME = "VSL";
	private static final String INVALID_RECEIVER_LASTNAME = "VRL";
	private static final String INVALID_SENDER_ADDRESS_1 = "SA1";
	private static final String INVALID_SENDER_FIRSTNAME = "VSF";
	private static final String INVALID_RECEIVER_FIRSTNAME = "VRF";

	private static final String REFERENCE_NUMBER_ALREADY_EXIST = "DUP";
	private static final String BELOW_MINIMUM_AMOUNT = "MIN";
	private static final String EXCEEDS_MAXIMUM_AMOUNT = "MAX";
	private static final String SERVICE_FEE_NOT_YET_SETUP = "ISF";
	private static final String INVALID_BANK_CODE = "FBC";
	private static final String INVALID_TRANSACTION_DATE = "VID";
	private static final String TRANSACTION_TYPE_NOT_ALLOWED_FOR_THIS_OPERATION = "TNO";

	// TRANSACTION WEB SERVICE ERROR

	private static final String APPROVED_0 = "0";
	private static final String APPROVED_00 = "00";
	private static final String SYSTEM_ERROR = "-1";
	private static final String ACCESS_VIOLATION = "-2";
	private static final String USERNAME_AND_PASSWORD_DOES_NOT_MATCH = "-3";
	private static final String SERVER_TIME_DOES_NOT_SYNC = "-4";

	private static final String NOT_ALLOWED = "18";
	private static final String NO_FUNDS = "18";
	private static final String ACCOUNT_CLOSED = "201";
	private static final String ACCOUNT_SUSPENDED = "202";
	private static final String ACCOUNT_CANCELLED = "203";
	private static final String ACCOUNT_INACTIVE = "204";
	private static final String OWNER_DECEASED = "230";
	private static final String ACCOUNT_BLOCKED = "231";
	private static final String DORMANT_ACCOUNT = "15";
	private static final String ACCOUNT_NOT_FOUND = "21";
	private static final String CLOSED_ACCOUNT = "04";
	private static final String DECEASED_ACCOUNT = "26";
	private static final String INVALID_ACCOUNT = "76";
	private static final String INTERFACE_ERROR = "999";
	private static final String TRANSACTION_NOT_ALLOWED = "39";
	private static final String UNABLE_TO_PROCESS = "05";
	private static final String INVALID_TRANSACTION = "12";
	
	private static final String  BDO_WEB_SERVICE_EXCEPTION = "BWE";
	private static final String  IST_VERIFICATION_EXCEPTION = "IVE";
	private static final String  APPROVED_DWN = "DWN";
	

}
