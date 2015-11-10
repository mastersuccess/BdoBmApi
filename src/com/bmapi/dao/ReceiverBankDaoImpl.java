package com.bmapi.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bmapi.jdbc.JdbcConnection;
import com.bmapi.model.ReceiverBank;

public class ReceiverBankDaoImpl implements ReceiverBankDao {
	JdbcConnection jdbc;
	PreparedStatement preparedStatement;

	@Override
	public ReceiverBank getReceiverBank(String id,String receiver_id) {
		String query = "SELECT id,branch,account_no FROM bank_receiver WHERE id = ? AND receiver = ?";
		try {
			preparedStatement = jdbc.getConnection().prepareStatement(query);
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, receiver_id);
			ResultSet resultSet = preparedStatement.executeQuery();
			resultSet.next();
			
			ReceiverBank receiverBank = new ReceiverBank(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3));
			return receiverBank;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	public ReceiverBankDaoImpl() {
		jdbc = new JdbcConnection();
	}

}
