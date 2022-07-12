package com.java.registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.java.registration.model.Employee;

public class EmployeeDao {
	public int registerEmployee(Employee employee)throws ClassNotFoundException{
		String INSERT_USERS_SQL = "INSERT INTO empl" +
	      "(first_name, last_name, username, password, address, contact) VALUES " +
		    "(?, ?, ?, ?, ?, ?);";
		
		int result = 0;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		try (Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/emp?useSSL=false", "root", "admin");
				
		// Step 2: Create a statement using connection object
		PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)){
			//preparedStatement.setInt(1, 3);
			preparedStatement.setString(1, employee.getFirstName());
			preparedStatement.setString(2, employee.getLastName());
			preparedStatement.setString(3, employee.getUsername());
			preparedStatement.setString(4, employee.getPassword());
			preparedStatement.setString(5, employee.getAddress());
			preparedStatement.setString(6, employee.getContact());
			
			System.out.println(preparedStatement);
			
		// Step 3: Execute the query or update query
			result = preparedStatement.executeUpdate();
			
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
				
	}

}
