package P;
interface I{
	void foo();
}
 class B implements I{
	void print1() {
		print2(this);
	}
	public void foo() {
			System.out.println("Hello");
}
	void print2(I i)
	{
		i.foo();
	}
	void print2_this() {
		System.out.println("Surprise");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.print1();
	}

}
