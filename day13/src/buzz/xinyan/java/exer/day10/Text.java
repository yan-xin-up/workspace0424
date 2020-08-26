package buzz.xinyan.java.exer.day10;

/*2、定义一个丈夫Husband类，有姓名、年龄、妻子属性
定义一个妻子Wife类，有姓名、年龄、丈夫属性
丈夫类中有一个getInfo方法，其中，能打印显示自己的姓名，年龄，和他的妻子的姓名，年龄
妻子类中有一个getInfo方法，其中，能打印显示自己的姓名，年龄，和她的丈夫的姓名，年龄
定义一个测试类，创建妻子和丈夫对象，然后测试
*/
class Text {
	public static void main(String[] args) {
//3、测试类，创建妻子和丈夫对象，然后测试
		Wife wife = new Wife();
		wife.name = "小丽";
		wife.age = 20;
		Husband husband = new Husband();
		husband.name = "张三";
		husband.age = 22;
		wife.getInfo(husband);// husband为实参,把地址值给husbnd；
		husband.getInfo(wife);// wife为实参，把地址值给wife；

	}
}// 1、定义husband类；

class Husband {
//属性
	String name;
	int age;
	String wife;

//方法
	void getInfo(Wife wife)// wife为形参
	{

		System.out.println("姓名: " + name + ", 年龄: " + age + ",妻子姓名: " + wife.name + ",妻子年龄: " + wife.age);
//System.out.println("姓名"+wife.name+"年龄"+wife.age);

	}
}// 定义wife类

class Wife {
//属性
	String name;
	int age;
	String husband;

//方法
	void getInfo(Husband husband)// husband为形参
	{

		System.out.println("姓名: " + name + ", 年龄: " + age + ",丈夫姓名：" + husband.name + ",丈夫年龄: " + husband.age);
//System.out.println("姓名"+husband.name+"年龄"+husband.age);

	}
}