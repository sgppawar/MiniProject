package com.mini.groupP;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Connections {
	 
	public static Connection connection() 
	{
		Connection con=null;
try {
	Class.forName("com.mysql.jdbc.Driver");
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
		try {
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce?characterEncoding=utf8","root","root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	}
	
	
