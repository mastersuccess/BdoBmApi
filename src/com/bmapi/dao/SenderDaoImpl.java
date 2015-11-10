package com.bmapi.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bmapi.jdbc.JdbcConnection;
import com.bmapi.model.Sender;

public class SenderDaoImpl implements SenderDao {
	JdbcConnection jdbc;
	PreparedStatement preparedStatement;

	public SenderDaoImpl() {
		jdbc = new JdbcConnection();
	}

	@Override
	public Sender getSender(String sender_id) {
		String query = "SELECT "
				+ "			`code`,"
				+ "			type,"
				+ "			fname,"
				+ "			SUBSTR(mdname,1,1),"
				+ "			lname,"
				+ "			CASE "
				+ " 			WHEN `type` = 2"
				+ "					THEN (SELECT employer FROM occupation WHERE sender = `code`)"
				+ "				ELSE ''  "
				+ " 		END AS corporate_name, "
				+ " 		(SELECT CONCAT(address,'|',suburb,'|',state,'|',sender.country)  FROM address WHERE sender = `code` ORDER BY id DESC LIMIT 1), "
				+ " 		CASE"
				+ "				WHEN sender.landline != ''"
				+ "					THEN sender.landline"
				+ "				ELSE sender.mobile "
				+ " 		END AS sender_phone_no"
				+ "		FROM sender "
				+ "		WHERE sender.code = ?";
		try {
			preparedStatement = jdbc.getConnection().prepareStatement(query);
			preparedStatement.setString(1, sender_id);
			ResultSet resultSet = preparedStatement.executeQuery();
			Sender retrievedSender = new Sender();
			while(resultSet.next()){
				retrievedSender.setrId(resultSet.getString(1));
				retrievedSender.setrFirstname(resultSet.getString(3));
				retrievedSender.setrMiddleInitial(resultSet.getString(4));
				retrievedSender.setrLastname(resultSet.getString(5));
				if (resultSet.getString(2) == "2") {
					retrievedSender.setrFirstname(resultSet.getString(6));
					retrievedSender.setrMiddleInitial("");
					retrievedSender.setrLastname("");
				}
				retrievedSender.setrAddress1(resultSet.getString(7));
				retrievedSender.setrPhoneNo(resultSet.getString(8));
				break;
			}
			return retrievedSender;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

}
