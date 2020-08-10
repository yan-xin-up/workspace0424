package buzz.xinyan.java.exer2;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Person {
	private int age;
	public void setAge(int age) {
		if( age >= 0 && age <= 130) {
			this.age = age;
		}else {
			System.out.println("error");
		}
		this.age = age;
	}
	public String getAge() {
		return "Your age Is\t"+age;
	}
}
