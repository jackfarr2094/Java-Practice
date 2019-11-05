
public class StaticTestMain {
	public static void main (String [] args) {
	StaticTest Ref2 = new StaticTest();
	StaticTest Ref = new StaticTest();
	
		Ref.a = 15;
		StaticTest.Boom();
	}
}
