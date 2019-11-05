package Nationwide.School;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InputHandler implements ActionListener {

	

		
		TextField Txt1;
		TextField Txt2;
		TextField Txt3;
		
		public InputHandler (TextField T1, TextField T2, TextField T3) {
		
		Txt1 = T1;
		Txt2 = T2;
		Txt3 = T3;
		}
		
		public void actionPerformed(ActionEvent ae) {
		
		int RegNo = Integer.parseInt(Txt1.getText());
		String Name = Txt2.getText();
		int Marks = Integer.parseInt(Txt3.getText());

		try {
			System.out.println("Attempted");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/schools?serverTimezone=GMT", "root", "root");
			Statement s = c.createStatement();
			
			s.executeUpdate("insert into to school values ("+RegNo+",'"+  Name+"',"+Marks+")");
			
		}
			catch(Exception e) {
				System.out.println(e);
			}
		}

	}


