package P2;

abstract class MineBase {
	abstract void amethod();
	static int i;
}

public abstract class Mine extends MineBase{
	public static void main(String [] args) {
		int[] ar= new int[5];
		for(int i=0;i<ar.length;i++)
			System.out.println(ar[i]);
	}
}