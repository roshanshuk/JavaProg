package com.java.jdbc;
import java.sql.*;
public class Insert_Demo {
	public static void main(String args[])
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			PreparedStatement st = con.prepareStatement("insert into emp (ID, NAME, AGE) values (?,?,?)");
			st.setInt(1, 12);
			st.setString(2, "radhey");
			st.setInt(3, 14);
			
			int i = st.executeUpdate();
			if(i>0) {
				System.out.println("YOur query is inserted successfully");
			}else {
				System.out.println("NOt inserted!!!");
			}
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
