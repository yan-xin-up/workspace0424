package buzz.xinyan.java.supertest;

public class CheckAccount extends Account {
	private double overdraft;

	public CheckAccount() {

	}

	public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
		super(id, balance, annualInterestRate);
		this.overdraft = overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

	public double getOverdraft() {
		return overdraft;
	}

	@Override
	public void withdraw(double amount) {
		if (amount < getBalance())				//余额足够就消费
			super.withdraw(amount);
		else if (amount > getBalance()) {
			double needOverdraft = amount - getBalance();
			if (overdraft > needOverdraft) {			//透支额度+余额足够就可以取钱，抵消额度
				overdraft -=needOverdraft; 
				super.withdraw(getBalance());
			} else {
				System.out.println("超过可以透支的限额！");
				System.out.println();
			}
		}

	}
}
