package com.basics.java;

import java.util.HashSet;


public class FindingDuplicate {

	public static void main(String[] args) {

		String[] sARR={"raj","alo","raj","sun","sha","","sun"};
		
		HashSet<String> set=new HashSet<String>();
		
		for(String hset:sARR){
			
			//if(!set.add(hset))
			{
				
				System.out.println(hset);
			}
		}
		
		}
	}


