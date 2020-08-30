package buzz.xinyan.java1;

public class BankText {
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.addCustomer("三上", "悠亚");
		bank.getCustomer(0).setAccount(new Account(5000));
		bank.getCustomer(0).getAccount().deposit(500);
		bank.getCustomer(0).getAccount().withdraw(600);
		bank.getCustomer(0).getAccount().getBalance();
		
		System.out.println("尊敬的客户："+bank.getCustomer(0).getFirstName()+
				"\t宁的余额还剩余："+bank.getCustomer(0).getAccount().getBalance());
		System.out.println(bank.getNumberOfCustomer());
		System.out.println();
		
		bank.addCustomer("明里", "紬");
		bank.getCustomer(1).setAccount(new Account(4000));
		bank.getCustomer(1).getAccount().deposit(600);
		bank.getCustomer(1).getAccount().withdraw(600);
		bank.getCustomer(1).getAccount().getBalance();
		
		System.out.println("尊敬的客户："+bank.getCustomer(1).getFirstName()+
				"\t宁的余额还剩余："+bank.getCustomer(1).getAccount().getBalance());
		System.out.println(bank.getNumberOfCustomer());
		
		System.out.println();
		System.out.println(bank.getCustomer(0).getAccount().getBalance());
//		bank.addCustomer("二狗", "辛");		//java.lang.NullPointerException
		System.out.println("尊敬的客户，目前用户数量为："+bank.getNumberOfCustomer());
		for(int index = 0;index < bank.getNumberOfCustomer();index++) {

			System.out.println("尊敬的客户："+bank.getCustomer(index).getFirstName()+
					"\t宁的余额还剩余："+bank.getCustomer(index).getAccount().getBalance());
		}
	}
}
