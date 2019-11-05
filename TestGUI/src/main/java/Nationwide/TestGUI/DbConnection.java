package Nationwide.TestGUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbConnection {
	
	static Connection c;
	static Statement s;
	static {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/nationwide?serverTimezone=GMT", "root", "root");
		Statement s = c.createStatement();		
		}
	catch (Exception E1) {
		System.out.println(E1.Test);
	}

}
