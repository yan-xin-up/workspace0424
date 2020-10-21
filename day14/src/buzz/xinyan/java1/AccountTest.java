package buzz.xinyan.java1;

public class AccountTest {
	public static void main(String[] args) {
		
		Account acc1 = new Account();
		Account acc2 = new Account("*#06#", 999);
		Account acc3 = new Account("qwerty", 999);
		
		Account.setInterestRate(0.012);
		Account.setMinMoney(11);
		
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(acc3);
		
		System.out.println(acc1.getInterestRate());
		System.out.println(acc3.getMinMoney());
	}
}
