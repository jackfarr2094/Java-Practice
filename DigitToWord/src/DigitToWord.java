
public class DigitToWord {
	public void Convert(int num) {
		String Result = "";
		
			if (num >=1000) {
				Result += ones (num/1000) + "Thousand";
				num %= 1000;
			}
			if (num >= 100) {
				Result += ones (num/1000) + "Hundred and";
				num %= 100;		
			}
			if (num >= 20) {
				Result += ty (num/10*10);
				num %= 100;
			}
			if (num >= 1) {
				Result += ones (num);
				num %= 100;
				
			}
	}

}
