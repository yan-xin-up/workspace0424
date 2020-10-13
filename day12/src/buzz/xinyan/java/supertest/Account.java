package buzz.xinyan.java.supertest;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;

	public Account() {

	}

	public Account(int id, double balance, double annualInterestRate) {
		super();
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public double getMonthlyInterest() {
		return annualInterestRate / 12;
	}
/**
 * 
* @Description		提款
* @author Ivan Xin
* @date 2020年10月8日下午5:50:12
* @param amount
 */
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance -= amount;
			
		}else{
			System.out.println("余额不足!");
		}
	}
	/**
	 * 
	* @Description 	存款
	* @author Ivan Xin
	* @date 2020年10月8日下午5:50:35
	* @param amount
	 */
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			}else {
				System.out.println("请输入正确的数字！");
			}
	}

}
