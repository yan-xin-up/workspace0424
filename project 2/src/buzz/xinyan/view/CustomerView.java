package buzz.xinyan.view;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

import buzz.xinyan.bean.Customer;
import buzz.xinyan.service.CustomerList;
import buzz.xinyan.util.CMUtility;

/**
 * 
 * @Description CustomerView为主模块，负责菜单的显示和处理用户操作
 * @author Ivan Xin Email:xinyan7788@live.com
 * @version
 * @date 2020年9月14日下午3:06:18
 *
 */
public class CustomerView {
	CustomerList customerList = new CustomerList(3); // 建立10个客户的数组
	private String String;

	public CustomerView() {
		Customer cust = new Customer("张三", '男', 12, "123456789123", "zhang@abc.com");
		customerList.addCustomer(cust);
	}

	/**
	 * 
	 * @Description 用途：显示主菜单，响应用户输入，根据用户操作分别调用其他相应的成员方法 以完成客户信息处理。
	 * @author Ivan Xin
	 * @date 2020年9月16日下午10:40:51
	 */
	public void enterMainMenu() {
		boolean isFlag = true;
		do {
			System.out.println("-------------客户信息管理软件-------------");
			System.out.println("                   1 添 加 客 户");
			System.out.println("                   2 修 改 客 户");
			System.out.println("                   3 删 除 客 户");
			System.out.println("                   4 客 户 列 表");
			System.out.println("                   5 退       出\n");
			System.out.print("                   请选择(1-5)：");

			char key = CMUtility.readMenuSelection();
			switch (key) {
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
				System.out.print("确认是否退出(Y/N)：");
				char yn = CMUtility.readConfirmSelection();
				if (yn == 'Y')
					isFlag = false;
				break;
			}

		} while (isFlag);
	}

	/**
	 * 
	 * @Description 添加客户方法
	 * @author Ivan Xin
	 * @date 2020年9月17日下午1:51:00
	 */
	private void addNewCustomer() {
		System.out.println("-----------------添加客户-----------------");
		System.out.println("姓名：");
		String name = CMUtility.readString(20);
		System.out.println("性别：");
		char gender = CMUtility.readChar();
		System.out.println("年龄：");
		int age = CMUtility.readInt(2);
		System.out.println("电话号码：");
		String phone = CMUtility.readString(20);
		System.out.println("email：");
		String email = CMUtility.readString(20);

		Customer cust = new Customer(name, gender, age, phone, email);
		boolean flag = customerList.addCustomer(cust);
		if (flag) {
			System.out.println("-----------------添加成功-----------------");
		} else {
			System.out.println("-----------------添加失败-----------------");

		}
	}

	/**
	 * 
	 * @Description 修改客户
	 * @author Ivan Xin
	 * @date 2020年9月18日上午11:02:57
	 */
	private void modifyCustomer() {
		System.out.println("-----------------修改客户-----------------");
		int readInt;
		Customer cust;
		for (;;) {
			System.out.println("请选择待修改客户编号(-1退出)：");
			readInt = CMUtility.readInt();
			if (readInt == -1) {
				return;
			}
			cust = customerList.getCustomer(readInt - 1);
			if (cust == null) {
				System.out.println("无法找到指定客户！");
			} else {
				break;
			}
		}
		// 修改客户信息
		System.out.println("姓名(" + cust.getName() + "):");
		String name = CMUtility.readString(11, cust.getName());
		System.out.println("性别(" + cust.getGender() + "):");
		char gender = CMUtility.readChar(cust.getGender());
		System.out.println("年龄(" + cust.getAge() + "):");
		int age = CMUtility.readInt(cust.getAge());
		System.out.println("电话号码(" + cust.getGender() + "):");
		String phone = CMUtility.readString(12, cust.getPhone());
		System.out.println("邮箱(" + cust.getEmail() + "):");
		String email = CMUtility.readString(20, cust.getEmail());

		Customer newCust = new Customer(name, gender, age, phone, email);
		boolean replaceCustomer = customerList.replaceCustomer(readInt - 1, newCust);
		if (replaceCustomer) {
			System.out.println("-----------------修改完成-----------------");
		} else {
			System.out.println("-----------------修改失败-----------------");
		}
	}

	/**
	 * 
	 * @Description 删除客户信息
	 * @author Ivan Xin
	 * @date 2020年9月21日上午11:19:22
	 */
	private void deleteCustomer() {
		System.out.println("-----------------删除客户-----------------");
		Customer cust;
		int readInt;
		for (;;) {
			System.out.println("请选择待删除客户编号(-1退出)：");
			readInt = CMUtility.readInt();
			if (readInt == -1) {
				return;
			}
			cust = customerList.getCustomer(readInt - 1);
			if (cust == null) {
				System.out.println("无法找到指定客户！");
			}else {
				break;
			}
		}
		//找到用户
		System.out.println("确认是否删除(Y/N)：");
		char isDelet = CMUtility.readConfirmSelection();
		if(isDelet == 'Y') {
			boolean deleteSuccess = customerList.deleteCustomer(readInt-1);
			if(deleteSuccess) {
				System.out.println("-----------------删除完毕-----------------");
			}else {
				System.out.println("-----------------删除失败-----------------");
			}
		}else {
			return;
		}
	}
	/**
	 * 
	* @Description  列表
	* @author Ivan Xin
	* @date 2020年9月21日下午1:09:11
	 */
	private void listAllCustomers() {

		int total = customerList.getTotal();
		if (total == 0) {
			System.out.println("------------对不起！无客户记录------------");
		} else {
			System.out.println("-----------------客户列表-----------------");
			System.out.println("编号\t\t姓名\t\t性别\t年龄\t电话\t\t邮箱");
			Customer[] cust = customerList.getAllCustomers();// 调用
			for (int i = 0; i < cust.length; i++) {
				Customer custs = cust[i];
				System.out.println((i + 1) + "\t\t" + custs.getName() + "\t\t" + custs.getGender() + "\t"
						+ custs.getAge() + "\t" + custs.getPhone() + "\t\t" + custs.getEmail());
			}

			System.out.println("---------------客户列表完成 ---------------");
		}

	}

	public static void main(String[] args) {
		CustomerView cust = new CustomerView();
		cust.enterMainMenu();
	}

}
