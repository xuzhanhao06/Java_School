
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IArea sc=new Circ(1);// ����    Circ sc=new Circ(1); ������Java�Ķ�̬
		
		System.out.println("Բ�����"+sc.Area());//Բ�����
		
		Colonna co=new Colonna(3,sc);//Բ�������    sc��Colonna�������������һ��~
		
		System.out.println("Բ�������"+co.Area());
	}

}
