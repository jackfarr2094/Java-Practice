
public class TestBank {
	public static void main(String xyz []) {
		Bank HSBC, Barclays, NBS;
		
		HSBC = new Bank();
		Barclays = new Bank();
		NBS = new Bank();
		Bank.Dollar = 100;
		HSBC.Amount(2);
		NBS.Amount(3);
		//Barclays.setDollar;
		HSBC.Amount(2);
		NBS.setDollar(300);
		Barclays.Amount(2);
	}
}
