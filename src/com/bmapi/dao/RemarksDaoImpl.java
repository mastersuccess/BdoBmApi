package com.bmapi.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.bmapi.jdbc.JdbcConnection;

public class RemarksDaoImpl implements RemarksDao {
	JdbcConnection jdbc;
	PreparedStatement preparedStatement;
	ResourceBundle account;

	public RemarksDaoImpl() {
		jdbc = new JdbcConnection();
		account = ResourceBundle.getBundle("com.bmapi.dao.account");
	}

	@Override
	public int createRemark(String transaction_id, String status) {
		String query = "INSERT INTO transaction_remarks(transaction,account,date_time,type,details)VALUES(?,?,NOW(),?,?)";
		try {
			preparedStatement = jdbc.getConnection().prepareStatement(query);
			preparedStatement.setString(1, transaction_id);
			preparedStatement.setString(2, account.getString("account.id"));
			preparedStatement.setString(3, "1");
			preparedStatement.setString(4, status);
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public int createLog(String transaction_id, String status) {
		String task = "TRANSACTION WITH TRX NO [ "+transaction_id+" ] SET TO "+status;
		String query = "INSERT INTO logs(account,role,datetime,type_of_task,task,account_name) VALUES(?,?,NOW(),?,?,?)";
		try {
			preparedStatement = jdbc.getConnection().prepareStatement(query);
			preparedStatement.setString(1, this.account.getString("account.id"));
			preparedStatement.setString(2, this.account.getString("account.role"));
			preparedStatement.setString(3, "6");
			preparedStatement.setString(4, task);
			preparedStatement.setString(5, this.account.getString("account.name"));
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 0;
	}
}
