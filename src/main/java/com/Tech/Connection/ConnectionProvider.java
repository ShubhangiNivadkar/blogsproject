package com.Tech.Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	private static Connection con;
	public static Connection getConnection()
	{
		try {
			if(con==null)
			{
				//driver class Load
				Class.forName("com.mysql.jdbc.Driver");
				//create a connection
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techblogs","root","root");
			}
		} catch (Exception e) {
				e.printStackTrace();
		}
		return con;
		
	}

}
