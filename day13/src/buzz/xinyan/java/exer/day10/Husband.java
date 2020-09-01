package buzz.xinyan.java.exer.day10;

import java.security.PublicKey;

public class Husband {
	String name;
	int age;
	String wife;
	
	public void getInfo(Wife wife) {
		System.out.println("你的姓名为："+name+"\t年龄为："+age+"\t你妻子的名字："+
		wife.name+"\t老婆的年龄是："+wife.age);
	}
}
