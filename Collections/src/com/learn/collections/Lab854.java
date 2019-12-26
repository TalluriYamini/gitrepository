package com.learn.collections;

import java.util.Arrays;

class Lab854 {
	public static void main(String[] args) {

		int arr[] = new int[] { 12, 32, 34, 54, 42 };
		System.out.println(Arrays.toString(arr));//[12, 32, 34, 54, 42]
		int darr[][] = { { 10, 20, 30 }, { 32, 34 }, { 101, 909, 404 } };
		System.out.println(darr);//[[I@15db9742
		System.out.println(Arrays.toString(darr));//[[I@6d06d69c, [I@7852e922, [I@4e25154f]
		System.out.println(Arrays.deepToString(darr));//[[10, 20, 30], [32, 34], [101, 909, 404]]

	}
}

/*
				[12, 32, 34, 54, 42]
				[[I@15db9742
				[[I@6d06d69c, [I@7852e922, [I@4e25154f]
				[[10, 20, 30], [32, 34], [101, 909, 404]]
						
						*/