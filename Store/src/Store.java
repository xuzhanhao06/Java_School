import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Hamburger implements Runnable{

	int A=20, B=30, count=1;	 
	public void run() {
		while(true){	
			
		//	lock.lock();
			Lock lock=new ReentrantLock();
			
		if(Thread.currentThread().getName().equals("a")){	
			lock.lock();
			A++;
		   System.out.println("制作完当前汉堡A数量："+A);		     
			try {
				Thread.sleep(3000);	
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		//	lock.unlock();		
		}
		
		else if(Thread.currentThread().getName().equals("b"))
		{
			lock.lock();
			B++;
			System.out.println("制作完当前汉堡B数量："+B);			
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
		// lock.unlock();	
		}
		
		else if(Thread.currentThread().getName().equals("sell")){
			lock.lock();
			count++;
			if(A>0){
				A--;		
				System.out.println("卖了之后当前汉堡A数量:"+A);		
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
			    }
			}
			else if(A<=0){
			System.out.println("A卖完啦~"+A);		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
		    }
			}
		
			
			if(count%2==0){
				if(B>0) {
				B--;
				System.out.println("卖了之后当前汉堡B数量:"+B);	
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				}
				else if(B<=0){				
					System.out.println("A卖完啦~"+B);	
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
				}
			}	
			//lock.unlock();			
		}
		
		lock.unlock();	
		}//whihle
	}
	
}
public class Store {
	static int temp=1;
	public static void main(String[] args) {
		Hamburger store=new Hamburger();
		Thread a=new Thread(store);//厨师a
		a.setName("a");//
		Thread b=new Thread(store);//厨师b
		b.setName("b");//
		Thread sell=new Thread(store);//售货员
		sell.setName("sell");
	

		a.start();	
			try {
				
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			b.start();		
			try {
					
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			sell.start();		
			try {
					
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
		
		


	
			
/*			if(temp%1==0) {	
				temp++;
				a.start();		
			}
			else if(temp%2==0) {
				temp++;
				b.start();		
			}
			else{	
				temp++;
			sell.start();			
			}*/
		
		
			
			
			
			

		
		
		
		
	}

}
