package com.review09.Ab;

interface Shape {
	void calculateArea(double x);
	
	void calculatePerimeter(double x);
}

class Circle implements Shape{
	@Override
	public void calculateArea(double x) {
		System.out.println("area of circle is " + (3.14 * x * x));
		
	}
	
	@Override
	public void calculatePerimeter(double x) {
		System.out.println("Pertimeter of circle is " + (2 * 3.14 * x));
	}
}
	
class Square implements Shape{
	public void calculateArea(double x) {
		System.out.println("area of circle is " + (x * x));
	}
	
	public void calculatePerimeter(double x) {
		System.out.println("Pertimeter of circle is " + (4 * x));
	}
}
	public  class Task1 {
		public static void main(String[] args) {
			Shape circle=new Circle();		
			circle.calculateArea(10);		
			circle.calculatePerimeter(20);				
			
			
			Shape square=new Square();		
			square.calculateArea(10);		
			square.calculatePerimeter(20);	
			}
		}


	

	
	


	
	

