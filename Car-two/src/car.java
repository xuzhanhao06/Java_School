import java.util.Scanner;

public class car {
	protected String color;
	public car(String color){
		this.color=color;
	}
	
	public static void main(String[] args) {
		car all=new car("Rainbow");
		System.out.println("车"+all.color);
		System.out.println("1.机动车\n2.非机动车");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if(score==1){
			JDC b=new JDC("Black",88.2);
			System.out.println("机动车b---"+"车身："+b.color+"  耗油量："+b.water);
			System.out.println("1.货车\n2.客车");
			Scanner sc2 = new Scanner(System.in);
			int score2 = sc.nextInt();
			if(score2==1){
				HUOCar e=new HUOCar("Red",900.77,50000);
				System.out.println("货车e---"+"车身："+e.color+"  耗油量："+e.water+"  承载KG："+e.kg);
			}else if(score2==2){
				KECar d=new KECar("Yellow",500.6,24);
				System.out.println("客车d---"+"车身："+d.color+"  耗油量："+d.water+"  承载人数："+d.num);
			}else{
				System.out.println("请重新输入！");
			}
		}else if(score==2){
			FJDC c=new FJDC("White",100);
			System.out.println("非机动车c---"+"车身："+c.color+"  价格"+c.price);
			System.out.println("1.人力车\n2.兽力车");
			Scanner sc3 = new Scanner(System.in);
			int score3 = sc.nextInt();
			if(score3==1){
				HumanCar f=new HumanCar("Green",15,2);
				System.out.println("人力车---"+"车身："+f.color+"  价格："+f.price+"  需要人数："+f.man);
			}else if(score3==2){
				AnimalCar g=new AnimalCar("Blue",30,4);
				System.out.println("兽力车---"+"车身："+g.color+"  价格："+g.price+"  需要人数："+g.inhuman);
			}else{
				System.out.println("请重新输入！");
			}
		}else{
			System.out.println("请重新输入！");
		}
	}

}
class JDC extends car{
	protected double water;//耗油量
	public JDC(String color,double water){
		super(color);
		this.water=water;
	}
}
class FJDC extends car{
	protected int price;//价格
	public FJDC(String color,int price){
		super(color);
		this.price=price;
	}
}
class KECar extends JDC{//客车
	protected int num;//承载人数
	public KECar(String color,double water,int num){
		super(color,water);
		this.num=num;
	}
}
class HUOCar extends JDC{//货车
	protected int kg;//承重
	public HUOCar(String color,double water,int kg){
		super(color,water);
		this.kg=kg;
	}
}
class HumanCar extends FJDC{//人力车
	int man;//需要多少人
	public HumanCar(String color,int price,int man){
		super(color,price);
		this.man=man;
	}
}
class AnimalCar extends FJDC{//兽力车
	int inhuman;//需要多少非人
	public AnimalCar(String color,int price,int inhuman){
		super(color,price);
		this.inhuman=inhuman;
	}
}