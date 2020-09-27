package com.Account2.com;

public class Bank {
	private Customer[] customers;//多个客户数组
	private int numberOfCustomers;//记录客户个数
	public Bank(){
		customers=new Customer[10];
	}
	//添加客户
	public void addCustomer(String f,String l) {
		Customer cust=new Customer(f,l);
		customers[numberOfCustomers]=cust;
		numberOfCustomers++;
	}
	//获取客户个数
	public int getNumOfCustomers() {
		return numberOfCustomers;
	}
	//获取指定位置上客户
	public Customer getCustomer(int index) {
		if(index>=0 &&index<numberOfCustomers) {
			return customers[index];
		}
		return null;
	}
}
