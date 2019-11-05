
public class QAConsulting2 {
	public static void main (String xyz[]) {
		int numbers[]= {15, 36, 42, 91, 48};
			int i;
			int maxvalue = numbers[0];
			for(i = 0; i< numbers.length; i++)
					if(numbers[i]> maxvalue) {
						maxvalue = numbers[i];
					}	
	System.out.println(maxvalue);
}
}
