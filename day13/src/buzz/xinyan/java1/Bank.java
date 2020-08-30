package buzz.xinyan.java1;

public class Bank {
	private Customer[] customers;
	private int numberOfCustomer;

	public Bank() {
		customers = new Customer[100];
	}

	public void addCustomer(String f, String l) {
		Customer cust = new Customer(f, l);
//		for(int i = 0;i < 10;i++) {
			customers[numberOfCustomer++] = cust;	//测试。
//		}	
	}
	public int getNumberOfCustomer() {
		return numberOfCustomer;
	}
	public Customer getCustomer(int index) {
		if (index >=0 && index < numberOfCustomer ) {
			return customers[index];
		}else {
			return null;
		}
	}
	
	
}
