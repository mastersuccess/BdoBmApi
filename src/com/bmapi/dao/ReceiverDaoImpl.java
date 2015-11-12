package com.bmapi.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bmapi.jdbc.JdbcConnection;
import com.bmapi.model.Receiver;

public class ReceiverDaoImpl implements ReceiverDao {
	JdbcConnection jdbc;
	PreparedStatement preparedStatement;

	public ReceiverDaoImpl() {
		jdbc = new JdbcConnection();
	}
	public static void main(String[] args) {
		ReceiverDao dao = new ReceiverDaoImpl();
		Receiver r = dao.getReceiver("1508310003B001");
		System.out.println(r.getrId());
		System.out.println(r.getrFirstname());
	}
	@Override
	public Receiver getReceiver(String receiverId) {
		String query = "SELECT "
				+ "			r.id,"
				+ "			r.type,"
				+ "			r.fname,"
				+ "			SUBSTR(r.mdname,1,1),"
				+ "			r.lname, "
				+ " 		CASE"
				+ "				WHEN r.type = 2"
				+ "					THEN (SELECT name FROM corporate_receiver WHERE receiver = r.id) "
				+ " 			ELSE ''"
				+ "			END AS corporate_name,"
				+ "			CONCAT(address,'|',region,'|',country),"
				+ "			CASE "
				+ " 			WHEN r.mobile != ''"
				+ "					THEN replace(r.mobile,' ','')"
				+ "				ELSE replace(r.landline,' ','') "
				+ " 		END AS receiver_mobile,"
				+ "			CASE "
				+ "				WHEN bday != '0000-00-00' "
				+ "					THEN DATE(bday) "
				+ "				ELSE '' "
				+ "			END AS receiver_bday"
				+ "		FROM receiver r"
				+ "		WHERE r.id = ?";

		try {
			preparedStatement = jdbc.getConnection().prepareStatement(query);
			preparedStatement.setString(1, receiverId);
			ResultSet resultSet = preparedStatement.executeQuery();
			resultSet.next();
			
			Receiver receiver = new Receiver();
			receiver.setrId(resultSet.getString(1));
			receiver.setrFirstname(resultSet.getString(3));
			receiver.setrMiddleInitial(resultSet.getString(4));
			receiver.setrLastname(resultSet.getString(5));
			if (resultSet.getString(2).equals("2")) {
				receiver.setrFirstname(resultSet.getString(6));
				receiver.setrMiddleInitial("");
				receiver.setrLastname("");
			}
			receiver.setrAddress1(resultSet.getString(7));
			receiver.setrMobilePhone(resultSet.getString(8));
			receiver.setrReceiverBirthDate(resultSet.getString(9));
			
			resultSet.close();
			
			return receiver;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

}
