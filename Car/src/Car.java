import java.util.*;

/*------------------------------机动车-------------------------------------*/

	class JCar extends Car
	{	
		String Type;
		public JCar(String Name, String Type) {
		super(Name);
		this.Type=Type;
		// TODO Auto-generated constructor stub
	}
		public void Print() 
		{
			System.out.println(Name+"\t"+Type);
		}
	}	
	
	class keche extends JCar
		{
			String nums;//车牌号
			public keche(String Name, String Type, String nums) {
				super(Name, Type);
				this.nums=nums;
				// TODO Auto-generated constructor stub
				
				
			}
			public void Print() 
			{
				System.out.println(Name+"\t"+Type+"\t车牌："+nums);
			}
			
		}	

	class huoche extends JCar
	{
		String nums;//车牌号
		public huoche(String Name, String Type, String nums) {
			super(Name, Type);
			this.nums=nums;
			// TODO Auto-generated constructor stub
			
			
		}
		public void Print() 
		{
			System.out.println(Name+"\t"+Type+"\t车牌："+nums);
		}
		
	}			
		
/*-----------------------------非机动车---------------------------------------*/		
				
	class FJCar extends Car
	{
		String Type;
		public FJCar(String Name, String Type) {
			super(Name);
			// TODO Auto-generated constructor stub
			this.Type=Type;
		}
		public void print()
		{
			System.out.println(Name+Type+"\t\t");
		}
		
	}
		
	class renli extends FJCar
	{

		String number;
		public renli(String Name, String Type,String number) {
			super(Name, Type);
			// TODO Auto-generated constructor stub
			this.number=number;
		}

		public void print()
		{
			System.out.println(Name+Type+"\t"+"数量："+number);
		}
		
	}
		
	class shouli extends FJCar
	{

		String number;
		public shouli(String Name, String Type,String number) {
			super(Name, Type);
			// TODO Auto-generated constructor stub
			this.number=number;
		}

		public void print()
		{
			System.out.println(Name+Type+"\t"+"数量："+number);
		}
		
	}
	
/*------------------------------------------------------------------------*/	

	public class Car {
		/*	车分为：						车
						机动车                          			 非机动车
					客车		 货车					人力车		兽力车
		*/			
			protected String Name;
	//		protected String Type;
			public Car(String Name)
			{
				this.Name=Name;
	//			this.Type=Type;
			}
			public void print() 
			{
				System.out.println(Name);
			}
						
/*------------------------------------------------------------------------*/	
			
				public static void main(String[] args) {
				while(true) {
					System.out.println("1.机动车\t 2.非机动车");
					Scanner sc=new Scanner(System.in);
					int score=sc.nextInt();				
					if(score==1)
					{
						 JCar jcar =new JCar("车：","机动车");
						 	jcar.Print();	
						 	System.out.println("1.客车\t 2.货车");
							Scanner sc1=new Scanner(System.in);
							int score1=sc.nextInt();
							if(score1==1)
							{
								 keche keche=new keche("机动车：","客车","5166");
									keche.Print();
									break;
							}
							else if(score1==2)
							{
								 huoche huoche=new huoche("机动车：","货车","9527");
								 	huoche.Print();	
								 	break;
							}
							else {
								continue;
							}
					}
					else if(score==2)
					{
						 FJCar fcar=new FJCar("车：","非机动车");
						 fcar.print();	
						 
						 	System.out.println("1.人力车 \t 2.兽力车");
							Scanner sc2=new Scanner(System.in);
							int score2=sc.nextInt();
							if(score2==1)
							{
								renli renli=new renli("非机动车:","人力车","3");
								 renli.print();
								 break;
							}
							else if(score2==2)
							{
								 
								 shouli shouli=new shouli("非机动车:","兽力车","5");
								 shouli.print();
								 break;
			
							}
							else 
								continue;					 			 					 
					}
					else
					{
						continue;
					}			
					
				}					
			}
			
	//				Car car=new Car("车类型:");
	//				car.print();		 				
			

		}
