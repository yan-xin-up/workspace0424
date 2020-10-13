package buzz.xinyan.java.exer1;

public class OrderTest {
	public static void main(String[] args) {
		Order order1 = new Order(2345, "mikami_yui");
		Order order2 = new Order(1234, "ishihara_satomi");
		System.out.println(order1.equals(order2));
	}

}

class Order {
	int orderId;
	String orderName;

	protected Order(int orderId, String orderName) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Order) {
			Order o = (Order) obj;
			return this.orderId == o.orderId && this.orderName.equals(o.orderName);
		}
		return false;
	}

}