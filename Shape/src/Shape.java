
 class Shape {
	protected double a;
	public Shape(double a){	//Ҫ���̳еĵط�����������
		this.a=a;  //Ҫ���̳еĲ���
		//���̳еķ������涼����֣�
		Draw(); 
	}
	void Draw(){
		System.out.println("����һ����״:"+a);
	}
}
 class Rec extends Shape {
	 protected double b,s;
	public Rec(double a,double b){
		super(a);	
		this.b=b;
		Show();
	 //   Draw();
	}
	
	void Show(){
		System.out.println("rec��"+a*b);
	}
	
/**********************�Է��� Draw()�ĸ�д**************************/
/*	void Draw(){
		System.out.println("����һ����״:"+a+" and "+b);
		System.out.println("rec��"+a*b);
	}*/
	
 }
/***********************************************************************/
 
 
 /*	void Draw()
	{
		System.out.println("����һ��������");
	}
	void Area(double w,double h)
	{
		this.w=w;
		this.h=h;
		return w *h;
	}
	void show()
	{
		System.out.println("���"+w *h);
	}*/