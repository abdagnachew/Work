package com.review09.Ab;

	interface ParentInterface {
		  
		  void parentMethod ();
		  
		}

		interface ChildInterface extends ParentInterface {
		  
		  void childMethod();
		  
		}

		public class A implements  ParentInterface, ChildInterface{
			  public void parentMethod () {
			  System.out.println("First");
			  }
			  public void childMethod () {
				  System.out.println("Second");
			  }

			}

			