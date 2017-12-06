package com.basics.java;

public class RemoveSpaces {

	public static void main(String[] args) {
		
		String name=" Mahanandigari Rajeswara Reddy ";
		
		String withoutSpace=name.replaceAll("\\s","");
		System.out.println(withoutSpace);
	}

}
