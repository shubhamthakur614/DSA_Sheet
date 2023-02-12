package com.searching.binarysearch;

/*
 * Binary Search
 * int[] arr={2,4,6,7,8,13,45}; key=13
 * o/p= 5
 *  
 */
public class Q1 {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 7, 8, 13, 45 };
		int key = 13;
		System.out.println(binarySearch(arr, arr.length, key));

	}

	public static int binarySearch(int[] arr, int size, int key) {

		int start = 0;
		int end = size - 1;
//		int mid = (start + end) / 2;
		int mid = start + (end - start) / 2;
		while (start <= end) {
			// if key match with mid element then return mid index
			if (arr[mid] == key) {
				return mid;
			}
			// if key is greater than mid then go to right side of array
			else if (key > arr[mid]) {
				start = mid + 1;
			}

			// if key is less than mid element then go to left side
			else {
				end = mid - 1;
			}
			mid = start + (end - start) / 2;
		}

		// if element is not present in the array return -1;
		return -1;
	}

}
