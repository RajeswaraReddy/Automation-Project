package com.basics.java;

public class Rectangle {
	
	int length;
	int width;
	
	public void insert(int l,int w){
		
		length=l;
		
		width=w;
	}
	
	public void display(){
		
		System.out.println(length*width);
	}

	public static void main(String[] args) {
		
		Rectangle rect=new Rectangle();
		
		rect.insert(10,20);
		rect.display();
		
	}

}
