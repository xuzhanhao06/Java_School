package test1;

public class ��ά���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {1,2,3};//һά����
		/*��̬��ʼ��*/
		int[][] arr1=new int[][] {{1,2,3},{4,5}};
		/*��̬̬��ʼ��*/
		String[][] arr2=new String[3][2];//����
		System.out.println(arr1[0][2]);
		System.out.println("--------------------------------");
		//������ά����
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.println(arr1[i][j]);
			}
		}
	}

}
