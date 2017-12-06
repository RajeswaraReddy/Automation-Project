package com.webdriver.basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\Rajeswara.Reddy\\Downloads\\geckodriver.exe");
		 
		 driver=new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 
		 driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//*[@id='content']/p[4]/button")).click();
		 
		String mainWindow=driver.getWindowHandle();
		 
		 for(String childWindow:driver.getWindowHandles()){
			 
			 if(!mainWindow.equals(mainWindow)){
				 driver.switchTo().window(childWindow);
			 }
		 }
		 
		 /*Set<String> s1=driver.getWindowHandles();
		 
		 Iterator<String> i1=s1.iterator();
		 
		 while(i1.hasNext()){
			 
			 String childWindow=i1.next();
			 
			 driver.switchTo().window(childWindow);
		 }
*/		 
				WebDriverWait wait=new WebDriverWait(driver,50);
		 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='page']/div[1]/div[1]/div[2]/div/a[1]/svg")));
			
		 WebElement element=driver.findElement(By.xpath("//*[@id='page']/div[1]/div[1]/div[2]/div/a[1]/svg"));

		 element.sendKeys("Rajeswara");
		/* Select select=new Select(element);
		 
		 System.out.println(select.getFirstSelectedOption());
*/	}

}
