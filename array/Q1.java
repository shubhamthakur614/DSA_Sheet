package com.array;

import java.util.Arrays;

//Reverse the array
//Input  : arr[] = {1, 2, 3}
//Output : arr[] = {3, 2, 1}

public class Q1 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		System.out.println(Arrays.toString(arr));
		int[] reverseArray = reverseArray(arr, arr.length);
		System.out.println(Arrays.toString(reverseArray));

	}

	public static int[] reverseArray(int[] arr, int length) {
		int first = 0;
		int last = length - 1;
		if (length <= 1) {
			return arr;
		} else {

			while (first < last) {
				int temp = arr[first];
				arr[first] = arr[last];
				arr[last] = temp;
				first++;
				last--;
			}
			return arr;
		}

	}

}