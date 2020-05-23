package com.review02;

import java.util.*;

public class CollectionIntro {
	
	public static void main(String[] args) {
		List<String> africa = new LinkedList<>();
		africa.add("Tunisia");
		africa.add("Morocco");
		africa.add("Kenya");
		africa.add("Algeria");
		africa.add(2, "Egypt");
		
		List <String> africa2  = new ArrayList<String>(africa);
		System.out.println(africa2);
		
		List<String> africa3 = new ArrayList<String>();
		africa.addAll(africa);
		System.out.println(africa3);
	}
	}

