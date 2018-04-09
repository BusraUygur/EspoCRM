package com.app.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class CreateAccountsPage {

	private WebDriver driver;

	public CreateAccountsPage() {
		this.driver = Driver.getDriver(); 
		PageFactory.initElements(driver, this); 

	} 
	
	@FindBy(xpath="//li[@data-name='Account']")
	public WebElement account;
	
	@FindBy(xpath="//a[@class='btn btn-primary action']")
	public WebElement createAccount;
	
	@FindBy(xpath="(//input[@class='main-element form-control'])[1]")
	public WebElement name;
	
	@FindBy(xpath="//input[@class='form-control email-address']")
	public WebElement email;
	
	@FindBy(xpath="//span[@class='glyphicon glyphicon-ban-circle text-muted']")
	public WebElement mutedButton;
	
	@FindBy(xpath="(//*[@class='input-group phone-number-block']/span[@class='input-group-btn'])[1]")
	public WebElement phoneType;
	
	@FindBy(xpath="//input[@class='form-control phone-number no-margin-shifting']")
	public WebElement phoneEntryText;
	
	@FindBy(xpath="(//input[@class='main-element form-control'])[2]")
	public WebElement website;
	
	@FindBy(xpath="//*[@name='billingAddressStreet']")
	public WebElement billingStreet;
	
	@FindBy(xpath="//*[@name='shippingAddressStreet']")
	public WebElement shippingStreet;
	
	@FindBy(xpath="//input[@name='billingAddressCity']")
	public WebElement billingCity;
	
	@FindBy(xpath="//input[@name='shippingAddressCity']")
	public WebElement shippingCity;
	
	@FindBy(xpath="//input[@name='billingAddressState']")
	public WebElement billingState;
	
	@FindBy(xpath="//input[@name='shippingAddressState']")
	public WebElement shippingState;
	
	@FindBy(xpath="//input[@name='billingAddressPostalCode']")
	public WebElement billingZipCode;
	
	@FindBy(xpath="//input[@name='shippingAddressPostalCode']")
	public WebElement shippingZipCode;
	
	@FindBy(xpath="//input[@name='billingAddressCountry']")
	public WebElement billingCountry;
	
	@FindBy(xpath="//input[@name='shippingAddressCountry']")
	public WebElement shippingCountry;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-sm']")
	public WebElement copyBilling;
	
	@FindBy(xpath="(//select[@class='form-control main-element'])[1]")
	public WebElement type;
	
	@FindBy(xpath="(//select[@class='form-control main-element'])[2]")
	public WebElement industry;

	@FindBy(xpath="//input[@name='sicCode']")
	public WebElement sicCode;
	
	@FindBy(xpath="//*[@class='main-element form-control auto-height']")
	public WebElement descriptionAccounts;
	
	@FindBy(xpath="//button[@class='btn btn-primary action']")
	
	public WebElement saveConfirmation;
	
	@FindBy (xpath="//input[@class='select-all']")
	public WebElement checkbox;
	
	@FindBy (xpath="(//button[@data-toggle='dropdown'])[3]")
	public WebElement actionsButton;
	
	@FindBy (xpath="//a[@data-action='remove']")
	public WebElement Remove;
	
	@FindBy (xpath="//button[@data-name='confirm']")
	public WebElement confirmRemove;
	
	public void save() {
		saveConfirmation.click();
		try {
			Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			saveConfirmation.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	public void cleanUp() {
		account.click();
		checkbox.click();
		actionsButton.click();
		Remove.click();
		confirmRemove.click();
		
	}

}
