package com.atguigu.p2;
public class CustomerList {
  private Customer[] customers;//用来保护客户对象数组
  private int  total=0;//用来保存客户对象的数量
  /*
   * 初始化customers数组的构造器
   * totalCustomer ,指定数组的长度
   * */
  public CustomerList(int totalCustomer) {
	  customers=new Customer[totalCustomer];
	  
  }
  /*
   * 将指定的客户添加到数组中
   * */
  public boolean addCustomer(Customer customer) {
	  if(total>=customers.length) {
		  return false;
	  }
	  customers[total]=customer;
	  total++;
	  return true;
  }
  /**
   * 修改指定索引位置信息
   * 
   * */
  public boolean replaceCustomer(int index,Customer cust) {
	  if(index<0 ||index>=total) {
		  return false;
	  }
	  customers[index]=cust;
	  return true;
  }
  /*
   * 删除指定位置上的客户
   * */
  public boolean deleteCustomer(int index) {
	  if(index<0 ||index>=total) {
		  return false;
	  }
	  for(int i=index;i<total-1;i++) {
		  customers[i]=customers[i+1];
	  }
	  //最后一个元素置空
	  customers[total-1]=null;
	  total--;
	  return true;
  }
  /*
   * 获取所有客户信息
   * */
  public Customer[] getAllCustomers() {
	  Customer[] custs=new Customer[total];
	  for(int i=0;i<total;i++) {
		  custs[i]=customers[i];//给地址值
	  }
	  return custs;
  }
  /*
   * 获取指定索引位置上的客户
   * */
  public Customer getCustomer(int index) {
	  if(index<0||index>=total) {
		  return null;
	  }
	  return customers[index];
  }
  /*
   * 获取存储客户的数量
   * */
  public int getTotal() {
	  return total;
  }
  
}
