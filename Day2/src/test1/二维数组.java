package test1;

public class 二维数组 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {1,2,3};//一维数组
		/*静态初始化*/
		int[][] arr1=new int[][] {{1,2,3},{4,5}};
		/*动态态初始化*/
		String[][] arr2=new String[3][2];//行列
		System.out.println(arr1[0][2]);
		System.out.println("--------------------------------");
		//遍历二维数组
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.println(arr1[i][j]);
			}
		}
	}

}
