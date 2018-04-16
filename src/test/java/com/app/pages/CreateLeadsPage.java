package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class CreateLeadsPage {

	// private WebDriver driver;

	public CreateLeadsPage() {
		// this.driver = Driver.getDriver();
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//li[@data-name='Lead']")
	public WebElement leads;

	@FindBy(xpath = "//div[@class='header-buttons btn-group pull-right']")
	public WebElement createLead;

	@FindBy(xpath = "//select[@name='salutationName']")
	public WebElement salutationName;

	@FindBy(xpath = "//option[@value='Mrs.']")
	public WebElement salutationOption;

	@FindBy(xpath = "//input[@placeholder='First Name']")
	public WebElement firstName;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	public WebElement lastName;

	@FindBy(xpath = "//input[@name='accountName']")
	public WebElement accountName;

	@FindBy(xpath = "//input[@type='email']")
	public WebElement email;

	@FindBy(xpath = "//div[@class='input-group phone-number-block']//select[@class='form-control']")
	public WebElement mobile;

	@FindBy(xpath = "//option[@value='Office']")
	public WebElement phoneNumber;

	@FindBy(xpath = "//input[@name='title']")
	public WebElement title;

	@FindBy(xpath = "//textarea[@name='addressStreet']")
	public WebElement street;

	@FindBy(xpath = "//input[@name='addressCity']")
	public WebElement city;

	@FindBy(xpath = "//input[@name='addressState']")
	public WebElement state;

	@FindBy(xpath = "//input[@name='addressCountry']")
	public WebElement country;

	@FindBy(xpath = "//input[@name='addressPostalCode']")
	public WebElement postalCode;

	@FindBy(xpath = "//input[@name='website']")
	public WebElement website;

	@FindBy(xpath = "//select[@name='status']")
	public WebElement status;

	@FindBy(xpath = "//option[@value='New']")
	public WebElement newStatus;

	@FindBy(xpath = "//select[@name='source']")
	public WebElement source;

	@FindBy(xpath = "//option[@value='Web Site']")
	public WebElement sourceType;

	@FindBy(xpath = "//input[@name='opportunityAmount']")
	public WebElement opportunityAmount;

	@FindBy(xpath = "//input[@name='campaignName']")
	public WebElement campaign;

	@FindBy(xpath = "//select[@name='industry']")
	public WebElement industry;

	@FindBy(xpath = "//option[@value='Technology']")
	public WebElement technology;

	@FindBy(xpath = "//textarea[@name='description']")
	public WebElement description;

	@FindBy(xpath = "//button[@data-action='save']")
	public WebElement save;

	@FindBy(xpath = "//textarea[@class='note form-control']")
	public WebElement comment;

	@FindBy(xpath = "//button[@class='btn btn-primary post']")
	public WebElement post;

	@FindBy(xpath = "//td[@data-name='name']")
	public WebElement checkName;

	@FindBy(xpath = "//td[@data-name='status']")
	public WebElement checkStatus;

	@FindBy(xpath = "//td[@data-name='emailAddress']")
	public WebElement checkEmail;

	@FindBy(xpath = "//td[@data-name='assignedUser']")
	public WebElement checkAssignedUser;

	@FindBy(xpath = "//td[@data-name='createdAt']")
	public WebElement createdAt;

	@FindBy(xpath = "//a[@id='nav-more-tabs-dropdown']")
	public WebElement dropdownToggle;

	@FindBy(xpath = "//li[@data-name='Stream']")
	public WebElement stream;

	@FindBy(xpath = "//span//p")
	public WebElement postedText;

	@FindBy(xpath = "//a[@class='btn btn-default action']")
	public WebElement convert;

	@FindBy(xpath = "//input[@data-scope='Contact']")
	public WebElement contact;

	@FindBy(xpath = "//button[@data-action='convert']")
	public WebElement secondConvert;

	@FindBy(xpath = "//span[@class='label label-success']")
	public WebElement converted;

	@FindBy(xpath = "(//div[@class='pull-left'])[2]")
	public WebElement leadAfterCreated;

	@FindBy(xpath = "(//div[@data-name='name'])[2]")
	public WebElement showName;

	public void click(WebElement element1) {
		element1.click();
	}

	public void postNote(WebElement element2, String note) {
		element2.sendKeys(note);
	}

}
