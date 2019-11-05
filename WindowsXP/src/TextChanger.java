import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextChanger implements ActionListener {
	
	public TextField textField;
	String text;

	public TextChanger(TextField textField, String text) {
		this.textField = textField;
		this.text = text;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		textField.setText(text);
	}

}
