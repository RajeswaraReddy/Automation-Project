package com.webdriver.basics;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InterviewQs {
	
 WebDriver driver;
 
 public void dimension(){
	 
	 System.setProperty("webdriver.gecko.driver","C:\\Users\\Rajeswara.Reddy\\Downloads\\geckodriver.exe");
	 
	 driver=new FirefoxDriver();
	 
	 driver.get("http://freecrm.com");
	 
	 driver.manage().window().maximize();
	 
	 Dimension dimen=driver.findElement(By.xpath("//*[@id='loginForm']/div/input[1]")).getSize();
	 
	 System.out.println("width of element"+" "+dimen.width);
	 System.out.println("height of element"+" "+dimen.height);
 }
 
 public void encodedecode(){
	 
	 byte[] bytesEncoded=Base64.encodeBase64("Rajeswara".getBytes());
	 System.out.println("encoded value is :" + new String(bytesEncoded));
	 
	 byte[] bytesDecoded=Base64.decodeBase64(bytesEncoded);
	 System.out.println("decoded value is :"+ new String(bytesDecoded));
	 
 }
 
 public static void main(String args[]){
	 
	 InterviewQs qs=new InterviewQs();
	 
	 //qs.dimension();
	 
	 qs.encodedecode();
 }
 
 

}
