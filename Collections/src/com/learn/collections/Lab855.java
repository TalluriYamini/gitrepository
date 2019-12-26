package com.learn.collections;

import java.util.Arrays;

class Lab855 {
	public static void main(String[] args) {

		int arr[] = new int[] { 12, 32, 34};
		System.out.println("Len: "+arr.length);//	Len: 3
		System.out.println(Arrays.toString(arr));//[12, 32, 34]
		arr=Arrays.copyOf(arr, 5);
		System.out.println("Len: "+arr.length);//Len: 5
		System.out.println(Arrays.toString(arr));//[12, 32, 34, 0, 0]
	
	}
}

/*
						Len: 3
						[12, 32, 34]
						Len: 5
						[12, 32, 34, 0, 0]
						
						
*/