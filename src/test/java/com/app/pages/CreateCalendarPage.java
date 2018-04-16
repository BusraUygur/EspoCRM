package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class CreateCalendarPage {
	
	private WebDriver driver;

	public CreateCalendarPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//li[@data-name='Calendar']")
	public WebElement Calendar;
	
	@FindBy (xpath="//li[@data-name='Meeting']")
	public WebElement Meeting;
	
	@FindBy (xpath="//tr[@data-time='12:00:00']")
	public WebElement CurrentDate;
	
	@FindBy (xpath="//input[@name='name']")
	public WebElement nameField;
	
	@FindBy (xpath="//input[@name='dateStart']")
	public WebElement dateStart;
	
	@FindBy (xpath="//input[@name='dateStart-time']")
	public WebElement timeStart;
	
	@FindBy (xpath="(//div[@class='datepicker-days']//td[@class='day'])[15]")
	public WebElement April16th;
	
	@FindBy (xpath="//textarea[@name='description']")
	public WebElement bodyMeeting;
	
	@FindBy (xpath="//button[@data-name='save']")
	public WebElement saveButton;
	
	@FindBy (xpath="(//table[@class='table']//td[@data-name='dateStart'])[1]")
	public WebElement meetingTimeInfo;
	
	@FindBy (linkText="Final Meeting")
	public WebElement finalMeetingLink;
	
	@FindBy (xpath="//div[@data-name='description']//p")
	public WebElement description;
	
	
	
	
	
	

}
