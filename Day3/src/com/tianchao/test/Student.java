package com.tianchao.test;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stu[] stus=new Stu[20];
		for(int i=0;i<stus.length;i++) {
			stus[i]=new Stu();
			stus[i].number=i+1;
//����� a ~ b ��ʽ��int value = ��int��(Math.random() * (b - a + 1) + a)
			stus[i].state=(int)(Math.random()*(6-1+1)+1);
			stus[i].score=(int)(Math.random()*(100+1));
		}
		//����
		for(int i=0;i<stus.length;i++) {
			System.out.println(stus[i].info());
			//System.out.println(stus[i].number+stus[i].state+stus[i].score);
		}
	}

}
class Stu{
	int number;//ѧ��
	int state;//�꼶[0,6]
	int score;//[0,100]
	public String info(){
		return "ѧ�ţ�"+this.number + "�꼶��"+this.state + "�ɼ���"+this.score;
	}
}


