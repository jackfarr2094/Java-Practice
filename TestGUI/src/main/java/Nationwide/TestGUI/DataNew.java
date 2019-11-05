package Nationwide.TestGUI;
import java.awt.*;

public class DataNew extends Frame {
	TextField RegNo, Name, Marks;
	ResultsSet Records;
	Label L1, L2, L3;
	Button Back, Next;
	
	public DataNew() {
		RegNo = new TextField();
		Name = new TextField();
		Marks = new TextField();
		L1 = new Label ("RegNo");
		L2 = new Label ("Name");
		L3 = new Label ("Marks");
		Back = new Button ("Back");
		Next = new Button ("Next");
		
		GridLayout Grid = new GridLayout(4,4);
		SetLayout(Grid);
		add(new Label);
		add(L1);
		add (RegNo);
		add(new Label());
		add (L2);
		add (Name);
		add new (Label ());
		
		add(new Label());
		add(L3);
		add(Marks);
		add(new Label());
		add(Back);
		add(new Label());
		add(new Label());
		add(Next);
	}

}
