package buzz.xinyan.java.exe2;

import java.security.PublicKey;

public class Account {
	private String ID;
	private double balance; // 余额
	private double annualinterestRate;
	private double totalbalance;
	
	
	public Account(String ID, double balance, double annualinterestRate) {
		this.annualinterestRate = annualinterestRate;
		this.balance = balance;
		this.ID = ID;
	}

	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualinterestRate() {
		return annualinterestRate;
	}

	public void setAnnualinterestRate(double annualinterestRate) {
		this.annualinterestRate = annualinterestRate;
	}

	public double getMonthlyInterest() {
		return annualinterestRate / 12;
	}

	/**
	 * 
	 * @Description 取款方法//
	 * @author Ivan Xin
	 * @date 2020年5月19日下午12:50:11
	 * @param amount 取钱
	 */
	public void withdraw(double amount) {

//		totalbalance = balance - amount;
		if (amount <= balance) {
			System.out.println("您的账户余额为：" + (balance-=amount));
		} else {
			System.out.println("对不起! 余额不足！");
		}
	}

	/**
	 * @Description 存钱方法
	 * @author Ivan Xin
	 * @date 2020年5月19日下午12:01:51
	 * @param amount 存钱
	 */
	public void deposit(double amount) {

		if (amount > 0) {
			balance += amount;
		} else {
			System.out.println("对不起! 请存入足额现金！");
		}
		

	}
}
