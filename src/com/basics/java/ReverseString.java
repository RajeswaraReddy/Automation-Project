package com.basics.java;

public class ReverseString {

	public static void main(String[] args) {
		
		String s="Rajeswara Reddy";
		
		StringBuffer sb=new StringBuffer(s);
		
		System.out.println(sb.reverse());
		
		char[] strArray=s.toCharArray();
		
		for(int i=strArray.length-1;i>=0;--i){
			
			System.out.print(strArray[i]);
		}

	}

}
