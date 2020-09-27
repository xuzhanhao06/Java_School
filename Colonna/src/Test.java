
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IArea sc=new Circ(1);// 等于    Circ sc=new Circ(1); 体现了Java的多态
		
		System.out.println("圆的面积"+sc.Area());//圆的面积
		
		Colonna co=new Colonna(3,sc);//圆柱的体积    sc与Colonna参数定义的类型一致~
		
		System.out.println("圆柱的体积"+co.Area());
	}

}
