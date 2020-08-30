package buzz.xinyan.java.exer.day10;

public class CylinderText {
	public static void main(String[] args) {
		Cylinder text = new Cylinder();
		text.setValue(10, 10);
		text.printDetails();

		System.out.println("底面积为：" + text.getArea());
		System.out.println("体积为：" + text.getVolume());

		boolean flag = text.setRadiousAndHeight(0, 10);
		if (!flag) {
			System.out.println("赋值失败！XDD");
		} else {
			text.printDetails();
		}
	}
}
