package com.bmapi.services;

import java.text.DecimalFormat;

import com.bmapi.constants.CurrencyCodes;
import com.bmapi.constants.DefaulCodes;
import com.bmapi.constants.PayableCodes;
import com.bmapi.constants.TransactionTypeCodes;
import com.bmapi.model.Receiver;
import com.bmapi.model.ReceiverBank;
import com.bmapi.model.Sender;
import com.bmapi.model.Transaction;
import com.bmapi.model.TransactionRequest;

public class TransactionRequestServiceImpl implements TransactionRequestService {

	@Override
	public TransactionRequest convertToRequest(Transaction transaction) {
		return convert(transaction);
	}

	private TransactionRequest convert(Transaction transaction) {
		TransactionRequest transactionRequest = new TransactionRequest();
		transactionRequest.setReferenceNo(transaction.getId());
		transactionRequest.setTransDate(transaction.getDate_time());

		SenderService senderService = new SenderServiceImpl();
		Sender sender = senderService.getSender(transaction.getSender());
		transactionRequest.setSenderFirstName(sender.getrFirstname());
		transactionRequest.setSenderMiddlename(sender.getrMiddleInitial());
		transactionRequest.setSenderLastname(sender.getrLastname());
		transactionRequest.setSenderAddress1(sender.getrAddress1());
		transactionRequest.setSenderAddress2(sender.getoAddress2());
		transactionRequest.setSenderPhone(sender.getrPhoneNo());

		ReceiverService receiverService = new ReceiverServiceImpl();
		Receiver receiver = receiverService.getReceiver(transaction.getReceiver());
		transactionRequest.setReceiverFirstname(receiver.getrFirstname());
		transactionRequest.setReceiverMiddlename(receiver.getrMiddleInitial());
		transactionRequest.setReceiverLastname(receiver.getrLastname());
		transactionRequest.setReceiverAddress1(receiver.getrAddress1());
		transactionRequest.setReceiverAddress2(receiver.getoAddress2());
		transactionRequest.setReceiverMobilePhone(receiver.getrMobilePhone());
		transactionRequest.setReceiverGender(receiver.getrReceiverGender());
		transactionRequest.setReceiverBirthDate(receiver.getrReceiverBirthDate());

		if (transaction.getType_of_transaction().equals("CP")) {
			transactionRequest.setTransactionType(TransactionTypeCodes.PICKUP_CASH_ANYWHERE);
			transactionRequest.setPayableCode(PayableCodes.PICKUP_CASH_ANYWHERE);
			transactionRequest.setBankCode(DefaulCodes.BDO_DEFAULT_MESSAGE);
			transactionRequest.setBranchName(DefaulCodes.BDO_DEFAULT_MESSAGE);
		}

		if (transaction.getType_of_transaction().equals("BD")) {
			transactionRequest.setTransactionType(TransactionTypeCodes.CREDIT_TO_BDO_ACCOUNT);
			transactionRequest.setPayableCode(PayableCodes.CREDIT_TO_BDO_ACCOUNT);
			transactionRequest.setBankCode(DefaulCodes.BDO_DEFAULT_MESSAGE);
			transactionRequest.setBranchName(DefaulCodes.BDO_DEFAULT_MESSAGE);

			ReceiverBankService receiverBankService = new ReceiverBankServiceImpl();
			ReceiverBank receiverBank = receiverBankService.getReceiverBank(transaction.getOther_details(),
					receiver.getrId());

			transactionRequest.setAccountNo(receiverBank.getAccountNo());
		}
		

		transactionRequest.setLandedCurrency(CurrencyCodes.PHILIPPINES);
		DecimalFormat decimalFormatter = new DecimalFormat("#.00");
		transactionRequest.setLandedAmount(decimalFormatter.format(transaction.getAmt_out()));
		transactionRequest.setMessageToBene1(DefaulCodes.BDO_DEFAULT_MESSAGE);
		transactionRequest.setMessageToBene2("");
		
		return transactionRequest;
		
	}

}
