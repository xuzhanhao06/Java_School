/*
 * �쳣��ʹ�ã�
 * 
 * 
 * 
 * 
 * */
public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyStack stack=new MyStack();
		try {
			push(new Object());
			
		}catch(MyStackException e) {
			System.out.print(e.getMessage());
		}
		
	}
	
	public static void push(Object object) throws MyStackException {
		throw new MyStackException("�쳣����test������");//���о��׳��쳣!!!
	}
}

