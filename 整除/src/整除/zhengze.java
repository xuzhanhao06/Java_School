package ����;

//�ұ�3 5 7��������
import java.util.Scanner;
public class zhengze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int a=input.nextInt(); //nextInt()�ڶ�ȡ�������ѹ����ڶ�ȡ���ݵ�ͬһ�У������ݵĺ��档
		int b=input.nextInt();

		if(a>b)
		{	System.out.print("�������");
			return;
		}
		 else
		{
			for(int i=a;i<=b;i++)
			{
				if(i%3==0 && i%5==0 && i%7==0)
					System.out.print(i + " ");
			}
		}
	}	
}
