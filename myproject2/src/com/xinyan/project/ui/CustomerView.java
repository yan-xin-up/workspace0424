package com.xinyan.project.ui;

import com.xinyan.project.bean.Customer;
import com.xinyan.project.service.CustomerList;
import com.xinyan.project.util.CMUtility;

/**
 * 
 * @Description CustomerView为主模块，负责菜单的显示 和处理用户操作
 * @author Ivan Xin Email:xinyan7788@live.com
 * @version
 * @date 2020年4月27日下午11:27:51
 *
 */
public class CustomerView {
	private CustomerList customers = new CustomerList(10);

	public CustomerView() {
		Customer custumer = new Customer("三上悠亚", '女', 18, "531181689", "ssyy@gav.com");
		customers.addCustomer(custumer);
	}

	/**
	 * 
	 * @Description 显示客户信息管理软件界面的方法
	 * @author Ivan Xin
	 * @date 5 May 202010:12:52 pm
	 */

	public void enterMainMenu() {
		boolean isFlag = true;
		while (isFlag) {

			System.out.println("\n------------------客户信息管理软件-------------------\n");
			System.out.println("\t\t\t\t\t1 添加客户");
			System.out.println("\t\t\t\t\t2 修改客户");
			System.out.println("\t\t\t\t\t3 删除客户");
			System.out.println("\t\t\t\t\t4 客户列表");
			System.out.println("\t\t\t\t\t5 退         出\n");
			System.out.print("\t\t\t请选择(1-5):   ");

			char menu = CMUtility.readMenuSelection();
			switch (menu) {
			case '1':
				addNewCustomer();
				break;
			case '2':
				modifyCustomer();
				break;
			case '3':
				deleteCustomer();
				break;
			case '4':
				listAllCustomers();
				break;
			case '5':
				System.out.print("是否确认退出（Y/N):   ");
				char isExit = CMUtility.readConfirmSelection();
				if (isExit == 'Y') {
					isFlag = false;
				}

			}
		}
	}

	/**
	 * 
	 * @Description 添加客户
	 * @author Ivan Xin
	 * @date 5 May 202010:12:52 pm
	 */
	private void addNewCustomer() {
		System.out.println("-----------------------------添加客户-----------------------------\n");
		System.out.print("姓名：");
		String name = CMUtility.readString(11);
		System.out.print("性别：");
		char gender = CMUtility.readChar();
		System.out.print("年龄：");
		int age = CMUtility.readInt();
		System.out.print("电话：");
		String phone = CMUtility.readString(13);
		System.out.print("email：");
		String email = CMUtility.readString(30);
		// 将上述封装到对象
		Customer cust = new Customer(name, gender, age, phone, email);
		boolean isSuccess = customers.addCustomer(cust);
		if (isSuccess) {
			System.out.println("-----------------------------恭喜添加成功av库加1-----------------------------\n");
		} else {
			System.out.println("-----------------------------添加失败，女优目录已满-----------------------------\n");
		}
	}

	/**
	 * 
	 * @Description 修改客户
	 * @author Ivan Xin
	 * @date 5 May 202010:12:52 pm
	 */
	private void modifyCustomer() {
		System.out.println("-----------------------------修改客户-----------------------------\n");
		Customer cust;
		int number;
		for (;;) {
			System.out.print("请选择待修改客户的编号（-1为退出）： ");
			number = CMUtility.readInt();
			if (number == -1) {
				return;
			}
			cust = customers.getCustomer(number - 1);
			if (cust == null) {
				System.out.println("无法找到指定客户！");
			} else {// 找到了对应客户
				break; // 循环较为臃肿跳出简化代码结构
			}
		}
		// 跳到此处开始信息处理

		System.out.print("姓名(" + cust.getName() + ")：");
		String name = CMUtility.readString(5, cust.getName());
		System.out.print("性别(" + cust.getGender() + ")：");
		char gender = CMUtility.readChar(cust.getGender());
		System.out.print("年龄(" + cust.getAge() + ")：");
		int age = CMUtility.readInt(cust.getAge());
		System.out.print("电话(" + cust.getPhone() + ")：");
		String phone = CMUtility.readString(15, cust.getPhone());
		System.out.print("邮箱(" + cust.getEmail() + ")：");
		String email = CMUtility.readString(30, cust.getEmail());

		cust = new Customer(name, gender, age, phone, email);
		boolean isRwplaced = customers.replaceCustomer(number - 1, cust);
		if (isRwplaced) {
			
			System.out.println("-----------------------------修改完成-----------------------------\n");
		} else {
			System.out.println("-----------------------------修改失败-----------------------------\n");
		}
	}

	/**
	 * 
	 * @Description 删除客户
	 * @author Ivan Xin
	 * @date 5 May 202010:12:52 pm
	 */
	private void deleteCustomer() {
//		System.out.println("删除客户");
		System.out.println("-----------------------------删除客户-----------------------------\n");
		int number;
		for (;;) {
			System.out.print("请选择待删除的客户编号(-1为退出)：");
			number = CMUtility.readInt();
			if (number == -1) {
				return;
			}
			Customer cust = customers.getCustomer(number - 1);
			if (cust == null) {
				System.out.println("sorry，无法找到指定客户");
			} else {
				break; // 注释同更改方法
			}
		}
		System.out.print("是否确认删除?(Y/N：)");
		char dele = CMUtility.readConfirmSelection();
		if(dele=='N')
			return;
		boolean isDele = customers.deleteCustomer(number-1);
		if(isDele) {
			System.out.println("-----------------------------删除完毕-----------------------------\n");
		}
		else {
			System.out.println("-----------------------------对不起，删除失败-----------------------------\n");
		}
	}

	/**
	 * 
	 * @Description 显示客户列表
	 * @author Ivan Xin
	 * @date 5 May 202010:12:52 pm
	 */
	private void listAllCustomers() {
		System.out.println("------------------客户列表---------------------");

		int total = customers.getTotal();
		if (total == 0) {
			System.out.println("没有客户记录");
		} else {
			System.out.println("编号\t姓名\t\t性别\t年龄\t\t电话\t\t邮箱");
			Customer[] cust = customers.getAllCustomer();
			for (int i = 0; i < cust.length; i++) {
//		 		System.out.println((i+1) + "\t" +cust[i].getName()+ "\t" +cust[i].getGender()+ "\t"+cust[i].getAge()+ "\t"  +"\t" +cust[i].getPhone() + "\t" + "\t" + cust[i].getEmail());
				System.out.println((i + 1) + "\t" + cust[i].getDetails());
			}
		}

		System.out.println("\n--------------- 客户列表完成-------------------\n");
	}

	public static void main(String[] args) {

		CustomerView view = new CustomerView();
		view.enterMainMenu();

	}
}
