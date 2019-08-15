package com.qa_testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa_Pages.homePage;
import com.qa_Pages.loginPage;
import com.qa_Testbase.TestBase;

public class HomePageTest extends TestBase {
	
	
	
	public loginPage loginpg;
	public homePage homepg ;
	
	@BeforeMethod
	public void init() throws InterruptedException{
		
		loginpg = new loginPage();
		homepg = new homePage();
		homepg=loginpg.login();
		//below is another way by just creating object of page
		//loginpg.login1();
		
	}
	
	
	@Test()
	public void verifyClickonContactlink(){
		
		homepg.clickContacts();
		
	}
	
	

}
