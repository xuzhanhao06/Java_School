package com.day.java;

public class Person {
	private int age;
	public void setAge(int a) {
		if(a<0||a>130) {
			//throw new RuntimeException("��������ݷǷ���");
			System.out.println("��������ݷǷ���");
			return;
		}
		age=a;
	}
	public int getAge() {
		return age;
	}
}
