package com.bmapi.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.bmapi.model.Transaction;
import com.bmapi.model.ApiRequest;
import com.bmapi.model.ApiStatusRequest;
import com.bmapi.services.ApiRequestService;
import com.bmapi.services.ApiRequestServiceImpl;
import com.bmapi.services.ApiStatusRequestService;
import com.bmapi.services.ApiStatusRequestServiceImpl;
import com.bmapi.services.TransactionService;
import com.bmapi.services.TransactionServiceImpl;

@Path("/api")
public class GeneralResource {

	@GET
	@Path("/{transaction_id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getApiRequestAsJSON(@PathParam("transaction_id") String referenceNo) {
		TransactionService transactionService = new TransactionServiceImpl();
		Transaction transaction = transactionService.getTransaction(referenceNo);

		ApiRequestService transactionRequestService = new ApiRequestServiceImpl();
		ApiRequest transactionRequest = new ApiRequest();
		transactionRequest = transactionRequestService.convertToRequest(transaction);

		return Response.status(Status.OK).entity(transactionRequest).build();
	}

	@GET
	@Path("/{transaction_id}")
	@Produces(MediaType.TEXT_XML)
	public Response getApiRequestAsXML(@PathParam("transaction_id") String referenceNo) {
		TransactionService transactionService = new TransactionServiceImpl();
		Transaction transaction = transactionService.getTransaction(referenceNo);

		ApiRequestService transactionRequestService = new ApiRequestServiceImpl();
		ApiRequest transactionRequest = new ApiRequest();
		transactionRequest = transactionRequestService.convertToRequest(transaction);

		return Response.status(Status.OK).entity(transactionRequest).build();
	}

	@GET
	@Path("/status/{transaction_id}")
	@Produces(MediaType.TEXT_XML)
	public Response getApiStatusRequest(@PathParam("transaction_id") String transaction_id) {
		ApiStatusRequestService apiStatusRequestService = new ApiStatusRequestServiceImpl();
		ApiStatusRequest apiStatusRequest = apiStatusRequestService.convertToRequest(transaction_id);
		return Response.status(Status.OK).entity(apiStatusRequest).build();
	}

	public static void main(String[] args) {

	}

}
