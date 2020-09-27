
 class Shape {
	protected double a;
	public Shape(double a){	//要被继承的地方！！！！！
		this.a=a;  //要被继承的参数
		//被继承的方法后面都会出现！
		Draw(); 
	}
	void Draw(){
		System.out.println("这是一个形状:"+a);
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
		System.out.println("rec："+a*b);
	}
	
/**********************对方法 Draw()的改写**************************/
/*	void Draw(){
		System.out.println("这是一个形状:"+a+" and "+b);
		System.out.println("rec："+a*b);
	}*/
	
 }
/***********************************************************************/
 
 
 /*	void Draw()
	{
		System.out.println("这是一个长方形");
	}
	void Area(double w,double h)
	{
		this.w=w;
		this.h=h;
		return w *h;
	}
	void show()
	{
		System.out.println("面积"+w *h);
	}*/