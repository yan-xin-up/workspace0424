package buzz.xinyan.java.exe2;

public class AccountTest {

	public static void main(String[] args) {
		Account  oneaAccount = new Account("1122", 20000, 0.045);
		oneaAccount.withdraw(30000);
		System.out.println("您的账户余额为：" +oneaAccount.getBalance());
		oneaAccount.withdraw(2500);
		oneaAccount.deposit(3000);
		System.out.println("您的账户余额为：" +oneaAccount.getBalance());
		System.out.println("您的月利率为："+((oneaAccount.getMonthlyInterest())*100)+"%");
	}

}
