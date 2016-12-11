package com.niit.Login.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.niit.DBConnection.DBConnection;

public class UserDao 
{
	
	
	private Connection con;
	private PreparedStatement pStatement;
	private ResultSet resultSet;

	public boolean isValidUser(String userID,String password)
		{
			con =DBConnection.getDBConnection();
			String query="select * from luser  where id =? and password=?";
			
			try
			{
				
pStatement=con.prepareStatement(query);			
pStatement.setString(1, userID);	
pStatement.setString(2, password);
		
		resultSet= pStatement.executeQuery();
		
		if(resultSet.next())
		{
			return true;
		}
	}
		
			catch(SQLException e)
		{
			e.printStackTrace();
		}
			return false;
		
		
		
		
		}

}
