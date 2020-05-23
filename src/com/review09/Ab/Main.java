package com.review09.Ab;

public class Main extends EncapsulationDemo {
	  public static void main(String[]args){
		  EncapsulationDemo obj = new EncapsulationDemo();
		  String empName="Mario";
		  int empAge=32;
		  obj.setName("Mario");
		  obj.setAge(32);
		  System.out.println("Name is " + obj.getName());
		  System.out.println("Age is " + obj.getAge());

	    
	  }
}