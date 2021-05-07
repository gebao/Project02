package com.bao.demo2;
/**
 * �ڲ���װһ��Customer[],�ṩ��Customer���ݵ���ɾ�Ĳ顣
 * 
 * */
public class CustomerList {
	private Customer[] customers;
	private int total;//��¼�洢�Ŀͻ��ĸ���
	
	/**
	 * �����������ڳ�ʼ��customers����
	 * @param: totalCustomer ����ָ������ĳ���
	 * */
	public CustomerList(int totalCustomer) {
		customers = new Customer[totalCustomer];
	}
	
	/**
	 * ���һ���ͻ�
	 *  
	 * @param customer
	 * @Return  ����Ƿ�ɹ�
	 * */
	public boolean addCustomer(Customer customer) {
		if(customers != null && total > customers.length) {
			customers[total++] = customer;
			return true;
		}
		return false;
	}
	/**
	 * �滻ָ������λ�õ�����Ԫ��
	 * */
	public boolean replaceCustomer(int index, Customer cust) {
		if(index >= 0 && index < total) {
			customers[index] = cust;
			return true;
		}
		return false;
	}
	/**
	 * ɾ��ָ������λ�õ�Ԫ��
	 * */
	public boolean deleteCustomer(int index) {
		if(index >= 0 &&  index < total) {
			for(int i = index;i < total - 1;i++){
				customers[i] = customers[i + 1];
			}
//			customers[total - 1] = null;
//			total--;//�洢������������1.
			customers[--total] = null;
			return true;
		}
		return false;
		
	}
	/**
	 * ��ȡ���е�customers���󹹳ɵ�����
	 * @return
	 */
	public Customer[] getAllCustomers() {
//		return customers;//�����
		Customer[] custs = new Customer[total];
		//������Ԫ�ظ�ֵ
		for(int i = 0;i < custs.length;i++){
			custs[i] = customers[i];
		}
		return custs;
	}
	
	/**
	 * ����ָ������λ���ϵ�Customer
	 * @param index
	 * @return ��������indexλ���ϵ�Ԫ�ز����ڣ�����null
	 */
	public Customer getCustomer(int index) {
		if(index >= 0 && index < total){
			return customers[index];
		}
		return null;
	}
	/**
	 * ����Customer����ĸ���
	 * @return
	 */
	public int getTotal(){
//		return customers.length;//�����
		return total;
	}

}
