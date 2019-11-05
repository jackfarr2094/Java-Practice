package Nationwide.School;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ActionPerformed {
	
	TextField Txt1;
	TextField Txt2;
	TextField Txt3;
	
	public void AddEventHandler(TextField T1, TextField T2, TextField T3) {
	
	Txt1 = T1;
	Txt2 = T2;
	Txt3 = T3;
	}
	
	public void actionPerformed(ActionEvent ae) {
	
	String RegNo = T1.getText();
	String Name = T2.getText();
	String Marks = T3.getText();

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/schools?serverTimezone=GMT", "root", "root");
		Statement s = c.createStatement();
		
		s.executeUpdate("insert into to school values '45, Peter, 78';");
	}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
