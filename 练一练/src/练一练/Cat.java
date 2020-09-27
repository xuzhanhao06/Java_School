package 练一练;

import java.util.*;
public class Cat {
	static	 String name;
	static	 int age;
	private static String line;
	 Cat(String Name,int age ){
		this.name=Name;
		this.age=age;	 
	 }

	static void Dog(String a,int b){
		  System.out.println("名字是："+ a+" 年龄是："+b);  
	}
	
	static void show(){
	//	Cat cat=new Cat("Tom",15);
	//	System.out.println(cat.name +"  "+cat.age);
		
		Cat cats[]=new Cat[5];
		cats[4]=new Cat("up",16);
	//	cats[0].name="toil ";
	//	cats[0].age=15;
		
		System.out.println(cats[4].name +cats[4].age);
		System.out.println(cats[0].name +cats[0].age);
		//   Dog(line,45);
		   Dog("Dog1",45);
		   Dog("Dog2",3);
	}
	
 public static void main(String[] args) {
	// System.out.println("输入名字：");
	// Scanner sc=new Scanner(System.in);
	// line=sc.next();
		Cat.show();
	}
 }