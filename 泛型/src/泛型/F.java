package 泛型;
class Key<K,T>{
	private K key;
	private T value;
	public void key(K key,T value) {
		this.key=key;
		this.value=value;
	}
	public  K getkey() {
		return this.key;
	}
	public T getvalue() {
		return this.value;
	}
}
public class F {
	public static void main(String[] args) {
		Key<String,String>sc=new Key<String,String>();
		sc.key("计算机", "南师大");
		System.out.println(sc.getvalue()+"里有"+sc.getkey()+"专业");
		
		Key<String,Integer>st=new Key<String,Integer>();
		st.key("计算机li", 2);
		System.out.println(st.getkey()+"里有"+st.getvalue()+"个课程");
		
	}
}
