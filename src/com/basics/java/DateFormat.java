package com.basics.java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) {

		Date date=new Date();
		
		System.out.println(date);
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("MMM y dd");
		
		System.out.println(dateFormat.format(date));
		
		
		
	}

}
