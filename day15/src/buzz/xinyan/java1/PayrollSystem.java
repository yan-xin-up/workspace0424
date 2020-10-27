package buzz.xinyan.java1;

import java.util.Calendar;
import java.util.Scanner;

public class PayrollSystem {
	public static void main(String[] args) {
		//方式1
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter the month:");
//		int month = scan.nextInt();
		//方式2
		Calendar instance = Calendar.getInstance();
		int month = instance.get(Calendar.MONTH);
		System.out.println(month);//月份加1，一月为0
		
		
		Employee[] emp = new Employee[2];
		emp[0] = new SalariedEmployee("ishihara_satomi", 1101, new MyDate(1986, 12, 24),5441.3);
		emp[1] = new HourlyEmployee("aragaki_yui", 0001, new MyDate(1988, 10, 27),5000,10);
		for(int i = 0;i<emp.length;i++) {
			System.out.println(emp[i]);
			
			double salary = emp[i].earnings();
			
			if(month+1 == emp[i].getBirthday().getMonth()) {
				System.out.println("Happy birthday!请收下小奖励=_+");
				double bounty = salary + 100;
				System.out.println("Salary is:"+bounty);
			}
			else{
				System.out.println("Salary is:"+salary);
			}
		}
	}
}
