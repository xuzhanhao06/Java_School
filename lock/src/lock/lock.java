package lock;
import java.util.Scanner;
public class lock {
	static Scanner input=new Scanner(System.in);
	static String newInput,Password;
	final static String Ret="dadada";//Ԥ����Ϣ
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Password="1111";
		System.out.print("�������룺");
		newInput=input.next();//ֻ��ȡ����ֱ���ո�
		Enter(newInput,Password);
	}
	static void Enter(String newInput,String Password)
	{
		if(newInput.equals(Password)){
			System.out.print("��ȷ����  ");		 
		}
		else {
			System.out.print("������󣡣��һ����루y/n���Ƴ���quit��");
			String changeInput=input.next();//����
			if(changeInput.equals("y")){
				Reserve();
			}
			else if(changeInput.equals("quit")){
				System.out.print("���˳�~");
				System.exit(0);
			}
			else {
				System.out.print("�������룺");
				newInput=input.next();
				Enter(newInput,Password);
			}
		}
	}
	static void Ret(String newReserve)
	{
		if(newInput.length()!=4){
			System.out.print("����Ϊ4λ���������룺");
			newInput=input.next();
			Ret(newInput);
		}
		else{
			Password=newInput;
			System.out.print("����������ɣ�����������");
			newInput=input.next();
			Enter(newInput,Password);
			
		}
		}
	static void Reserve(){
		System.out.print("������Ԥ����Ϣ��");
		newInput=input.next();
		if(newInput.equals(Ret)){
			System.out.print("�����������룺");
			newInput=input.next();
		Ret(newInput);
		}
		else{
			System.out.print("��Ϣ�������䣺");
			Reserve();
		}
		
	}
}
