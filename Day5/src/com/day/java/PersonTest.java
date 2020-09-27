package com.day.java;
/*
 * 自动生成get Set 方法：Source -Generate Getters and Setters
 * 
 * 自动生成构造器：Source-Generate Constructor using Fild
 * 
 * 
 * 
 * 
 * 
 * */

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new +构造器  作用创建对象
		//构造器跟类同名！！！！
	Person p1=new Person();
	p1.setAge(12);
	System.out.println(p1.getAge());
	
	PP a=new PP();
	PP a0=new PP("一个");
	}

}
class PP{
	
	public PP() {//默认构造器
		System.out.println("默认构造器");
	}
	public PP(String str) {//无默认构造器
		System.out.println("构造器"+str);
	}
}