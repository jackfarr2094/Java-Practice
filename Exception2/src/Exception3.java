
public class Exception3 {
	public static void main(String xyz[]) { 
		String No1, No2;
	float Result;
	No1 = "56";
	No2 = "Hello";
	
	try {
		Result = Integer.parseInt(No1)/Integer.parseInt(No2);
		System.out.println("Result:" + Result);
	}
	catch (ArithmeticException E) {
		System.out.println("I already told you not to divide by zero my friend");
	}
	catch (NumberFormatException E) {
		System.out.println("You're meant to put digits here my friend");
	}
	catch (Exception E) {
		System.out.println("Something went wrong");
		}
	}
}
