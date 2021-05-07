package com.bao.demo2;
/**
 * 客户实体类
 * */
public class Customer {
	private String name;//名字
	private char gender;//性别
	private int age;//年龄
	private String phone;//电话
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
