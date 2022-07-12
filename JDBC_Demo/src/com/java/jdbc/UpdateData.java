package com.java.jdbc;

import java.sql.*;

public class UpdateData {

	public static void main(String args[])
	{
	    String jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe";
	    String username = "system";
	    String password = "system";
	 
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(jdbcURL, username, password);
		Statement st = con.createStatement();
		
		String sql = "update emp" + " set NAME='ramu' where AGE=32";
		int i = st.executeUpdate(sql);
		if(i > 0)
		{
			System.out.println("data has been successfully updated !!!");
		}
		con.close();
	}catch(Exception e)
		{
		e.printStackTrace();
		}
    }
}	
	
