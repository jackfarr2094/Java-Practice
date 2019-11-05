package Nationwide.School;

	
	import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.Statement;


	public class School implements ActionListener {
		Connection c;
		Statement s;
		TextField RegNo;
		TextField Name;
		TextField Marks;
	
		public static void main (TextField T1, TextField T2, TextField T3) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection c = DriverManager.getConnection("jdbc:mysql://localhost/schools?serverTimezone=GMT", "root", "root");
				Statement s = c.createStatement();
				RegNo = T1;
				Name = T2;
				Marks = T3;
				s.executeUpdate("insert into to school values '45, Peter, 78';");
			}
				catch(Exception e) {
					System.out.println(e);
				}
			}

		public void actionPerformed(ActionEvent ae) {
				try {
					System.out.println("insert into to school values '45, Peter, 78';");
				}
				catch (Exception e) {
					System.out.println("Error my friend");
			}
			}		
		}



