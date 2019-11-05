package Nationwide.School;

import java.awt.*;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddEventHandler implements ActionListener {
	
	
	TextField Txt1; 
	TextField Txt2; 
	TextField Txt3;
	Button B1;
	String RegNo;
	String Name;
	String Marks;
	

	public AddEventHandler (TextField T1, TextField T2, TextField T3, Button B) {
			Txt1 = T1; 
			Txt2 = T2; 
			Txt3 = T3; 
			B1 = B;
	
			System.out.println("insert into to school values 'RegNo', 'Name', 'Marks'");
			
	}


	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
//else and if on the same line in the same bracket
	
					
				
				
			
		