package test1;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x=true;
		boolean y=false;
		short z=42;
		//if(y==true)
//		if(z++==42)System.out.println("z="+z);
		if((z++==42)&&(y=true))System.out.println("z="+z++); //���43  ����z=44��
//		if(++z==45){
//			System.out.println("z�����45"+z);
//		}
		if((x=false)||(++z==45))z++;
		System.out.println("z="+z);

	}

}
