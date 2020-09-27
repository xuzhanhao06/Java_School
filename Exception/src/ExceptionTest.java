/*
 * 异常简单使用！
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
		throw new MyStackException("异常出现test！！！");//不行就抛出异常!!!
	}
}

