package com.tian.java;

public class MethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodTest test=new MethodTest(); //没有static需要实例化 如果有直接调用
		test.show(12);
		test.show("Hello0");
		test.show("Hello0","Hello1");//传过去是数组形式
		System.exit(0);//直接退出程序！！！！！！！！代码
	}
	
	public void show(int i) {
		System.out.println(i);
	}
	public void show(String s) {
		System.out.println(s);
	}
	
	//可变个数形参格式！！！！... 数组格式
	public void show(String ...strs) {
	//	System.out.println(strs);
		for(int i=0;i<strs.length;i++) {
			System.out.println(strs[i]);
		}
		System.out.println("show(String ...strs)");
	}
	public void show(int i,String ...strs) {//最多只能声明一个可变形参
	//	System.out.println(strs);
	
		System.out.println("show(String ...strs)");
	}
	
	

}
