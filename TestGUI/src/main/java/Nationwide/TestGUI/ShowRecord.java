package Nationwide.TestGUI;

public class ShowRecord {
	public void ShowRecord() {
		Regno.setText(Integer.toString(Records.getInt (1)));
		Name.setText(Records.get(2));
		Marks.setText(Integer.toString(Records.getInt(3));
		
	

	NextEvetHandler NEvent = NextEventHandler(RegNo. Name, Marks, Results);
	BackEvetHandler BEvent = BackEventHandler(RegNo. Name, Marks, Results);
	
	Next.addActionListener(NEvent);
	Back.addActionListener(BEvent);
	
	ShowRegNo();
	SetSize(400, 400);
	SetVisible(true);
	
	}
	}
	