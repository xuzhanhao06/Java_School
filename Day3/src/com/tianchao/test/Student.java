package com.tianchao.test;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stu[] stus=new Stu[20];
		for(int i=0;i<stus.length;i++) {
			stus[i]=new Stu();
			stus[i].number=i+1;
//随机数 a ~ b 公式：int value = （int）(Math.random() * (b - a + 1) + a)
			stus[i].state=(int)(Math.random()*(6-1+1)+1);
			stus[i].score=(int)(Math.random()*(100+1));
		}
		//遍历
		for(int i=0;i<stus.length;i++) {
			System.out.println(stus[i].info());
			//System.out.println(stus[i].number+stus[i].state+stus[i].score);
		}
	}

}
class Stu{
	int number;//学号
	int state;//年级[0,6]
	int score;//[0,100]
	public String info(){
		return "学号："+this.number + "年级："+this.state + "成绩："+this.score;
	}
}


