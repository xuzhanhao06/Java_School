package com.day.java;
/*
 * �Զ�����get Set ������Source -Generate Getters and Setters
 * 
 * �Զ����ɹ�������Source-Generate Constructor using Fild
 * 
 * 
 * 
 * 
 * 
 * */

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new +������  ���ô�������
		//����������ͬ����������
	Person p1=new Person();
	p1.setAge(12);
	System.out.println(p1.getAge());
	
	PP a=new PP();
	PP a0=new PP("һ��");
	}

}
class PP{
	
	public PP() {//Ĭ�Ϲ�����
		System.out.println("Ĭ�Ϲ�����");
	}
	public PP(String str) {//��Ĭ�Ϲ�����
		System.out.println("������"+str);
	}
}