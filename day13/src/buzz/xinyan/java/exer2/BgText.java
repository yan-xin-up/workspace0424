package buzz.xinyan.java.exer2;

public class BgText {
public static void main(String[] args) {
	Boy boy = new Boy("xinyan", 28);
	boy.shout();
	Girl girl = new Girl("mikami",28);
	girl.marry(boy);
	Girl girl1 = new Girl("ishihara_satomi",28);
	int compare = girl.compare(girl1);
	if(compare > 0) {
		System.out.println(girl.getName()+"年龄大");
	}else if(compare < 0) {
		System.out.println(girl.getName()+"年龄小");
	}else {
		System.out.println(girl.getName()+"和"+girl1.getName()+"年龄相同");		
	}
}
	

}
