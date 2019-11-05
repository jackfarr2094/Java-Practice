
public class Exception2 {
		public static void main (String x []) {
			int Result;
			
			try {
				Result = 4/0;
				System.out.println("Result:" + Result);
			}
			catch (ArithmeticException E) {
				System.out.println("Why are you trying to divide by zero my friend?");
			}
		}
}




