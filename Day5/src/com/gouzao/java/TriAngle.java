package com.gouzao.java;

public class TriAngle {

	private double base;//�ױ߳�
	private double height;//��
	public TriAngle() {
		
	}
	public TriAngle( double b,double h) {
		this();//���ÿղ� ������ ��д��������  this���ܵ����Լ�������
				// this(�β��б�)  ֻ���ڵ�һ��
		base=b;
		height=h;
	}
	
	public void setBase(double b) {
		
		base=b;
	}
	public void setHeight(double h) {
		height=h;
	}
	public double getBase() {
		return base;
	}
	public double getHeight() {
		return height;
	}
	
}
