package com.xinyan.project.service;

import com.xinyan.project.bean.Customer;

/**
 *
 * @Description CustomerList为Customer对象的管理模块， 内部用数组管理一组Customer对象，并提供相应的添加、
 *              修改、删除和遍历方法，供CustomerView调用.
 * @author Ivan Xin Email:xinyan7788@live.com
 * @version
 * @date 2020年4月27日下午11:21:30
 *
 */
public class CustomerList {
	private Customer[] customers; // 用来保存客户对象的数组 声明数组
	private int total = 0; // 记录已经保存的客户数量

	/**
	 * 构造器，用来初始化customers数组
	 * 
	 * @param totalCustomer：指定数组的长度
	 */
	public CustomerList(int totalCustomer) {
		customers = new Customer[totalCustomer];// 初始化customers数组
	}

	/**
	 * 
	 * @Description 将制定的客户添加到数组中
	 * @author Ivan Xin
	 * @date 5 May 20208:59:52 pm
	 * @param customer
	 * @return true：成功，false：失败
	 */
	public boolean addCustomer(Customer customer) {
		if (total > customers.length) {
			return false;
		}
//		customers [total] = customer;
//		total++;
		// 或者
		customers[total++] = customer;
		return true;
	}

	/**
	 * @Description 修改指定位置索引位置的客户信息
	 * @author Ivan Xin
	 * @date 5 May 20209:08:21 pm
	 * @param index
	 * @param cust
	 * @return true；修改成功 false:修改失败
	 */
	public boolean replaceCustomer(int index, Customer cust) {
		if (index >= 3 || index < 0) {
			return false;
		}
		customers[index] = cust;// 否则用cust替代索引值
		return true;
	}

	/**
	 * @Description 删除指定位置索引的数据
	 * @author Ivan Xin
	 * @date 5 May 20209:25:39 pm
	 * @param index
	 * @return
	 */
	public boolean deleteCustomer(int index) {
		if (index >= 3 || index < 0) {
			return false;
		}
		for (int i = index; i < total - 1; i++) {
			customers[i] = customers[i + 1];// 索引后一个位置替代前一个位置
		}
		// 最后有数据元素置空
		customers[--total] = null;// 将程序指定位置删除

		return true;
	}

	/**
	 * @Description 获取所有客户信息
	 * @author Ivan Xin
	 * @date 5 May 20209:48:44 pm
	 * @return
	 */

	public Customer[] getAllCustomer() {
		Customer[] cust = new Customer[total];// 以已存在单位建立cust数组
		for (int i = 0; i < cust.length; i++) {
			cust[i] = customers[i];
		}
		return cust;
	}

	/**
	 * @Description 获取指定位置上的客户信息
	 * @author Ivan Xin
	 * @date 5 May 20209:58:58 pm
	 * @param index
	 * @return 找到元素返回，否则返回null
	 */
	public Customer getCustomer(int index) {
		// 如不再对应区间取空值
		if (index < 0 || index >= total) {
			return null;
		}
		return customers[index];
	}

	/**
	 * 
	 * @Description 返回已存储客户数量
	 * @author Ivan Xin
	 * @date 5 May 202010:04:13 pm
	 * @return
	 */

	public int getTotal() {

		return total;
	}
}
