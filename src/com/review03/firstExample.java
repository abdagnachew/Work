package com.review03;

public class firstExample {
	 
	   protected static String maxLength (String [] arr) {
		   int maxLength=0;
		  String word=null;
	    for(String s: arr ) {
	    	if (s.length() > maxLength) {
	    		maxLength =s.length();
	    				word=s;
	    	}
	    	
	    }
	    return word;
	    
	  }
		
		public static void main(String[] args) {
			String[] arr = {"hey","yolo","hi","this is long"};
			System.out.println(maxLength(arr));
			//should print "this is long"
		}
		
	}