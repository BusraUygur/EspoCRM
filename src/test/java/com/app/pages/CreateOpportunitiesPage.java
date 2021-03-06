package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class CreateOpportunitiesPage {

	private WebDriver driver;

	public CreateOpportunitiesPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	};
	
	@FindBy(xpath="//li[@data-name='Opportunity']")
	public WebElement opportunity;
	
	@FindBy(xpath="//a[@class='btn btn-primary action']")
	public WebElement createOpportunity;
	
	@FindBy(xpath="//input[@name='name']")
	public WebElement name;
	
	@FindBy(xpath="//input[@name='accountName']")
	public WebElement accountName;
	
	@FindBy(xpath="//select[@name='stage']")
	public WebElement stage;
	
	@FindBy(xpath="//option[@value='Negotiation']")
	public WebElement negotiation;
	
	@FindBy(xpath="//input[@name='amount']")
	public WebElement amount;
	
	@FindBy(xpath="//input[@name='probability']")
	public WebElement probability;
	
	@FindBy(xpath="//input[@name='closeDate']")
	public WebElement closeDate;
	
	@FindBy(xpath="//span[@class='month active']")
	public WebElement selectDate;
	
	@FindBy(xpath="//td[@class='today active day']")
	public WebElement selectDay;
	
	@FindBy(xpath="//div[@data-name='contacts']//button[@class='btn btn-default']")
	public WebElement selectButtonForContacts;
	
	@FindBy(xpath="(//input[@ placeholder='Select'])[2]")
	public WebElement selectContacts;
	
	@FindBy(xpath="//select[@name='leadSource']")
	public WebElement leadSource;
	
	@FindBy(xpath="//option[@value='Existing Customer']")
	public WebElement selectLeadSource;
	
	@FindBy(xpath="//textarea[@name='description']")
	public WebElement description;
	
	@FindBy(linkText="Save")
	public WebElement save;
	
	@FindBy(xpath="//a[@id='nav-more-tabs-dropdown']")
	public WebElement dropdownToggle;
	
	@FindBy(xpath="//li[@data-name='Stream']")
	public WebElement stream;
	
	@FindBy(xpath="//a[@title='john']")
	public WebElement personIsInStream;
	
	@FindBy(xpath="//td[@data-name='name']")
	public WebElement checkNameInOpportunies;
	
	@FindBy(xpath="//td[@data-name='account']")
	public WebElement checkAccountInOpportunies;
	
	@FindBy(xpath="//td[@data-name='stage']")
	public WebElement checkStageInOpportunies;
	
	@FindBy(xpath="//td[@data-name='assignedUser']")
	public WebElement checkAssignedUserInOpportunies;
	
	@FindBy(xpath="//td[@data-name='createdAt']")
	public WebElement checkcreatedAtInOpportunies;
	
	@FindBy(xpath="///td[@data-name='amount']")
	public WebElement checkAmountInOpportunies;
	
	
	
	public void click(WebElement element1) {
		element1.click();
	}
	
	public void postNote(WebElement element2, String note) {
		element2.sendKeys(note);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
