package com.learn.collections;

import java.util.Arrays;

class Lab852 {
	public static void main(String[] args) {

		int arr[]=new int[]{10,43,23,89,45};
		System.out.println("\n**Natural Order");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i+"\t"+arr[i]);
		}
		System.out.println("\n** Sorted Order");
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i+"\t"+arr[i]);
		}
		
		System.out.println("\n**binarySearch- 47");
		int indx=Arrays.binarySearch(arr, 47);
		System.out.println(indx);//-5
		System.out.println("\n**binarySearch- 23");
		indx=Arrays.binarySearch(arr, 23);
		System.out.println(indx);//1
		System.out.println("\n**equals(int[],int[])");
		int values[]=new int[]{43,23,89,45,10};
		System.out.println(Arrays.equals(arr, values));//false
		int data[]=new int[]{43,23,89,45,10};
		System.out.println(Arrays.equals(values, data));//true
		

	}
}

/*
	
			**Natural Order
			0	10
			1	43
			2	23
			3	89
			4	45
			
			** Sorted Order
			0	10
			1	23
			2	43
			3	45
			4	89
			
			*8binarySearch-47
			-5
			1
			
			**equals(int[],int[])
			false
			true
	
	
 */
