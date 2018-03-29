package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class CreateContactsPage {

	private WebDriver driver;

	public CreateContactsPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//li[@data-name='Contact']")
	public WebElement contact;
	
	@FindBy(xpath="//a[@class='btn btn-primary action']")
	public WebElement createContact;
	
	@FindBy(xpath="//select[@name='salutationName']")
	public WebElement salutationNameDropdown;
	
	@FindBy(xpath="//input[@name='firstName']")
	public WebElement firstName;
	
	@FindBy(xpath="//input[@name='lastName']")
	public WebElement lastName;
	
	@FindBy(xpath="(//input[@class='main-element form-control'])[1]")
	public WebElement accountsSelect;
	
	@FindBy(xpath="//input[@class='form-control email-address']")
	public WebElement email;
	
	@FindBy(xpath="//input[@class='form-control phone-number no-margin-shifting']")
	public WebElement phoneTypeSelect;
	
	@FindBy(xpath="//button[@data-action='addEmailAddress']")
	public WebElement addEmail;
	
	@FindBy(xpath="//button[@data-action='addPhoneNumber']")
	public WebElement addPhone;
	
	@FindBy(xpath="//textarea[@name='addressStreet']")
	public WebElement streetAddress;
	
	@FindBy(xpath="//input[@name='addressCity']")
	public WebElement cityAddress;
	
	@FindBy(xpath="//input[@name='addressState']")
	public WebElement stateAddress;
	
	@FindBy(xpath="//input[@name='addressPostalCode']")
	public WebElement zipCodeAddress;
	
	@FindBy(xpath="//input[@name='addressCountry']")
	public WebElement countryAddress;
	
	@FindBy(xpath="//*[@class='main-element form-control auto-height']")
	public WebElement descriptionContacts;
	
	@FindBy(xpath="//button[@class='btn btn-primary action']")
	public WebElement saveContacts;
	
}
