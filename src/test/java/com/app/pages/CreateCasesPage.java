package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class CreateCasesPage {
	
	private WebDriver driver;

		public CreateCasesPage() {
			this.driver = Driver.getDriver();
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//li[@data-name='Case']")
		public WebElement Cases;
		
		@FindBy(xpath="//a[@class='btn btn-primary action']")
		public WebElement createCase;
		
		
		@FindBy(xpath="//input[@name='name']")
		public WebElement name;
		
		
		@FindBy(xpath="//select[@name='status']")
		public WebElement status;
		
		
		@FindBy(xpath="//select[@name='priority']")
		public WebElement priority;
		
		
		@FindBy(xpath="//select[@name='type']")
		public WebElement type;
		
		@FindBy(xpath="//textarea[@name='description']")
		public WebElement description;
		
		
		@FindBy(xpath="//span[@class='btn btn-default']")
		public WebElement atacheFile;
		//
		@FindBy(xpath="//input[@name='accountName']")
		public WebElement selectAccount;
		
		@FindBy(xpath="(//i[@class='glyphicon glyphicon-arrow-up'])[1]")
		public WebElement accountSelectButton;
		
		@FindBy(xpath="(//div[@class='input-group add-team'])[1]")
		public WebElement contactSelect;
		
		@FindBy(xpath="(//span[@class='glyphicon glyphicon-arrow-up'])[1]")
		public WebElement contactSelectButton;
		
		
		@FindBy(xpath="//input[@name='assignedUserName']")
		public WebElement assignedUser;
		
		@FindBy(xpath="(//i[@class='glyphicon glyphicon-arrow-up'])[2]")
		public WebElement assignedUserButton;
		
		@FindBy(xpath="(//input[@class='main-element form-control'])[5]")
		public WebElement teamsSelect;
		
		@FindBy(xpath="(//span[@class='input-group-btn'])[4]")
		public WebElement teamsSelectButton;
		
		
		
		
		@FindBy(xpath="//button[@data-action='save']")
		public WebElement saveButton;
		
		
		@FindBy(xpath="//textarea[@class='note form-control']")
		public WebElement textArea;
		
		@FindBy(xpath="//button[@class='btn btn-primary post']")
		public WebElement clickPost;

		

}
