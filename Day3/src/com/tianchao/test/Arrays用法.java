package com.tianchao.test;

import java.util.Arrays;

public class Arrays用法 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1=new int[]{1,2,3,4,};
		int[] arr2=new int[]{5,1,2,3,4,};
		boolean isEquals=Arrays.equals(arr1, arr2);//判断是否相等
		System.out.println(isEquals);
		
		System.out.println(Arrays.toString(arr1));//遍历 [1, 2, 3, 4]
		
		Arrays.fill(arr1, 10);//替换
		System.out.println(Arrays.toString(arr1));//[10, 10, 10, 10]
		
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3=new int[]{10,9,-50,62,66,35,100};
		int index=Arrays.binarySearch(arr3, 62);//找下标
		System.out.println(index);
		
	}

}
