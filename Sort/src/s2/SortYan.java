package s2;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortYan  {
 
	public static void main(String[] args) {
		
		FanxXing<Integer> f=new FanxXing<Integer>();
		List<Integer> data=new ArrayList<Integer>() ;
		data.add(1);
		data.add(2);
		data.add(7);		
		data.add(4);
		
		f.data(data);
		f.FindMax();
		
		
		
		FanxXing<String> f2=new FanxXing<String>();
		List<String> data2=new ArrayList<String>() ;
		data2.add("啊");
		data2.add("吧");
		data2.add("才");
		data2.add("啊");
		
		f2.data(data2);
		f2.FindMax();
	}
	 

}

class FanxXing<T extends Comparable<T>>{
	private List<T> list= new ArrayList<T>();
	 
	public  void data( List<T> list ){
		this.list=list;		 
	}
	
	public void FindMax(){
		/*T max=list.get(0);
		for(int i=1;i<list.size();i++){
			if(max.compareTo(list.get(i))<0)
				max=list.get(i);
		}
		
		Collections.sort(l,new Comparator<T>() {

			@Override
			public int compare(T arg0, T arg1) {
				
				return arg0.;
			}
			
		});*/
		
		T max = Collections.max(list,new Comparator<T>() {

			@Override
			public int compare(T arg0, T arg1) {
				return arg0.compareTo(arg1);
			}
			
		});
		System.out.println("最大值："+max);
	}
	
	

}
