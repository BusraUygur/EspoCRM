package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class CreateOverviewTaskPage extends CreateTasksPage {
	
	private WebDriver driver;

	public CreateOverviewTaskPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="(//h4[@class='panel-title'])[1]")
	public WebElement Overview11;
	
	
	

}
