package com.tian.java;

public class MethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodTest test=new MethodTest(); //û��static��Ҫʵ���� �����ֱ�ӵ���
		test.show(12);
		test.show("Hello0");
		test.show("Hello0","Hello1");//����ȥ��������ʽ
		System.exit(0);//ֱ���˳����򣡣�����������������
	}
	
	public void show(int i) {
		System.out.println(i);
	}
	public void show(String s) {
		System.out.println(s);
	}
	
	//�ɱ�����βθ�ʽ��������... �����ʽ
	public void show(String ...strs) {
	//	System.out.println(strs);
		for(int i=0;i<strs.length;i++) {
			System.out.println(strs[i]);
		}
		System.out.println("show(String ...strs)");
	}
	public void show(int i,String ...strs) {//���ֻ������һ���ɱ��β�
	//	System.out.println(strs);
	
		System.out.println("show(String ...strs)");
	}
	
	

}
