package com.array;

public class Test {
	public static void main(String[] args) {
		int[] arr = { 1, 7, 3, 6, 5, 6 };
		System.out.println(pivotIndex(arr));
	}

	public static int pivotIndex(int[] nums) {
		int n = nums.length;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += nums[i];
		}
		int leftSum = 0;
		for (int i = 0; i < n; i++) {
			if (leftSum == sum - leftSum - nums[i]) {
				return i;
			}
			leftSum += nums[i];
		}
		return -1;
	}

}
