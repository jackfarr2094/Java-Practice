import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calc1 {
	public static void main (String [] xyz) {
		Frame F = new Frame ("Calculator1");
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		GridLayout gl = new GridLayout(4,4); //you forgot this bit
		p2.setLayout(gl);
		
		Button B1, B2, B3, B4, B5, B6, B7, B8, B9, B0;
		Button add, sub, div, clear, equals;
		TextField screen = new TextField (20);
		
		B0 = new Button ("0");
		B1 = new Button ("1");
		B2 = new Button ("2");
		B3 = new Button ("3");
		B4 = new Button ("4");
		B5 = new Button ("5");
		B6 = new Button ("6");
		B7 = new Button ("7");
		B8 = new Button ("8");
		B9 = new Button ("9");
		equals = new Button ("=");
		add = new Button ("+");
		sub = new Button ("-");
		div = new Button ("/");
		clear = new Button ("c");
		
		AddEventHandler Plus = new AddEventHandler(screen);
		
		B0.addActionListener(Plus);
		B1.addActionListener(Plus);
		B2.addActionListener(Plus);
		B3.addActionListener(Plus);
		B4.addActionListener(Plus);
		B5.addActionListener(Plus);
		B6.addActionListener(Plus);
		B7.addActionListener(Plus);
		B8.addActionListener(Plus);
		B9.addActionListener(Plus);
		equals.addActionListener(Plus);
		add.addActionListener(Plus);
		sub.addActionListener(Plus);
		div.addActionListener(Plus);
		clear.addActionListener(Plus);
		
		p1.add(screen);
		p2.add(B0);
		p2.add(B1);
		p2.add(B2);
		p2.add(B3);
		p2.add(B4);
		p2.add(B5);
		p2.add(B6);
		p2.add(B7);
		p2.add(B8);
		p2.add(B9);
		p2.add(equals);
		p2.add(sub);
		p2.add(add);
		p2.add(div);
		p2.add(clear);
		
		F.add(p1, BorderLayout.NORTH);
		F.add(p2, BorderLayout.CENTER);
		F.setSize(400, 400);
		F.setVisible(true);
		}
}
