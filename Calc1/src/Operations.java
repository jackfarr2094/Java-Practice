import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Operations implements ActionListener {
	TextField screen;
	
	public Operations (TextField s) {
		screen s;
		int Result;
	}

	public void ActionPerformed(ActionEvent A) {
		Button btn = (Button) A.getSource();
			String what = btn.getLabel();
			if (what.equals("c")); {
				screen.setText(" ");
			}
			 if(what.equals("+")) {
				 screen.setText("+");
				
			} else if (what.equals("-"))	{
				screen.setText("-");
					
				} else if(what.equals("x")) {
					screen.setText("*");
						
					} else if(what.equals("/")) {
						screen.setText("/");
						}

				}
				
				if(sign.equals ("+")) {
					Result = First+Integer.parseInt(screen.getText());
				}
				if(sign.equals ("-")) {
					Result = First-Integer.parseInt(screen.getText());
				}
				if(sign.equals ("x")) {
					Result = First*Integer.parseInt(screen.getText());
				}
				if (sign.equals ("/")); {
					Result = First/Integer.parseInt(screen.getText());
								}
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
				}
					screen.setText(Integer.toString(Result));
				}

			else {
				First = Integer.parseInt(screen.getText());
				Sign = btn.getLabel();
				screen.setText("");
			}
