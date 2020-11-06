package cylinder;

import circle.Circle;

public class Cylinder extends Circle {
	private double height;

	public Cylinder() {
		super();
	}

	public Cylinder(double radious,double height) {
		super(radious);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	/**
	 * 
	* @Description 表面积
	* @author Ivan Xin
	* @date 2020年11月6日下午3:06:58
	* @return
	 */
	public double findArea() {
		return getArea()*2+getPerimeter()*getHeight();
	}
	/**
	 * 
	* @Description 圆柱体积
	* @author Ivan Xin
	* @date 2020年11月6日下午3:08:37
	* @return
	 */
	public double getVolume() {
		return getArea()*getHeight();
	}
}
