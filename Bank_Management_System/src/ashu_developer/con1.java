package ashu_developer;
import java.sql.*;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.Statement;

public class con1 {
	Connection con;
	Statement s;
	
	public con1() {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		 con =DriverManager.getConnection("jdbc:mysql://localhost:3308/bank" ,"root","root");
		s= con.createStatement();
	
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}