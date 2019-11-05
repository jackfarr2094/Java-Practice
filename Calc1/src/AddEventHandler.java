import java.awt.*;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddEventHandler implements ActionListener {
	
	TextField screen;
	int a = 0;
	int b = 0; 
	int c = 0; 
	String Operator = "";
	
	

	public AddEventHandler(TextField s) {
				screen = s; 
	}
	


	@Override
	public void actionPerformed(ActionEvent ae) {
		
			Button btn; {
		
			btn = (Button)ae.getSource();
			String sign = btn.getLabel();
			
				
			if(sign.equals("0")) {
				screen.setText(screen.getText() + sign); 
				
			}
			else if(sign.equals("1")) {
				screen.setText(screen.getText() + sign);
				
			}
			else if(sign.equals("2")) {
				screen.setText(screen.getText() + sign);
				
			}
			else if(sign.equals("3")) {
				screen.setText(screen.getText() + sign);
				
			}
			else if(sign.equals("4")) {
				screen.setText(screen.getText() +sign );
				
			}
			else if(sign.equals("5")) {
				screen.setText(screen.getText() + sign);
				
			}
			else if(sign.equals("6")) {
				screen.setText(screen.getText() + sign);
				
			}
			else if(sign.equals("7")) {
				screen.setText(screen.getText() + sign);
				
			}
			else if(sign.equals("8")) {
				screen.setText(screen.getText() + sign);
				
			}
			else if(sign.equals("9")) {
				screen.setText(screen.getText() + sign);	
			}
			else if(sign.equals("+")) {
					a = Integer.parseInt(screen.getText());
					screen.setText("");	
					Operator ="+";
					
			}
			else if(sign.equals("+")) {
				a = Integer.parseInt(screen.getText());
				screen.setText("");	
				Operator ="+";
				
		}
			else if(sign.equals("/")) {
				screen.setText(screen.getText() + sign);	
			}
			else if(sign.equals("*")) {
				screen.setText(screen.getText() + sign);	
			}
			else if(sign.equals("=")) {
				
				if(Operator.equals("+")) {
				
				b = Integer.parseInt(screen.getText());	
				screen.setText("");	
				c = a + b;
				screen.setText(Integer.toString(c));
				}
				if(Operator.equals("-")) {
					
					b = Integer.parseInt(screen.getText());	
					screen.setText("");	
					c = a - b;
					screen.setText(Integer.toString(c));
					}
				
				
			}
			else if(sign.equals("c")) {
				screen.setText(screen.getText() + sign);	
			}
	}
	}
}
			
	
					
				
				
			
		