package com.bao.demo2;
/**
 * �ͻ�ʵ����
 * */
public class Customer {
	private String name;//����
	private char gender;//�Ա�
	private int age;//����
	private String phone;//�绰
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Customer(String name, char gender2, int age, String phone, String email) {
		this.name = name;
		this.gender = gender2;
		this.age = age;
		this.phone = phone;
		this.email = email;
	}
	public Customer() {
	}
	
}
