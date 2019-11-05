package Nationwide.School;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class SchoolGUI {
	public static void main (String xyz []) {
		Frame F = new Frame ("School Table");
		Panel p1 = new Panel();
		//Panel p2 = new Panel();
		GridLayout gl = new GridLayout(4, 2);
		p1.setLayout(gl);

		TextField T1 = new TextField(10);
		TextField T2 = new TextField(10);
		TextField T3 = new TextField(10);
		Button B1 = new Button ("Save");
		Label L1 = new Label ("RegNo");
		Label L2 = new Label ("Marks");
		Label L3 = new Label ("Name");
		Label L4 = new Label ("");
		
		InputHandler Plus = new InputHandler (T1, T2, T3);
		
		B1.addActionListener(Plus);
	
		p1.add(L1);
		p1.add(T1);
		p1.add(L2);
		p1.add(T2);
		p1.add(L3);
		p1.add(T3);
		p1.add(L4);
		p1.add(B1);
		
		F.add(p1,BorderLayout.CENTER);
		
		F.setSize(400, 400);
		F.setVisible(true);
		}
	}


