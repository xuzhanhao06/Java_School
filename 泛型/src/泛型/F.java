package ����;
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
		sc.key("�����", "��ʦ��");
		System.out.println(sc.getvalue()+"����"+sc.getkey()+"רҵ");
		
		Key<String,Integer>st=new Key<String,Integer>();
		st.key("�����li", 2);
		System.out.println(st.getkey()+"����"+st.getvalue()+"���γ�");
		
	}
}
