package com.basics.java;

public class SuperClass1 extends SuperClass{
	
	String color="Black";
	
	public void color(){
		
		System.out.println(color);
		
		System.out.println(super.color);
	}
	
	public void eat(){
		
		System.out.println("eating bread");
	}

	public void bark(){
		
		System.out.println("has been barking");
	}
	
	public void work(){
		
		super.eat();
		bark();
	}
	public static void main(String[] args) {
		
		
		SuperClass1 one=new SuperClass1();
		
		one.color();
		
		one.work();
		
	
	}

}
