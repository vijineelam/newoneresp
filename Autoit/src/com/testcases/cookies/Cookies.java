package com.testcases.cookies;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {
public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
	
		 WebDriver driver = new ChromeDriver();
		
		 driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");
		 driver.findElement(By.name("username")).sendKeys("abc123");							
	        driver.findElement(By.name("password")).sendKeys("123xyz");							
	        driver.findElement(By.name("submit")).click();
	        File file=new File("cookies.data");
	        try
	        {
	        	file.delete();
	        	file.createNewFile();
	        	FileWriter fw=new FileWriter(file);
	        	BufferedWriter bw=new BufferedWriter(fw);
	        	for(Cookie ck:driver.manage().getCookies())
	        	{
	        		bw.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()
	        				+";"+ck.getExpiry()+";"+ck.isSecure()));
	        		bw.newLine();
	        	}
	        	bw.close();
	        	fw.close();
	        }

	        catch(Exception e)
	        {
	        	System.out.println(e);
	        }
}}
