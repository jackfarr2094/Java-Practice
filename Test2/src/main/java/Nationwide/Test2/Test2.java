package Nationwide.Test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test2 {
	
	public static void main (String args[]) {
	
	{
	
	try {
		System.out.println("Attempted");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/schools?serverTimezone=GMT", "root", "root");
		Statement s = c.createStatement();
		
	ResultSet Rs = s.executeQuery("select * from school");
	
	while (Rs.next()) {
		System.out.println(Rs.getInt(1));
		System.out.println(Rs.getString(2));
		System.out.println(Rs.getInt(3));
		}
	}
	catch (Exception e) {
		System.out.println("Error");
		}
	}
	}
}


