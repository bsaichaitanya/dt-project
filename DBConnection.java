package com.niit.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	

		private static String userName="sa";
		private static String password="12345";
		private static String url="jdbc:h2:tcp://localhost/~/test";
		private static String driver="org.h2.Driver";
		private static Connection connection=null;
		private DBConnection()
		{}
			public static Connection getDBConnection()
			{ 
				try
				{
				Class.forName(driver);
				connection=DriverManager.getConnection(url,userName,password);
				}
				catch(ClassNotFoundException |SQLException e)
				{
					e.printStackTrace();
				}
				return connection;
			}
			public static void main(String args[]) 
			
			{
				if(getDBConnection()== null)
{
	System.out.println("could not establish the connection");
}
else
{
	System.out.println("connection established sucessfully");
}
}
}			
		
		