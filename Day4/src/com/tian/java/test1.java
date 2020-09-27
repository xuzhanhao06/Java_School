package com.tian.java;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1 tt=new test1();
		int sum=tt.getSum(100);
		System.out.println(sum);
		
		test1 ff=new test1();
		int fff=ff.f(10);
		System.out.println(fff);
	}
	public int getSum(int n) {
		if(n==1) {
			return 1;
		}else {
			return n+getSum(n-1);
		}
	}
	
	public int f(int n) {
		if(n==0) {
			return 1;
		}else if(n==1) {
			return 4;
		}else {
			return 2*f(n-1)+f(n-2);
		}
	}
	
}
