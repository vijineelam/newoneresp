package com.testcases.autoit;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Downloading {
	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.gecko.driver", "./Driver//geckodriver.exe");
	DesiredCapabilities capabilities = new DesiredCapabilities();
     capabilities = DesiredCapabilities.firefox();
	 capabilities.setBrowserName("firefox");
	 capabilities.setVersion("45.0.2");
	 capabilities.setPlatform(Platform.ANY);
	 capabilities.setCapability("marionette", false);
	WebDriver driver = new FirefoxDriver(capabilities);
	driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://only-testing-blog.blogspot.in/2014/05/login.html");
	  driver.findElement(By.xpath("//a[contains(.,'Download Text File')]")).click();
	  //Execute Script To Download File.exe file to run AutoIt script. File location = E:\\AutoIT\\
	  Runtime.getRuntime().exec("D:\\autoiot\\downloading.exe");
	  System.out.println("This is systemoutprintln");

}}
