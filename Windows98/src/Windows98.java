import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;

public class Windows98 {
	public static void main (String xyz[]) {
	Frame F = new Frame();
	TextField T1 = new TextField(10);
	TextField T2 = new TextField(10);
	TextField T3 = new TextField();
	Label L1 = new Label("First Number");
	Label L2 = new Label ("Second Number");
	Label L3 = new Label ("Result");
	Label L4 = new Label ("Operation");
	JRadioButton B1 = new JRadioButton("+");
	JRadioButton B2 = new JRadioButton("-");
	JRadioButton B3 = new JRadioButton("x");
	JRadioButton B4 = new JRadioButton("/");
	F.setLayout(new GridLayout(12, 12));
	
	B1.addActionListener(
		new ActionListener() {
		public void actionPerformed(ActionEvent x) {
			int a, b, c;
			JRadioButton jbtn;
		
			jbtn = (JRadioButton)x.getSource();
			String sign = jbtn.getLabel();
			a = Integer.parseInt(T1.getText());
			b = Integer.parseInt(T2.getText());
			
			if(sign.equals("+")) {
				c = a+b;
				T3.setText(Integer.toString(c));
			}
		}
		}
		);
	
	NewAddEventHandler Plus = new NewAddEventHandler (T1, T2, T3, L3);

	F.add(T1);
	F.add(T2);
	F.add(B1);
	F.add(B2);
	F.add(B3);
	F.add(B4);
	F.add(T3);
	F.add(L1);
	F.add(L2);
	F.add(L3);
	F.add(L4);
	
	B2.addActionListener(
		new ActionListener() {
			public void actionPerformed(ActionEvent x) {
				int a, b, c;
				JRadioButton jbtn;
			
				jbtn = (JRadioButton)x.getSource();
				String sign = jbtn.getLabel();
				a = Integer.parseInt(T1.getText());
				b = Integer.parseInt(T2.getText());
				
				if(sign.equals("-")) {
					c = a-b;
					T3.setText(Integer.toString(c));
				}
			}
			}
			);
	
	B3.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent x) {
					int a, b, c;
					JRadioButton jbtn;
				
					jbtn = (JRadioButton)x.getSource();
					String sign = jbtn.getLabel();
					a = Integer.parseInt(T1.getText());
					b = Integer.parseInt(T2.getText());
					
					if(sign.equals("x")) {
						c = a*b;
						T3.setText(Integer.toString(c));
					}
				}
				}
		);
	
	B4.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent x) {
					int a, b, c;
					JRadioButton jbtn;
				
					jbtn = (JRadioButton)x.getSource();
					String sign = jbtn.getLabel();
					a = Integer.parseInt(T1.getText());
					b = Integer.parseInt(T2.getText());
					
					if(sign.equals("/")) {
						c = a/b;
						T3.setText(Integer.toString(c));
					}
					else
						T3.setText("Something went wrong");
				}
				}
				);
	
	F.add(T1, BorderLayout.NORTH);
	F.add(L1, BorderLayout.NORTH);
	F.add(T2, BorderLayout.NORTH);
	F.add(L2, BorderLayout.NORTH);
	F.add(B1, BorderLayout.CENTER);
	F.add(B2, BorderLayout.CENTER);
	F.add(B3, BorderLayout.CENTER);
	F.add(B4, BorderLayout.CENTER);
	F.add(L4, BorderLayout.SOUTH);
	F.add(L3, BorderLayout.SOUTH);
	F.add(T3, BorderLayout.SOUTH);
	F.setSize(400, 400);
	F.setVisible(true);
			
	}
}
