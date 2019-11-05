
class Accounts {
	public void Tax () {
		System.out.println("Tax Rate:" +21);
		}
	
	
	public void Tax(int Salary) {
		float T = (float) Salary*21/100;
			System.out.println("Your Tax is:" + T);
			}
	public void Tax(int Sal, int Rate) {
		float T = (float) Sal * Rate/100;
		System.out.println("Your Tax is:" + T);
				}
	