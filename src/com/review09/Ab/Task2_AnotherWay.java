package com.review09.Ab;

abstract class Marks1 {

	int m1;
	int m2;
	int m3;
	int m4;
	
Marks1(int m1, int m2, int m3){
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
Marks1(int m1, int m2, int m3, int m4){
	this.m1=m1;
	this.m2=m2;
	this.m3=m3;
	this.m4=m4;
}

public abstract double getPercentage();
}

class StudentA1 extends Marks1 {
	
	StudentA1(int mathMark, int englishMark, int scienceMark) {
		super(mathMark, englishMark, scienceMark);
	}

	@Override
	public double getPercentage() {
		double averagePercentage;
		averagePercentage = ((m1 + m2 + m3) / 3);
		System.out.print("The average percentage for " + 3 + " subjects marks is: ");
		return averagePercentage;
	}
}

class StudentB1 extends Marks1 {
	StudentB1(int mathMark, int englishMark, int scienceMark, int biologyMark) {
		super(mathMark, englishMark, scienceMark, biologyMark);
	}

	@Override
	public double getPercentage() {
		double averagePercentage;
		averagePercentage = ((m1 + m2 + m3 + m4) / 4);
		System.out.print("The average for " + 4 + " subjects marks is: ");
		return averagePercentage;
	}
}

public class Task2_AnotherWay {

	public static void main(String[] args) {
		StudentA1 student1=new StudentA1(80,90,95);
		double averageP=student1.getPercentage();
		System.out.println(averageP+" % ");
		
		System.out.println("===========================");
		
		StudentB1 student2=new StudentB1(90,89,95,90);
		averageP=student2.getPercentage();
		System.out.println(averageP+" %");
	}

}
