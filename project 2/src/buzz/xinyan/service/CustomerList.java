package buzz.xinyan.service;

import buzz.xinyan.bean.Customer;

/**
 * 
 * @Description CustomerList为Customer对象的管理模块， 内部用数组管理一组Customer对象，
 *              并提供相应的添加、修改、删除和遍历方法， 供CustomerView调用.
 * @author Ivan Xin Email:xinyan7788@live.com
 * @version
 * @date 2020年9月14日下午3:01:50
 *
 */
public class CustomerList {
	private Customer[] customers; // 用来保存客户对象的数组
	int total = 0; // 记录已保存客户对象的数量

	/**
	 * 用途：构造器，用来初始化customers数组
	 * 
	 * @param totalCustomer指定customers数组的最大空间
	 */
	public CustomerList(int totalCustomer) {
		customers = new Customer[totalCustomer];
	}

	/**
	 * 
	 * @Description 将参数customer添加到数组中
	 * @author Ivan Xin
	 * @date 2020年9月16日上午11:45:41
	 * @param customer customer指定要添加的客户对象
	 * @return 添加成功返回true；false表示数组已满，无法添加
	 */
	public boolean addCustomer(Customer customer) {
		if (total >= customers.length)
			return false;
		customers[total++] = customer;
		return true;
	}

	/**
	 * 
	 * @Description 用参数customer替换数组中由index指定的对象
	 * @author Ivan Xin
	 * @date 2020年9月16日下午1:36:19
	 * @param index 指定所替换对象在数组中的位置，从0开始
	 * @param cust  指定替换的新客户对象
	 * @return 替换成功返回true；false表示索引无效，无法替换
	 */
	public boolean replaceCustomer(int index, Customer cust) {
		if (index < 0 || index > total)
			return false;
		customers[index] = cust;
		return true;
	}

	/**
	 * @Description 从数组中删除参数index指定索引位置的客户对象记录
	 * @author Ivan Xin
	 * @date 2020年9月16日下午2:14:33
	 * @param index index指定所删除对象在数组中的索引位置，从0开始
	 * @return 删除成功返回true；false表示索引无效，无法删除
	 */

	public boolean deleteCustomer(int index) {
		if (index < 0 || index > total)
			return false;
		for (int i = index; i < total - 1; i++) {
			customers[i] = customers[i + 1]; // 进位
		}

		customers[--total] = null; // 进位之后将末尾值改为null
		return true;
	}

	/**
	 * 
	 * @Description 返回数组中记录的所有客户对象
	 * @author Ivan Xin
	 * @date 2020年9月16日下午2:49:25
	 * @return Customer[] 数组中包含了当前所有客户对象，该数组长度与对象个数相同
	 */
	public Customer[] getAllCustomers() {
		Customer[] custs = new Customer[total];
		for (int i = 0; i < total; i++) {
			custs[i] = customers[i];
		}
		return custs;
	}

	/**
	 * 
	 * @Description 返回参数index指定索引位置的客户记录
	 * @author Ivan Xin
	 * @date 2020年9月16日下午10:08:20
	 * @param index index 指定所要获取的客户在数组中的索引位置，从0开始。
	 * @return 返回 封装了客户信息的Customer对象。
	 */
	public Customer getCustomer(int index) {
		if (index < 0 || index >= total)
			return null;

		return customers[index];

	}
	/**
	 * 
	* @Description		获取用户的数量
	* @author Ivan Xin
	* @date 2020年9月16日下午10:23:01
	* @return
	 */
	public int getTotal() {
		return total;
	}
}
