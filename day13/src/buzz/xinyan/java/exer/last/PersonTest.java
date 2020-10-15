package buzz.xinyan.java.exer.last;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 =new Faculty("本科", "毕业");
		Person p2 =new Staff ("职员");
		if(p1 instanceof Faculty) {
			Faculty F = (Faculty)p1;
		System.out.println("学位是："+ F.getDegree()  );
		}
		System.out.print(p1);
	}
}
