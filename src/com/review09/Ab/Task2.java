package com.review09.Ab;

abstract class Marks {
	public abstract double getPercentage();
}

class StudentA extends Marks {
	int m1, m2, m3;
	StudentA(int m1, int m2, int m3) {
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	public double getPercentage() {
		return (m1 + m2 + m3) / 3;
	}
}

	class StudentB extends Marks {
		int m1, m2, m3, m4;

		StudentB(int m1, int m2, int m3, int m4) {
			this.m1 = m1;
			this.m2 = m2;
			this.m3 = m3;
			this.m4 = m4;
		}

		public double getPercentage() {
			return (m1 + m2 + m3 + m4) / 3;
		}
	}

	public class Task2 {

		public static void main(String[] args) {
			Marks obj1=new StudentA(90, 80, 100);
			Marks obj2=new StudentB(100, 100, 92, 84);
			
			System.out.println(obj1.getPercentage());
			System.out.println(obj2.getPercentage());
		}
	}

