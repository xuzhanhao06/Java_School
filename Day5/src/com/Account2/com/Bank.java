package com.Account2.com;

public class Bank {
	private Customer[] customers;//����ͻ�����
	private int numberOfCustomers;//��¼�ͻ�����
	public Bank(){
		customers=new Customer[10];
	}
	//��ӿͻ�
	public void addCustomer(String f,String l) {
		Customer cust=new Customer(f,l);
		customers[numberOfCustomers]=cust;
		numberOfCustomers++;
	}
	//��ȡ�ͻ�����
	public int getNumOfCustomers() {
		return numberOfCustomers;
	}
	//��ȡָ��λ���Ͽͻ�
	public Customer getCustomer(int index) {
		if(index>=0 &&index<numberOfCustomers) {
			return customers[index];
		}
		return null;
	}
}
