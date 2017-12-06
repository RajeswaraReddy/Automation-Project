package com.webdriver.basics;

public class ReverseString {

	public static void main(String[] args) {
		
		String s="Rajeswara";
		
		int len=s.length();
		
		System.out.println(len);
		
		String rev="";
		
		for(int i=len-1;i>=0;i--){
			
			rev=rev+s.charAt(i);
				}
		System.out.println(rev);
	
	// one more way
	StringBuffer sb=new StringBuffer("Virender");
	
	System.out.println(sb.reverse());
	
	System.out.println(sb.append("Sehwag"));
	}
}
