package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class CreateCallsPage {
	
	
	private WebDriver driver;
	
public	CreateCallsPage  () {
	
	this.driver=Driver.getDriver();
	PageFactory.initElements(driver, this);
		
}

@FindBy(xpath="(//li[@class='not-in-more'])[9]")
public WebElement clickCallModule;

@FindBy(xpath="//a[@class='btn btn-primary action']")
public WebElement CreateCall;


@FindBy(xpath="(//input[@class='main-element form-control'])[1]")
public WebElement Name;

@FindBy(xpath="(//input[@class='main-element form-control'])[2]")
public WebElement DataStart;


@FindBy(xpath="(//input[@class='form-control ui-timepicker-input'])[1]")
public WebElement time;

@FindBy(xpath="//select[@name='duration']")
public WebElement duration;

@FindBy(xpath="//select[@name='direction']")
public WebElement outBound;

@FindBy(xpath="(//button[@data-action='selectLink'])[4]")
public WebElement user;

@FindBy(xpath="//a[@title='Zach Chrahmer']")
public WebElement checkZachChrahmerIsVisible;

}
