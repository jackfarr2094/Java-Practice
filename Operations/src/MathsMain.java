import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MathsMain {
	public static void main (String x []) {
		Frame F = new Frame();
		Button B1, B2, B3, B4;
		B1 = new Button ("Addition");
		B2 = new Button ("Subtraction");
		B3 = new Button ("Multiplication");
		B4 = new Button ("Division");
		
		Operations opt = new Operations();
		B1.addActionListener(
			new ActionListener() {
					public void actionPerformed(ActionEvent x) {
						opt.F.setTitle("Addition");
						opt.B.setLabel("Addition");
						opt.F.setVisible(true);		
					}

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
					}
				}
	);
		B2.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent x) {
							opt.F.setTitle("Subtraction");
							opt.B.setLabel("Subtraction");
							opt.F.setVisible(true);	
						}
				}
				);
		B3.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent x) {
							opt.F.setTitle("Multiplication");
							opt.B.setLabel("Multiplication");
							opt.F.setVisible(true);	
						}
				}
				);
		B4.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent x) {
							opt.F.setTitle("Division");
							opt.B.setLabel("Division");
							opt.F.setVisible(true);	
						}
				}
				);
		F.setSize(400, 400);
		F.setVisible(true);
	}
}
