 interface A {
int a=3;
}
 class B {
int x=1;
}
 class C extends B implements A {
public void px()
{
System.out.println(x+a);
}
public static void main(String args[])
{	
C c=new C();
c.px();
}
}