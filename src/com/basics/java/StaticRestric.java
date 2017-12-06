package com.basics.java;

public class StaticRestric {
	
void n(){
		
		System.out.println("invoked n");
		//this.m();
	}

	
	void m(){
		
		System.out.println("invoked m");
		this.n();
	}
	
		public static void main(String[] args){
		
	
		StaticRestric res=new StaticRestric();
		
		res.m();
	}


}