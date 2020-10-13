package buzz.xinyan.java.supertest;

import java.io.ObjectInputStream.GetField;

public class CheckAccountTest {
	public static void main(String[] args) {
		CheckAccount  a1 = new CheckAccount(1122, 20000, 0.045, 5000);
		a1.withdraw(5000);
		System.out.println("您的账户余额为：" + a1.getBalance());
		System.out.println("您的可透支额为：" + a1.getOverdraft());
		System.out.println();
		a1.withdraw(18000);
		System.out.println("您的账户余额为：" + a1.getBalance());
		System.out.println("您的可透支额为：" + a1.getOverdraft());
		System.out.println();
		a1.withdraw(3000);
		System.out.println("您的账户余额为：" + a1.getBalance());
		System.out.println("您的可透支额为：" + a1.getOverdraft());
	}
}
