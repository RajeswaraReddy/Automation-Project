package com.webdriver.basics;

public class JunkRemoval {

	public static void main(String[] args) {

		String name="@!#$@$@!#$Sehwag@#$@#319$%#$%%$^Scorer";
		
		System.out.println(name.replaceAll("[^a-zA-Z0-9]",""));
	}

}
