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
	TextField Txt4;
	TextField Txt5;
	Label error;
	

	public AddEventHandler (TextField T1, TextField T2, TextField T3, TextField T4, TextField T5, Label E) {
			Txt1 = T1; 
			Txt2 = T2; 
			Txt3 = T3;
			Txt4 = T4;
			Txt5 = T5;
			error = E; 
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		int a, b, c;
			Button btn;
		
			btn = (Button)ae.getSource();
			String sign = btn.getLabel();
			a = Integer.parseInt(Txt1.getText());
			b = Integer.parseInt(Txt2.getText());
			
			if(sign.equals("+")) {
				c = a+b;
				Txt3.setText(Integer.toString(c));
			} else if(sign.equals("-"))
				 {
					c = a-b;
					Txt3.setText(Integer.toString(c));
				} else if(sign.equals("x")) {
						c = a*b;
						Txt3.setText(Integer.toString(c));
					} else if(sign.equals("/")) {
						 
							c = a/b;
							Txt3.setText(Integer.toString(c));
							
						}
					else
						Txt3.setText("Something went wrong");
				}
	
}
//else and if on the same line in the same bracket
	
					
				
				
			
		