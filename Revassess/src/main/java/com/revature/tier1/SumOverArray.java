package com.revature.tier1;

public class SumOverArray {

	public static int IterateAndSum(int[] arr) {
		if (arr == null){
			return 0;
		}
		else {
			int total = 0;
			for (int i : arr) {
				total = total + i;
			}
			return total;
		}
	}

	public static void main(String[] args){
		int arr[] = null;

		System.out.println(SumOverArray.IterateAndSum(arr));

	}

}
