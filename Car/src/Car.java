import java.util.*;

/*------------------------------������-------------------------------------*/

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
			String nums;//���ƺ�
			public keche(String Name, String Type, String nums) {
				super(Name, Type);
				this.nums=nums;
				// TODO Auto-generated constructor stub
				
				
			}
			public void Print() 
			{
				System.out.println(Name+"\t"+Type+"\t���ƣ�"+nums);
			}
			
		}	

	class huoche extends JCar
	{
		String nums;//���ƺ�
		public huoche(String Name, String Type, String nums) {
			super(Name, Type);
			this.nums=nums;
			// TODO Auto-generated constructor stub
			
			
		}
		public void Print() 
		{
			System.out.println(Name+"\t"+Type+"\t���ƣ�"+nums);
		}
		
	}			
		
/*-----------------------------�ǻ�����---------------------------------------*/		
				
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
			System.out.println(Name+Type+"\t"+"������"+number);
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
			System.out.println(Name+Type+"\t"+"������"+number);
		}
		
	}
	
/*------------------------------------------------------------------------*/	

	public class Car {
		/*	����Ϊ��						��
						������                          			 �ǻ�����
					�ͳ�		 ����					������		������
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
					System.out.println("1.������\t 2.�ǻ�����");
					Scanner sc=new Scanner(System.in);
					int score=sc.nextInt();				
					if(score==1)
					{
						 JCar jcar =new JCar("����","������");
						 	jcar.Print();	
						 	System.out.println("1.�ͳ�\t 2.����");
							Scanner sc1=new Scanner(System.in);
							int score1=sc.nextInt();
							if(score1==1)
							{
								 keche keche=new keche("��������","�ͳ�","5166");
									keche.Print();
									break;
							}
							else if(score1==2)
							{
								 huoche huoche=new huoche("��������","����","9527");
								 	huoche.Print();	
								 	break;
							}
							else {
								continue;
							}
					}
					else if(score==2)
					{
						 FJCar fcar=new FJCar("����","�ǻ�����");
						 fcar.print();	
						 
						 	System.out.println("1.������ \t 2.������");
							Scanner sc2=new Scanner(System.in);
							int score2=sc.nextInt();
							if(score2==1)
							{
								renli renli=new renli("�ǻ�����:","������","3");
								 renli.print();
								 break;
							}
							else if(score2==2)
							{
								 
								 shouli shouli=new shouli("�ǻ�����:","������","5");
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
			
	//				Car car=new Car("������:");
	//				car.print();		 				
			

		}
