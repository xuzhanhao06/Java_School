import java.util.Scanner;

public class car {
	protected String color;
	public car(String color){
		this.color=color;
	}
	
	public static void main(String[] args) {
		car all=new car("Rainbow");
		System.out.println("��"+all.color);
		System.out.println("1.������\n2.�ǻ�����");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if(score==1){
			JDC b=new JDC("Black",88.2);
			System.out.println("������b---"+"����"+b.color+"  ��������"+b.water);
			System.out.println("1.����\n2.�ͳ�");
			Scanner sc2 = new Scanner(System.in);
			int score2 = sc.nextInt();
			if(score2==1){
				HUOCar e=new HUOCar("Red",900.77,50000);
				System.out.println("����e---"+"����"+e.color+"  ��������"+e.water+"  ����KG��"+e.kg);
			}else if(score2==2){
				KECar d=new KECar("Yellow",500.6,24);
				System.out.println("�ͳ�d---"+"����"+d.color+"  ��������"+d.water+"  ����������"+d.num);
			}else{
				System.out.println("���������룡");
			}
		}else if(score==2){
			FJDC c=new FJDC("White",100);
			System.out.println("�ǻ�����c---"+"����"+c.color+"  �۸�"+c.price);
			System.out.println("1.������\n2.������");
			Scanner sc3 = new Scanner(System.in);
			int score3 = sc.nextInt();
			if(score3==1){
				HumanCar f=new HumanCar("Green",15,2);
				System.out.println("������---"+"����"+f.color+"  �۸�"+f.price+"  ��Ҫ������"+f.man);
			}else if(score3==2){
				AnimalCar g=new AnimalCar("Blue",30,4);
				System.out.println("������---"+"����"+g.color+"  �۸�"+g.price+"  ��Ҫ������"+g.inhuman);
			}else{
				System.out.println("���������룡");
			}
		}else{
			System.out.println("���������룡");
		}
	}

}
class JDC extends car{
	protected double water;//������
	public JDC(String color,double water){
		super(color);
		this.water=water;
	}
}
class FJDC extends car{
	protected int price;//�۸�
	public FJDC(String color,int price){
		super(color);
		this.price=price;
	}
}
class KECar extends JDC{//�ͳ�
	protected int num;//��������
	public KECar(String color,double water,int num){
		super(color,water);
		this.num=num;
	}
}
class HUOCar extends JDC{//����
	protected int kg;//����
	public HUOCar(String color,double water,int kg){
		super(color,water);
		this.kg=kg;
	}
}
class HumanCar extends FJDC{//������
	int man;//��Ҫ������
	public HumanCar(String color,int price,int man){
		super(color,price);
		this.man=man;
	}
}
class AnimalCar extends FJDC{//������
	int inhuman;//��Ҫ���ٷ���
	public AnimalCar(String color,int price,int inhuman){
		super(color,price);
		this.inhuman=inhuman;
	}
}