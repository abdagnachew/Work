package com.review02;

import java.util.Scanner;

public class MestedIfRichBoy {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Are you a boy or a girl?");
		String boyGirl = input.nextLine();
		
		System.out.println("Are you rich true/false?? ");
		boolean rich = input.nextBoolean();
		
		System.out.println("Your are a " + boyGirl + " and you are rich: " + rich);

		if (boyGirl.equals("boy") && rich) {
			System.out.println("cool");
			if (rich) { // rich boy
				System.out.println("Buy a ferrari.");

			} else { // poor boy
				System.out.println("Play sports ");
			}

		} else if (boyGirl.equals("girl")) { // girl
			if (rich) { // rich girl
				System.out.println("Buy Gucci ");
			} else {
				System.out.println("Read a book");
			}

		} else {
			System.out.println("You entered a wrong choice");
		}
		System.out.println("we are done");
	}

}
