package buzz.xinyan.java.exe2;

public class CheckAccount extends Account {
	private double overdraft; // 可透支限额
//	Account account = new Account();

	public CheckAccount(String ID, double balance, double annualinterestRate, double overdraft) {
		super(ID, balance, annualinterestRate);
		this.overdraft = overdraft;
	}

	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

	/**
	 * 
	 * @Description 取款方法//
	 * @author Ivan Xin
	 * @date 2020年5月19日下午12:50:11
	 * @param amount 取钱
	 */
	@Override
	public void withdraw(double amount) {
		if (amount < getBalance()) {
			super.withdraw(amount);
		} else if (overdraft >= amount - getBalance()) {
			overdraft -= amount - getBalance();
			setBalance(0);
		} else {
			System.out.println("超过可以透支的额度！");
		}
	}
}
