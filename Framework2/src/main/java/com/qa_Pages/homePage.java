package com.qa_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa_Testbase.TestBase;

public class homePage extends TestBase{
	
	
	
	public  homePage(){
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='item']//span[text()='Contacts']")
	WebElement contactsLink;
	
	public contactsPage clickContacts(){
		
		contactsLink.click();
		return new contactsPage();
	}
	
	public void clickDeals(){
		
		
	}

}
