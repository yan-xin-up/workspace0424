package buzz.xinyan.java.exer2;

public class Girl {

	private String name;
	private int age;

	public Girl(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void marry(Boy boy) {
		System.out.println("我想嫁给" + boy.getName());
		boy.marry(this);
	}
	/**
	 * 
	* @Description 比较两个对象的大小。
	* @author Ivan Xin
	* @date 2020年8月18日上午10:14:01
	* @return	若为正则当前对象大，反之则当前对象小。0则二者相等（当前对象，形参对象）
	 */
	public int compare(Girl girl) {
//		if(this.age > girl.age) {     //this.age 调此方法的对象的属性。
//			return 1;
//		}else if(this.age < girl.age) {
//			return -1;
//		}else{
//			return 0;
//		}
		return this.age - girl.age;
	}
	
}
