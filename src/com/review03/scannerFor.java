package com.review03;

import java.util.Scanner;

public class scannerFor {

	/*
	 * ask user to enter positive number and add it to the total he should enter =1
	 * to stop. -1 will not be added to the total
	 */
	public static void main(String[] args) {
		
		System.out.println("----------1st way using while-----");

		Scanner input = new Scanner(System.in);
		int total = 0;
		int number;


		System.out.println("Enter a number to stop enter -1");
		 number = input.nextInt();

		while (number != -1) {
			total=total +number;
			number = input.nextInt();

			
		}
		System.out.println("the total is " +total);

}
}
