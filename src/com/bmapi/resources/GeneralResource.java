package com.bmapi.resources;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.log4j.Logger;

import com.bmapi.model.Transaction;
import com.bmapi.model.TransactionRequest;
import com.bmapi.services.TransactionRequestService;
import com.bmapi.services.TransactionRequestServiceImpl;
import com.bmapi.services.TransactionService;
import com.bmapi.services.TransactionServiceImpl;

@Path("/api")
public class GeneralResource {

	@GET
	@Path("/{transaction_id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAsJSON(@PathParam("transaction_id") String referenceNo) {
		TransactionService transactionService = new TransactionServiceImpl();
		Transaction transaction = transactionService.getTransaction(referenceNo);

		TransactionRequestService transactionRequestService = new TransactionRequestServiceImpl();
		TransactionRequest transactionRequest = new TransactionRequest();
		transactionRequest = transactionRequestService.convertToRequest(transaction);

		return Response.status(Status.OK).entity(transactionRequest).build();
	}

	@GET
	@Path("/{transaction_id}")
	@Produces(MediaType.TEXT_XML)
	public Response getAsXML(@PathParam("transaction_id") String referenceNo) {
		TransactionService transactionService = new TransactionServiceImpl();
		Transaction transaction = transactionService.getTransaction(referenceNo);

		TransactionRequestService transactionRequestService = new TransactionRequestServiceImpl();
		TransactionRequest transactionRequest = new TransactionRequest();
		transactionRequest = transactionRequestService.convertToRequest(transaction);
		
		return Response.status(Status.OK).entity(transactionRequest).build();
	}
	
}
