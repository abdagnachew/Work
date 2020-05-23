package com.review02;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		int num1;
		int num2;
		char operator;
		int answer;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter first numbere here");
		num1=scan.nextInt();
		
		System.out.println("Enter second number here");
		num2=scan.nextInt();
		
		System.out.println("Enter operator here");
		operator=scan.next().charAt(0);
		
		answer=0;
		
		switch (operator) {
		case '+':
			answer = num1+num2;
			break;
		case '-':
			answer=num1-num2;
			break;
		case '*':
			answer=num1*num2;
			break;
		case '/':
			answer = num1/num2;
			break;
		default:
			System.out.println("Invalid out of range");
		}
		System.out.println("Your answer is " +answer + " the operator used was " + operator)
;	}

}
