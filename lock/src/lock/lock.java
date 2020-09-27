package lock;
import java.util.Scanner;
public class lock {
	static Scanner input=new Scanner(System.in);
	static String newInput,Password;
	final static String Ret="dadada";//预留信息
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Password="1111";
		System.out.print("交出密码：");
		newInput=input.next();//只读取输入直到空格
		Enter(newInput,Password);
	}
	static void Enter(String newInput,String Password)
	{
		if(newInput.equals(Password)){
			System.out.print("正确登入  ");		 
		}
		else {
			System.out.print("错误错误！！找回密码（y/n）推出（quit）");
			String changeInput=input.next();//输入
			if(changeInput.equals("y")){
				Reserve();
			}
			else if(changeInput.equals("quit")){
				System.out.print("已退出~");
				System.exit(0);
			}
			else {
				System.out.print("重新输入：");
				newInput=input.next();
				Enter(newInput,Password);
			}
		}
	}
	static void Ret(String newReserve)
	{
		if(newInput.length()!=4){
			System.out.print("密码为4位，重新输入：");
			newInput=input.next();
			Ret(newInput);
		}
		else{
			Password=newInput;
			System.out.print("密码重置完成！请输入密码");
			newInput=input.next();
			Enter(newInput,Password);
			
		}
		}
	static void Reserve(){
		System.out.print("请输入预留信息：");
		newInput=input.next();
		if(newInput.equals(Ret)){
			System.out.print("请输入新密码：");
			newInput=input.next();
		Ret(newInput);
		}
		else{
			System.out.print("信息错误，重输：");
			Reserve();
		}
		
	}
}
