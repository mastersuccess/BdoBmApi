package com.bmapi.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.bmapi.model.Auth;
import com.bmapi.model.Transaction;
import com.bmapi.model.ApiRequest;
import com.bmapi.services.AuthService;
import com.bmapi.services.AuthServiceImpl;
import com.bmapi.services.ApiRequestService;
import com.bmapi.services.ApiRequestServiceImpl;
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
	@Path("/")
	@Produces(MediaType.TEXT_XML)
	public Response getApiStatusRequest() {
		AuthService authService = new AuthServiceImpl();
		Auth auth = authService.getAuth();
		return Response.status(Status.OK).entity(auth).build();
	}

	public static void main(String[] args) {

	}

}
