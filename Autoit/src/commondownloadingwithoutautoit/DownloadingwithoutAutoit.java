package commondownloadingwithoutautoit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DownloadingwithoutAutoit {
	public static void main(String[] args) throws InterruptedException 
		{
	
	WebDriver driver;
	//DesiredCapabilities capabilities = new DesiredCapabilities();
	DesiredCapabilities capabilities=DesiredCapabilities.firefox();
    capabilities = DesiredCapabilities.firefox();
	 capabilities.setBrowserName("firefox");
	 capabilities.setVersion("45.0.2");
	 capabilities.setPlatform(Platform.ANY);
	 capabilities.setCapability("marionette", false);
	FirefoxProfile profile=new FirefoxProfile();
	profile.setPreference("browser.download.dir", "D:\\images");
	profile.setPreference("browser.download.folderList", 2);
	profile.setPreference("browser.helperApps.neverAsk.openFile",
			"text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
		    //"application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;");
	profile.setPreference("browser.helperApps.neverAsk.saveToDisk", 
			"text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
		    //"application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;");
	profile.setPreference( "browser.download.manager.showWhenStarting", false );
	profile.setPreference( "pdfjs.disabled", true );
	profile.setPreference("browser.helperApps.alwaysAsk.force", false);
	profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
	profile.setPreference("browser.download.manager.focusWhenStarting", false);
	profile.setPreference("browser.download.manager.useWindow", false);
	profile.setPreference("browser.download.manager.showAlertOnComplete", false);
	profile.setPreference("browser.download.manager.closeWhenDone", false);
	System.setProperty("webdriver.gecko.driver", "./Driver//geckodriver.exe");
	capabilities.setCapability(FirefoxDriver.PROFILE, profile);
	 driver =  new FirefoxDriver(capabilities);
	driver.get("http://toolsqa.com/automation-practice-form/");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,1000)");
	driver.findElement(By.linkText("Test File to Download")).click();
	Thread.sleep(5000);
	//driver.close();
	

}
	}
