package com.xinyan.buzz.exe1;

/*
 * 
 */
public class ManKind {

	private int sex;
	private int salary;

	public void manOrWoman() {
		if (sex == 1) {
			System.out.println("man");
		} else if (sex == 0) {
			System.out.println("woman");
		}

	}

	public void employeed() {
//		if(salary == 0) {
//			System.out.println("No Job!");
//		}else if(salary != 0) {
//			System.err.println("Well Done!");
//		}
		String jobInfo = (salary == 0) ? "no job" : "have job";
		System.out.println(jobInfo);
	}

	public ManKind() {

	}

	public ManKind(int sex, int salary) {
		this.salary = salary;
		this.sex = sex;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

}
