package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class EspoCRMLoginPage {
	
	private WebDriver driver;
	
	public EspoCRMLoginPage() {
		this.driver=Driver.getDriver();
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@id='field-userName']")
	public WebElement username;
	
	@FindBy(xpath="//input[@id='field-password']")
	public WebElement password;
	
	@FindBy(xpath="//button[@id='btn-login']")
	public WebElement login;
	
	public void login(String userName, String pwd) {
		username.sendKeys(userName);
		password.sendKeys(pwd);
		login.click();
	}
	
}


