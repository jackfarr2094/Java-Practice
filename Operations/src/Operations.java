import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Operations {
	
}

	public Operations() {
		Frame F;
		Button B;
		TextField T1;
		TextField T2;
		TextField T3; 
		F = new Frame();
		B = new Button();
		T1 = new TextField();
		T2 = new TextField();
		T3 = new TextField();
		int Result;
		F.setLayout(new GridLayout(4, 2));
		
		F.add(new Label("First No."));
		F.add(T1);
		F.add(new Label ("Second No."));
		F.add(T2);
		F.add(new Label());
		F.add(B);
		F.add(new Label("Result"));
		F.add(T3);
		
		B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent x) {
				int No1 = Integer.parseInt(T1.getText ());
				int No2 = Integer.parseInt(T2.getText ());
				String sign = B.getLabel();
				if (sign.contentEquals("Addition")) {
					Result = No1+No2;
				}
			
				B.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent x) {
						int No1 = Integer.parseInt(T1.getText ());
						int No2 = Integer.parseInt(T2.getText ());
						String sign = B.getLabel();
						if (sign.contentEquals("Subtraction")) {
							Result = No1-No2;
						}
				
				B.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent x) {
						int No1 = Integer.parseInt(T1.getText ());
						int No2 = Integer.parseInt(T2.getText ());
						String sign = B.getLabel();
						if (sign.contentEquals("Multiplication")) {
							Result = No1*No2;
						}
				
							B.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent x) {
										int No1 = Integer.parseInt(T1.getText());
										int No2 = Integer.parseInt(T2.getText());
										String sign = B.getLabel();
										if (sign.contentEquals("Division")) {
											Result = No1/No2;
										}
									}
					F.setSize(400, 400);
					F.setVisible(true);
					}
					}
					
				
				
				
					
				
