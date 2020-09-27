package 整除;

//找被3 5 7整除的数
import java.util.Scanner;
public class zhengze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int a=input.nextInt(); //nextInt()在读取完输入后把光标放在读取数据的同一行，该数据的后面。
		int b=input.nextInt();

		if(a>b)
		{	System.out.print("输入错误");
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
