package com.bao.demo2;
/**
 * 内部封装一个Customer[],提供对Customer数据的增删改查。
 * 
 * */
public class CustomerList {
	private Customer[] customers;
	private int total;//记录存储的客户的个数
	
	/**
	 * 构造器，用于初始化customers数组
	 * @param: totalCustomer 用来指定数组的长度
	 * */
	public CustomerList(int totalCustomer) {
		customers = new Customer[totalCustomer];
	}
	
	/**
	 * 添加一个客户
	 *  
	 * @param customer
	 * @Return  添加是否成功
	 * */
	public boolean addCustomer(Customer customer) {
		if(customers != null && total > customers.length) {
			customers[total++] = customer;
			return true;
		}
		return false;
	}
	/**
	 * 替换指定数组位置的数组元素
	 * */
	public boolean replaceCustomer(int index, Customer cust) {
		if(index >= 0 && index < total) {
			customers[index] = cust;
			return true;
		}
		return false;
	}
	/**
	 * 删除指定索引位置的元素
	 * */
	public boolean deleteCustomer(int index) {
		if(index >= 0 &&  index < total) {
			for(int i = index;i < total - 1;i++){
				customers[i] = customers[i + 1];
			}
//			customers[total - 1] = null;
//			total--;//存储的总人数减少1.
			customers[--total] = null;
			return true;
		}
		return false;
		
	}
	/**
	 * 获取所有的customers对象构成的数组
	 * @return
	 */
	public Customer[] getAllCustomers() {
//		return customers;//错误的
		Customer[] custs = new Customer[total];
		//给数组元素赋值
		for(int i = 0;i < custs.length;i++){
			custs[i] = customers[i];
		}
		return custs;
	}
	
	/**
	 * 返回指定索引位置上的Customer
	 * @param index
	 * @return 如果输入的index位置上的元素不存在，返回null
	 */
	public Customer getCustomer(int index) {
		if(index >= 0 && index < total){
			return customers[index];
		}
		return null;
	}
	/**
	 * 返回Customer对象的个数
	 * @return
	 */
	public int getTotal(){
//		return customers.length;//错误的
		return total;
	}

}
