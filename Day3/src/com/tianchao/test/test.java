package com.tianchao.test;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] arr=new int[] {43,32,76,-5,10,9};
		/*ц╟ещеепР*/
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
