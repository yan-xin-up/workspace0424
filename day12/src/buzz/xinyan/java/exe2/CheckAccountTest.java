package buzz.xinyan.java.exe2;

public class CheckAccountTest {

	public static void main(String[] args) {
		CheckAccount twoAccount = new CheckAccount("1122", 20000, 0.045, 5000);
		twoAccount.withdraw(5000);
		System.out.println("您的可透支额度: " + twoAccount.getOverdraft());
		System.out.println("*********************************************");
		twoAccount.withdraw(18000);
		System.out.println("您的账户余额为：" + twoAccount.getBalance());
		System.out.println("您的可透支额度: " + twoAccount.getOverdraft());
		System.out.println("*********************************************");
		twoAccount.withdraw(3000);
		System.out.println("您的账户余额为：" + twoAccount.getBalance());
		System.out.println("您的可透支额度: " + twoAccount.getOverdraft());
		
	}

}
