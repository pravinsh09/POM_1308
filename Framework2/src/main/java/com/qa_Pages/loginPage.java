package com.qa_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa_Testbase.TestBase;

public class loginPage extends TestBase {
	
	
	
	//Initializing the Page Objects:
	
	
	@FindBy(xpath="//input[@name='email']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement login;
	
	public loginPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	public homePage login() throws InterruptedException{
		Thread.sleep(7000);
		System.out.println("login");
		
		username.sendKeys("pravin.sh9@gmail.com");
		password.sendKeys("Jaya*1234");
		login.click();
		return new homePage();
	}
	
	//with no return
	public void login1() throws InterruptedException{
		Thread.sleep(7000);
		System.out.println("login");
		
		username.sendKeys("pravin.sh9@gmail.com");
		password.sendKeys("Jaya*1234");
		login.click();
		
	}
	public void verifyHomepage(){
		
		
	}
	

}
