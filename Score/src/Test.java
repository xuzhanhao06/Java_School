
public class Test {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] a={9.5,
				9.7,
				9.8,
				9.7,
				9.8,
				9.5,
				9.6,
				9.7,
				9.9,
				9.8};
		double b[ ]= {89, 
					  56, 
					  78, 
					  90,
					  100,
					  77,
					  56, 
					  45, 
					  36,
					  79, 
					  98};
		
		
		IComputeAverage sc;
		 sc=new Gymnastics();
		 System.out.println("avg:"+sc.getAverage(a));
		 
		 IComputeAverage st;
		 st=new Student();
		System.out.println("学生："+st.getAverage(b));

		 Student s=new Student();
		 System.out.println("学生："+s.getAverage(b));
	}

}
