package com.review09.Ab;

public abstract class Parent {
	
String teaType;

public Parent (String teaType){
	this.teaType=teaType;
}
public abstract void addSugar();
}


abstract class LemonTea extends Parent{
	
	LemonTea(String teaType) {
		super(teaType);
		
	}
	@Override
	public void addSugar() {
		System.out.println("For Lemon Tea we need 2 spoons of sugar");
	}
}

class ChaiTea extends LemonTea{
	ChaiTea(String teaType) {
		super(teaType);
	}
	@Override
	public void addSugar() {
		System.out.println("For Chai Tea we need 1 spoons of sugar");
	}
		
}
