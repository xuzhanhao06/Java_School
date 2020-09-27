package test1;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		int id =1001;
		int[] ids=new int[]{1001,1002,1003};
		String[] names=new String[5];
		names[0]="0号选手";
		names[1]="1号选手";
		System.out.println(names.length);//长度
		System.out.println(ids.length);
//		for(int i=0;i<names.length;i++) {//遍历
//			System.out.println(names[i]);
//		}
		
		/*学生成绩评定*/
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入人数：");
		int number= scanner.nextInt();
		int[] scores=new int[number];
		for(int i=0;i<scores.length;i++) {
			scores[i]=scanner.nextInt();
		}
		int maxScore=0;
		for(int i=0;i<scores.length;i++) {
			if(maxScore<scores[i]) {
				maxScore=scores[i];
			}
		}
		char level;
		for(int i=0;i<scores.length;i++) {
			if(maxScore -scores[i]<=10) {
				level='A';
			}else if(maxScore -scores[i]<=20) {
				level='B';
			}else if(maxScore -scores[i]<=30) {
				level='C';
			}else {
				level='D';
			}
			System.out.println("student:"+i+"号"+level);
		}
		
	}

}
