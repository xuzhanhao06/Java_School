package test1;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		int id =1001;
		int[] ids=new int[]{1001,1002,1003};
		String[] names=new String[5];
		names[0]="0��ѡ��";
		names[1]="1��ѡ��";
		System.out.println(names.length);//����
		System.out.println(ids.length);
//		for(int i=0;i<names.length;i++) {//����
//			System.out.println(names[i]);
//		}
		
		/*ѧ���ɼ�����*/
		Scanner scanner=new Scanner(System.in);
		System.out.println("������������");
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
			System.out.println("student:"+i+"��"+level);
		}
		
	}

}
