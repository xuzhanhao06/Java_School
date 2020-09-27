import java.util.*;

interface Vege{
	void Vege(double a);
}
interface Fruit{
	void Fruit(double a);
}

interface Meat{
	void Meat(double a);
}
interface Water{
	void Water(double a);
}

interface Oil{
	void Oil(double a);
}

interface Salt{
	void Salt(double a);
}
interface Sugar{
	void Sugar(double a);
}
interface Agin{
	void Agin(double a);
}

	public class Cook implements Vege, Fruit,Water,Salt,Sugar,Meat,Agin,Oil{
		public void Vege(double a)	{
			System.out.println(a);
		}

		@Override
		public void Fruit(double a) {
			System.out.println(a);
			
		}

		@Override
		public void Water(double a) {
			System.out.println(a);
			
		}

		@Override
		public void Salt(double a) {
			// TODO Auto-generated method stub
			System.out.println(a);
		}

		@Override
		public void Sugar(double a) {
			// TODO Auto-generated method stub
			System.out.println(a);
		}

		@Override
		public void Meat(double a) {
			// TODO Auto-generated method stub
			System.out.println(a);		
		}
		@Override
		public void Agin(double a) {
			System.out.println(a);			
		}
		@Override
		public void Oil(double a) {
			System.out.println(a);		
		}
		Random r=new Random();
		void Show(){	
			 
			 Vege(1.1);			
			 Fruit(5.0);
			 Meat(5.2);
			 Water(1.3);
			 Oil(2.1);
			 Salt(2.2);
			 Sugar(2.1);
			 Agin(3);		
		}
	
	}
