package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class CreateMeetingsPage {
	
	private WebDriver driver;
	
public	CreateMeetingsPage () {
	
	this.driver=Driver.getDriver();
	PageFactory.initElements(driver, this);
	
 
	
}
@FindBy(xpath="//li[@data-name='Meeting']")
public WebElement clickModuleMeetin;

@FindBy(xpath="//div[@class='header-buttons btn-group pull-right']")
public WebElement clickOnCreateMeeting;

@FindBy(xpath="(//input[@class='main-element form-control'])[1]")
public WebElement Name;

@FindBy(xpath="(//select[@class='form-control main-element'])[1]")
public WebElement planned;

@FindBy(xpath="(//input[@class='main-element form-control'])[2]")
public WebElement DataStart;

@FindBy(xpath="(//input[@class='form-control ui-timepicker-input'])[1]")
public WebElement time;

@FindBy(xpath="//select[@name='duration']")
public WebElement duration;

@FindBy(xpath="(//div[@class='field'])[8]")
public WebElement Description;

@FindBy(xpath="(//select[@class='form-control'])[1]")
public WebElement selectParent;

@FindBy(xpath="//input[@name='dateEnd']")
public WebElement endDate;

@FindBy(xpath="//select[@name='seconds']")
public WebElement Reminders;

@FindBy(xpath="//button[@data-action='addReminder']")
public WebElement clickButton;

@FindBy(xpath="(//button[@data-action='selectLink'])[1]")
public WebElement chooseContactList;

@FindBy(xpath="(//button[@data-action='selectLink'])[4]")
public WebElement selectAdmin;

@FindBy(xpath="//span[@class='select-all-container']")
public WebElement selectName;

@FindBy(xpath=" //button[@class='btn btn-primary']")
public WebElement selectSelect;

@FindBy(xpath="//button[@class='btn btn-primary action']")
public WebElement Save;

@FindBy(xpath="//a[@class='close']")
public WebElement close;

@FindBy(xpath="(//div[text()='Steven Spielberg'])[1]")
public WebElement seeStevenSpielgergText;



}
