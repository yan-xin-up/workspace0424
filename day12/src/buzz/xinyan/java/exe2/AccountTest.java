package buzz.xinyan.java.exe2;

public class AccountTest {

	public static void main(String[] args) {
		Account  oneaAccount = new Account("1122", 20000, 0.045);
		oneaAccount.withdraw(30000);
		oneaAccount.withdraw(2500);
		oneaAccount.deposit(3000);
		
	}

}
