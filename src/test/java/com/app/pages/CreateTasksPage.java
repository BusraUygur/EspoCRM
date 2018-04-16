package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class CreateTasksPage {
	
	private WebDriver driver;

	public CreateTasksPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//li[@data-name='Task']")
	public WebElement Tasks;
	
	@FindBy (xpath="//a[@data-action='create']")
	public WebElement createTask;
	
	@FindBy (xpath="//input[@name='name']")
	public WebElement nameTask;
	
	@FindBy (xpath="//select[@name='status']")
	public WebElement statusTask;
	
	@FindBy (xpath="//input[@name='dateStart']")
	public WebElement dateStart;
	
	@FindBy (xpath="//input[@name='dateEnd']")
	public WebElement dateDue;
	
	@FindBy (xpath="//select[@name='priority']")
	public WebElement taskPriority;
	
	@FindBy (xpath="//textarea[@name='description']")
	public WebElement taskDescription;
	
	@FindBy (xpath="//button[@data-action='save']")
	public WebElement saveButton;
	
	
	
	
	
	
	
	

}
