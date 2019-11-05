
public class NationwideAccountMain {
	public static void main (String x []) {
		NationwideAccounts ref = new NationwideAccounts();
				try {
					ref.NetSalary(2000, 5);
					}
					catch (AbsenteesException E1) {
					System.out.println("Too many absentees");
					}
		} 
}
