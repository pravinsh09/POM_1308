package com.qa_testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa_Pages.homePage;
import com.qa_Pages.loginPage;
import com.qa_Testbase.TestBase;

public class LoginPageTest extends TestBase  {
	
	
	public loginPage loginpg;
	
	
	@BeforeMethod
	public void init(){
		
		loginpg=new loginPage();
	}
	
	
	@Test
	public void Login() throws InterruptedException{
		
		System.out.println("testing1");
		loginpg.login();
	}
	
	
	@AfterMethod
	public void driverClose(){
		
		driver.quit();
	}
	
	

}
