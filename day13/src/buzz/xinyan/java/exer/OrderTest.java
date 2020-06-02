package buzz.xinyan.java.exer;

public class OrderTest {
	
	public  static void  main(String[] args) {
		Order o1 = new Order("w2w", 13);
		Order o2 = new Order("www", 13);
		System.out.println(o1.equals(o2));
	}
}

class Order {
	private int orderId;
	private String orderName;

	public void setorderID(int orderId) {
		this.orderId = orderId;
	}

	public int getorderId() {
		return orderId;
	}

	public void setorderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderName() {
		return orderName;
	}

	public  Order(String orderName,int orderId) {
		super();
		this.orderId=orderId;
		this.orderName=orderName;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this == obj) {
			return true;
		} else if (obj instanceof Order) {
			Order order = (Order) obj;
			return order.getorderId() == this.getorderId() && this.getOrderName().equals(order.orderName);
		}
		return false;
	}
}
