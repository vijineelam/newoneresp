package com.testcases.autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
	
		 WebDriver driver = new ChromeDriver();
		
		 driver.get("http://toolsqa.wpengine.com/automation-practice-form");
		
		driver.findElement(By.id("photo")).click();
		 Runtime.getRuntime().exec("D:\\autoiot\\uploading.exe");
		 
		 //driver.close();
		
	}

}
