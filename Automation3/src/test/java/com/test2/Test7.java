package com.test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test7 {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("test@gmail.com");
		
		WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
		pass.sendKeys("12345");
		
		WebElement btn_login=driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]")); //contains attribute 
		btn_login.click();
		
		//WebElement frogotten=driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")); //contains text
		//frogotten.click();
	}

}
