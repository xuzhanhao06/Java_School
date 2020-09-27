package com.gouzao.java;

public class TriAngle {

	private double base;//底边长
	private double height;//高
	public TriAngle() {
		
	}
	public TriAngle( double b,double h) {
		this();//调用空参 构造器 的写法！！！  this不能调用自己构造器
				// this(形参列表)  只能在第一行
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
