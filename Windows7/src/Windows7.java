

	import java.awt.*;
	import java.awt.Button;
	import java.awt.Frame;
	import java.awt.Label;
	import java.awt.TextField;
	import java.awt.event.ActionListener;

	public class Windows7 {
		public static void main (String xyz []) {
			Frame F = new Frame ("QA Consulting");
			
			TextField T1 = new TextField(10);
			TextField T2 = new TextField(10);
			TextField T3 = new TextField(10);
			TextField T4 = new TextField(10);
			Label L1 = new Label ("First Number");
			Label L2 = new Label ("Second Number");
			Label L3 = new Label ("Third Number");
			Label Error = new Label();
			
			
			
			Button B1 = new Button ("+");
			Button B2 = new Button ("-");
			Button B3 = new Button ("x");
			Button B4 = new Button ("/");
		
			
			FlowLayout Flow = new FlowLayout();
			F.setLayout(Flow);
			AddEventHandler Plus = new AddEventHandler (T1, T2, T3, Error);
			//SubEventHandler Sub = new SubEventHandler (T2, T3, T3, Error);
			
			
			B1.addActionListener(Plus);
			B2.addActionListener(Plus);
			B3.addActionListener(Plus);
			B4.addActionListener(Plus);
			//forgot to make the AL's for the other buttons
			
			F.add(L1);
			F.add(T1);
			F.add(L2);
			F.add(T2);
			F.add(B1);
			F.add(B2);
			F.add(B3);
			F.add(B4);
			F.add(L3);
			F.add(T3);
			F.add(Error);
			F.setSize(400, 400);
			F.setVisible(true);
		}
	}

