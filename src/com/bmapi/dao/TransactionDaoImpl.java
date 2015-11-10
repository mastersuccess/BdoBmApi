package com.bmapi.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bmapi.jdbc.JdbcConnection;
import com.bmapi.model.Transaction;

public class TransactionDaoImpl implements TransactionDao {
	JdbcConnection jdbc;
	PreparedStatement preparedStatement;

	public TransactionDaoImpl() {
		jdbc = new JdbcConnection();
	}

	@Override
	public Transaction getTransaction(String id) {
		String query = "SELECT "
				+ "			id,"
				+ "			code,"
				+ "			account,"
				+ "			type_of_transaction,"
				+ "			type,"
				+ "			exchange_rate,"
				+ "			DATE(date_time),"
				+ "			sender,"
				+ "			receiver,"
				+ "			amt_in,"
				+ "			purpose,"
				+ "			special_instruction,"
				+ "			service_charge,"
				+ "			courier,"
				+ "			other_details "
				+ "		FROM transaction "
				+ "		WHERE id = ? ";
			
		try{
			preparedStatement = jdbc.getConnection().prepareStatement(query);
			preparedStatement.setString(1,id);
			ResultSet rs = preparedStatement.executeQuery();
			Transaction transaction = new Transaction();
			while(rs.next()){
				transaction.setId(rs.getString(1));
				transaction.setCode(rs.getString(2));
				transaction.setAccount(rs.getString(3));
				transaction.setType_of_transaction(rs.getString(4));
				transaction.setType(rs.getString(5));
				transaction.setExchange_rate(rs.getDouble(6));
				transaction.setDate_time(rs.getString(7));
				transaction.setSender(rs.getString(8));
				transaction.setReceiver(rs.getString(9));
				transaction.setAmt_in(rs.getDouble(10));
				transaction.setAmt_out(transaction.getAmt_in()*transaction.getExchange_rate());
				transaction.setPurpose(rs.getString(11));
				transaction.setSpecial_instruction(rs.getString(12));
				transaction.setService_charge(rs.getString(13));
				transaction.setCourier(rs.getString(14));
				transaction.setOther_details(rs.getString(15));
				break;
			}
			return transaction;
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return null;
		
	}

	
}
