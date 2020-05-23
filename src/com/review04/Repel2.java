package com.review04;

public class Repel2 {
	
	public static int sum2D(int[][]arr1){
		int sum=0;
		for (int row=0;row<arr1.length;row++){
		for (int column=0;column<arr1[row].length;column++){
		sum+=arr1[row][column];
		}
		}
		return sum;
		}
}