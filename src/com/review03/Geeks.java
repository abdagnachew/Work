package com.review03;

public class Geeks {
	
	/*
	 * Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell. 
	Define common behavior within and some fields in parent class and override some of the methods in child classes
	Define some methods specific to child classes
	Create objects of child classes and store them into array. Loop through each object and execute available methods.
	 */
		

	static int batch; 
	   static String name; 
	   static int year;
	   static String lastDayOfClass;
	    public Geeks() {  
	    } 
	   public Geeks (String name, int batch, String lastDayOfClass, int year){
	       // System.out.println(schoolName +""+ batch +""+ lastDayOfClass +""+ year);
	   }
	
	    public static void main (String[] args) 
	    { 
	        // this would invoke default constructor. 
	        //Geeks geek1 = new Geeks(); 
	  
	        // Default constructor provides the default 
	        // values to the object like 0, null 
	        System.out.println(Geeks.name +" "+ Geeks.year +" "+ Geeks.batch +" "+ Geeks.lastDayOfClass); 
	        System.out.println("Syntax" +" "+ 6 +" "+ "07/30/2020" +" "+ 2020);
	    } 
	} 
