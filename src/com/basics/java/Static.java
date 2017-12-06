package com.basics.java;

public class Static {
	
	String name;
	int age;
	static String company="DGSL";
	
	public Static(String n,int a){
		
		name=n;
		age=a;
	}
	
	public static void change(){
		
		company="ABIT";
		
	}
	
	public void display(){
		
		System.out.println(name+" "+age+" "+company);
	}

	public static void main(String[] args) {
		
		Static.change();
		Static stat1=new Static("Rajeswara", 26);
		stat1.display();
		Static stat2=new Static("Alok",25);
		stat2.display();
		
		

	}

}
