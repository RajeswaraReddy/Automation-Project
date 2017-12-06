package com.basics.java;

import java.util.HashSet;

public class CommonElements {

	public static void main(String[] args) {
		
		String[] st1={"raj","alo","sun","sha","nav"};
		String[] st2={"nav","raj","alo","sun","jag","sri"};
		
		HashSet<String> set=new HashSet<String>();
		
		for(int i=0;i<st1.length;i++){
			
			for(int j=0;j<st2.length;j++){
				
				if(st1[i].equals(st2[j])){
					
					set.add(st1[i]);
					
				}
			}
			
		}
			System.out.println(set);
	}

}
