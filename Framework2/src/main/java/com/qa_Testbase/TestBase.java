package com.qa_Testbase;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class TestBase {
	
	
	public static WebDriver driver;
	
	@Parameters({"browser","baseURL"})
	@BeforeClass
	
	
		//opening the browser
	    public void openBrowser(String browser,String baseURL) {
	        System.out.println("Test one suite param is: " + baseURL+"--"+browser);
	        if(browser.equals("Mozilla"))
			 {
				 	driver = new FirefoxDriver();
				 	driver.get(baseURL);
			 }
			 else  if (browser.equals("IE"))
			 {	
				DesiredCapabilities capabilities = new DesiredCapabilities();
				 driver = new InternetExplorerDriver();	
				 driver.get(baseURL);
			 }
			 else if  (browser.equalsIgnoreCase("CHROME"))
			 {	 
				 System.out.println(browser);
				 System.setProperty("webdriver.chrome.driver","E:\\project\\Driver\\driver1\\chromedriver.exe");
				 DesiredCapabilities capabilities = DesiredCapabilities.chrome();
					ChromeOptions options = new ChromeOptions();
					capabilities.setCapability(ChromeOptions.CAPABILITY, options);

					//driver = new ChromeDriver(capabilities);
				 
				 driver= new ChromeDriver();
				 driver.get(baseURL);
				 driver.manage().window().maximize();
				 driver.manage().deleteAllCookies();
				 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				 	 
			 }
		}
	
	
	

}
