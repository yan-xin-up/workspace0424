package buzz.xinyan.java.exer.day10;

public class DistanceText {
	public static void main(String[] args) {
		Distance distance = new Distance(1, 2);
		System.out.println(distance.Distance(1, 1));
	}
}

class Distance {
	private int x;
	private int y;

	public Distance() {

	}

	/**
	 * 设置默认点。
	 * 
	 * @param x
	 * @param y
	 */
	public Distance(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	/**
	 * AB=√[(x1－x2)2+(y1－y2)2] 计算两点
	 */
	public double Distance(double x, double y) {
		double d = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
		return d;
	}

	// 点到原点的距离
	public double Distance0() {
		return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
	}

}
