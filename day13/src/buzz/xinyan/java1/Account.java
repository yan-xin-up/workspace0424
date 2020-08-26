package buzz.xinyan.java1;

public class Account {
	private double balance;

	public Account(double init_balance) {
		this.balance = init_balance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amt) {
		if (amt <= 0) {
			System.out.println("存款失败！！！");
		} else {
			balance += amt;
			System.out.println("存款" + amt + "成功，您的余额为：" + balance);
		}
	}

	public void withdraw(double amt) {
		if (amt > balance) {
			System.out.println("对不起，取款失败,宁的余额不足！");
		} else {
			balance-=amt;
			System.out.println("取款" + amt + "成功,您的余额为：" + balance);
		}
	}
}
