package buzz.xinyan.java.exe;



/**
 * 成员变量 int sex 和 int salary 
 * 方法 void manOrWoman()：根据 sex 的值显示“ man”(sex==1)或者woman”(sex==0) 
 * 方法 void employeed()：根据 salary 的值显示“no job”(salary==0)或者“job”(salary!=0) 。
 */
public class ManKind {

	private int sex;
	private int salary;

	public ManKind() {
	}

	public ManKind(int sex, int salary) {
		this.sex = sex;
		this.salary = salary;
	}
	
	public void manOrWoman() {
		if(sex == 1) {
			System.out.println("man");
		}else if (sex == 0) {
			System.out.println("gay man");
		}
	}
		
	public void employeed(){
//		if(salary == 0) {
//			System.out.println("no job");
//		}else if (salary != 0) {
//			System.out.println("job");
//		}
		String jobInfo=(salary == 0)?("job"):("no job");
		System.out.println(jobInfo);
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}