package Nationwide.ConnectToMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class ConnectToMySQL {
	public static void main (String xyz []) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/nationwide?serverTimezone=GMT", "root", "root");
			Statement s = c.createStatement();
			s.executeUpdate("insert into tdp values('Jack')");
		}
			catch(Exception e) {
				System.out.println(e);
			}
		}
}

