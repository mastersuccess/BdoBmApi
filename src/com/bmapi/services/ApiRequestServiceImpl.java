package com.bmapi.services;

import java.text.DecimalFormat;

import com.bmapi.constants.CurrencyCodes;
import com.bmapi.constants.DefaulCodes;
import com.bmapi.constants.PayableCodes;
import com.bmapi.constants.TransactionTypeCodes;
import com.bmapi.model.Auth;
import com.bmapi.model.Receiver;
import com.bmapi.model.ReceiverBank;
import com.bmapi.model.Sender;
import com.bmapi.model.Transaction;
import com.bmapi.model.ApiRequest;

public class ApiRequestServiceImpl implements ApiRequestService {

	@Override
	public ApiRequest convertToRequest(Transaction transaction) {
		return convert(transaction);
	}

	private ApiRequest convert(Transaction transaction) {
		ApiRequest apiRequest = new ApiRequest();
		AuthService authService = new AuthServiceImpl();
		ReceiverBankService receiverBankService = new ReceiverBankServiceImpl();
		ReceiverService receiverService = new ReceiverServiceImpl();
		Receiver receiver = receiverService.getReceiver(transaction.getReceiver());
		ReceiverBank receiverBank = new ReceiverBank();

		apiRequest.setReceiverFirstname(receiver.getrFirstname());
		apiRequest.setReceiverMiddlename(receiver.getrMiddleInitial());
		apiRequest.setReceiverLastname(receiver.getrLastname());
		apiRequest.setReceiverAddress1(receiver.getrAddress1());
		apiRequest.setReceiverAddress2(receiver.getoAddress2());
		apiRequest.setReceiverMobilePhone(receiver.getrMobilePhone());
		apiRequest.setReceiverGender(receiver.getrReceiverGender());
		apiRequest.setReceiverBirthDate(receiver.getrReceiverBirthDate());

		if (transaction.getType_of_transaction().equals("BD")) {
			receiverBank = receiverBankService.getReceiverBank(transaction.getOther_details(), receiver.getrId());
		}

		apiRequest.setAccountNo(receiverBank.getAccountNo());
		DecimalFormat decimalFormatter = new DecimalFormat("#.00");
		String landedAmountFormatted = decimalFormatter.format(transaction.getAmt_out());
		Auth auth = authService.getAuthForApiRequest(transaction.getId(), landedAmountFormatted,
				transaction.getDate_time(), (receiverBank.getAccountNo() == null) ? "" : receiverBank.getAccountNo());

		apiRequest.setUserName(auth.getUserName());
		apiRequest.setPassword(auth.getPassword());
		apiRequest.setSignedData(auth.getSignedData());
		apiRequest.setConduitCode(auth.getConduitCode());
		apiRequest.setLocatorCode(auth.getLocatorCode());
		apiRequest.setReferenceNo(transaction.getId());
		apiRequest.setTransDate(transaction.getDate_time());

		SenderService senderService = new SenderServiceImpl();
		Sender sender = senderService.getSender(transaction.getSender());
		apiRequest.setSenderFirstName(sender.getrFirstname());
		apiRequest.setSenderMiddlename(sender.getrMiddleInitial());
		apiRequest.setSenderLastname(sender.getrLastname());
		apiRequest.setSenderAddress1(sender.getrAddress1());
		apiRequest.setSenderAddress2(sender.getoAddress2());
		apiRequest.setSenderPhone(sender.getrPhoneNo());

		if (transaction.getType_of_transaction().equals("CP")) {
			apiRequest.setTransactionType(TransactionTypeCodes.PICKUP_CASH_ANYWHERE);
			apiRequest.setPayableCode(PayableCodes.PICKUP_CASH_ANYWHERE);
			apiRequest.setBankCode(DefaulCodes.BDO_DEFAULT_MESSAGE);
			apiRequest.setBranchName(DefaulCodes.BDO_DEFAULT_MESSAGE);
		}

		if (transaction.getType_of_transaction().equals("BD")) {
			apiRequest.setTransactionType(TransactionTypeCodes.CREDIT_TO_BDO_ACCOUNT);
			apiRequest.setPayableCode(PayableCodes.CREDIT_TO_BDO_ACCOUNT);
			apiRequest.setBankCode(DefaulCodes.BDO_DEFAULT_MESSAGE);
			apiRequest.setBranchName(DefaulCodes.BDO_DEFAULT_MESSAGE);

		}

		apiRequest.setLandedCurrency(CurrencyCodes.PHILIPPINES);
		apiRequest.setLandedAmount(landedAmountFormatted);
		apiRequest.setMessageToBene1(DefaulCodes.BDO_DEFAULT_MESSAGE);
		apiRequest.setMessageToBene2("");

		return apiRequest;
	}

}
