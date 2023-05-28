package com.mini.groupP;

<<<<<<< HEAD

=======
>>>>>>> main
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
<<<<<<< HEAD
	Class.forName("com.mysql.jdbc.Driver");
=======
	Class.forName("com.mysql.cj.jdbc.Driver");
>>>>>>> main
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
		try {
<<<<<<< HEAD
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce?characterEncoding=utf8","root","root");
=======
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","Shree@6517");
>>>>>>> main
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
<<<<<<< HEAD
	}
	
	
=======
	

// new method to add
	
	}
	
	

>>>>>>> main
