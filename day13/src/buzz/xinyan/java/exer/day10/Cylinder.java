package buzz.xinyan.java.exer.day10;

public class Cylinder {
	double radious;
	double height;

	/**
	 * A：方法的功能：在方法中打印圆柱体的详细信息 圆柱体的底边的半径是xxx，高是xxx，底面积是xxx，体积是xxx。
	 */
	public void printDetails() {

		System.out.println("圆柱体的底边的半径是：" + radious + "高是：" + height + "底面积是：" + getArea() + "体积是：" + getVolume());
	}

	/**
	 * B：方法的功能：返回底面积
	 */
	public double getArea() {

		return Math.PI * radious * radious; // 底面积

	}

	/**
	 * C：方法的功能：返回体积
	 */
	public double getVolume() {
		return getArea() * height;
	}

	/**
	 * D：方法的功能：为圆柱体的底边的半径，和高赋值
	 */
	public void setValue(double radious, double height) {
		this.radious = radious;
		this.height = height;
	}
	/**
	 * E：方法的功能：为圆柱体的底边的半径，和高赋值，并返回赋值的结果 
	 * 如果底边的半径或高为<=0，赋值失败，返回false，否则返回true
	 */
	public boolean setRadiousAndHeight(double radious, double height) {
		if (radious > 0) {
			this.radious = radious;
			this.height = height;
			return true;
		}else {
			return false;
		}
	}
}
