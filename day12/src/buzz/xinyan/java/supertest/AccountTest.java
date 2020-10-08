package buzz.xinyan.java.supertest;

public class AccountTest {
	public static void main(String[] args) {
		Account  A = new Account(1122, 20000, 0.045);
		A.withdraw(30000);
		System.out.println("您的账户余额为："+ A.getBalance());
		System.out.println();
		A.withdraw(2500);
		A.deposit(3000);
		System.out.println("您的账户余额为："+ A.getBalance());
		
		System.out.println("月利率为："+ A.getMonthlyInterest());
		
		
	}
}
