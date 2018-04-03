package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class CreateEmailsPage {
	
	private WebDriver driver;

	public CreateEmailsPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//li[@data-name='Email']")
	public WebElement email;
	
	@FindBy (linkText="Compose")
	public WebElement createEmail;
	
	@FindBy (xpath="//div[@data-name='to']//input")
	public WebElement sendTo;
	
	@FindBy (xpath="//div[@data-name='subject']//input")
	public WebElement subject;
	
	@FindBy (xpath="//div[@class='note-editable panel-body']")
	public WebElement body;
	
	@FindBy (xpath="//button[@data-name='send']")
	public WebElement sendButton;
	
	@FindBy (xpath="//a[@class='close']")
	public WebElement closeButton;
	
	@FindBy (xpath="(//a[@data-id='sent'])[2]")
	public WebElement sentPage;
	
	@FindBy (xpath="(//td[@data-name='personStringData'])[1]")
	public WebElement sentEmail;
	
	
	
	
	
	
	

}
