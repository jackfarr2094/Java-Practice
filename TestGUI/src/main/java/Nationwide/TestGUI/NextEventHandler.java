package Nationwide.TestGUI;

import java.awt.event.ActionListener;

public class NextEventHandler implements ActionListener {
	TextField T1, T2, T3;
	ResultSet Res;
	
	public NextEventHandler (TextField A, TextField B, TextField C, ResultSet Res);
			T1 = A;
			T2 = B;
			T3; C;
			Res = R;

}

	public void ActionPerformed (ActionEvent x) {
	if (Res.next()) {
		T1.setText(Integer.ParseInt(Res.getInt(1)));
		T2.setText(Integer.ParseInt(Res.getInt(1)));
		T3.setText(Integer.ParseInt(Res.getInt(1)));
		Res.setText(Integer.ParseInt(Res.getInt(1)));
		}
	}