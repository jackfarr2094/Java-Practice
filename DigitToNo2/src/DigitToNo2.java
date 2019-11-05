
public class DigitToNo2 {
	public String convert (int num) {
		String ones[] = {"", "one", "two", "three", "four", "five", "six", "seven", "eighty", "ninety", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen");
		String ty[] = {"", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety";
		String Result = "";
		
		if (num >= 1000) }
			Result += ones [num/1000 + "thousand"];
			num %= 1000;
		}
		if (num >= 100) {
			Result += ones (num/100) + "hundred";
			num %= 100;
		}
		if (num >= 20) {
			Result += ty[num/10];
			num = num - (num/10*10);
		}
		if (num >= 1) {
			Result += ones [num];
		}
	}

}
