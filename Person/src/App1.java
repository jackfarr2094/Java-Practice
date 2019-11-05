
public class App1 {
	public static void main (String xyz []) {
		Greeting g = new Greeting ();
		g.Greeting(new Friend());
		Person friend = new Friend();
		Person enemy = new Enemy();
		g.Greeting (friend); //calls the friend interface again
		g.Greeting (enemy); //calls the enemy interface again
	}
}
