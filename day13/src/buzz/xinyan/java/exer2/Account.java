package buzz.xinyan.java.exer2;

public class Account {
	private int Id;
	private double balance; // 余额
	private double annualInterestRate;

	public Account(int id, double balance, double annualInterestRate) {
		Id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance() {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestrate) {
		this.annualInterestRate = annualInterestrate;
	}

	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println("取款" + amount + "成功,您的余额为：" + balance);
		} else {
			System.out.println("对不起，取款失败");
		}

	}

	public void deposit(double amount) {
		if (amount <= 0) {
			System.out.println("存款失败！！！");
		} else {
			balance += amount;
			System.out.println("成功存入" + amount);
		}
	}
}
