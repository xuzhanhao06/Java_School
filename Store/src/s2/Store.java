package s2;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Hamburger implements Runnable{
	int A=20;
	int B=30;
	int count=1;
	
	public void run() {
		 Lock lock=new ReentrantLock();			
		while(true){	
			lock.lock();
		if(Thread.currentThread().getName().equals("a")){
		
			A+=1;
		   System.out.println("制作完当前汉堡A数量："+A);		     
			try {
				Thread.sleep(3000);	
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			lock.unlock();
			
		}
		else if(Thread.currentThread().getName().equals("b"))
		{
			
			B+=1;
			System.out.println("制作完当前汉堡B数量："+B);			
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
		 lock.unlock();	
		}
		else if(Thread.currentThread().getName().equals("sell")){
			
			A--;
			count++;			
			System.out.println("卖了之后当前汉堡A数量:"+A);		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
				
			if(count%2==0){
				B--;
				System.out.println("卖了之后当前汉堡B数量:"+B);					
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
				
			
			lock.unlock();	
			
		}
		
		
		}
	}
	
}
public class Store {

	public static void main(String[] args) {
		Hamburger store=new Hamburger();
		Thread a=new Thread(store);//厨师a
		a.setName("a");//
		Thread b=new Thread(store);//厨师b
		b.setName("b");//
		Thread seller=new Thread(store);//售货员
		seller.setName("sell");
		
		a.start();
		b.start();
		seller.start();
		
		
		
		
	}

}
