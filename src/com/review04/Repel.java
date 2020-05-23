package com.review04;

public class Repel {
			String new_word = "";
		static String alphabetical(String str) {
		String new_word = "";
		char[] x = str.toCharArray();
		new_word += x[0];
		for (int i = 1; i < x.length; i++) {
		if (x[i] > x[i - 1]) {
		new_word = new_word + x[i];
		}
		}
		return new_word;
		}
		//test case below (dont change):
		public static void main(String[] args){
		System.out.println(alphabetical("hello")); //“hlo”
		System.out.println(alphabetical("software"));
		System.out.println(alphabetical("language"));
		}
		}


