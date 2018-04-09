package com.app.step_definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.app.pages.CreateCasesPage;
import com.app.pages.EspoCRMLoginPage;
import com.app.utilities.ConfigurationReader;
import com.app.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateCasesStepDefinitions {
	
	
	private WebDriver driver = Driver.getDriver();
	EspoCRMLoginPage loginPage = new EspoCRMLoginPage();
	CreateCasesPage casePage=new CreateCasesPage();

	
	
	

	@When("^I click on case$")
	public void i_click_on_case() {
		driver.get(ConfigurationReader.getProperty("url"));
		loginPage.login(ConfigurationReader.getProperty("username"),
				ConfigurationReader.getProperty("password"));
		casePage.Cases.click();
	}

	@When("^I click on create case$")
	public void i_click_on_create_case() {
		casePage.createCase.click();
	   
	}

	@When("^I enter name \"([^\"]*)\"$")
	public void i_enter_name(String arg1) {
		casePage.name.sendKeys("Mohammad14");
	}

	@When("^I Select Priority Normal$")
	public void i_Select_Priority_Normal() throws InterruptedException {
		casePage.status.sendKeys("Closed");
		casePage.priority.sendKeys("Hight");
		casePage.type.sendKeys("Problem");
		casePage.description.sendKeys("He always Dont Know what's Going on, On project :D");
		
		String file="C:\\Users\\Mohammad\\Desktop\\attach.png";
		driver.findElement(By.xpath("//input[@class='file pull-right']")).sendKeys(file);
		
		Thread.sleep(4000);

	
	}

	@When("^Save the case$")
	public void save_the_case() throws InterruptedException {
		casePage.saveButton.click();
		Thread.sleep(4000);
	}
@Then("^Case details page should be displayed$")
	
	public void case_details_page_should_be_displayed() {
		String actualTitle = driver.getTitle();
		String expectTitle = "Mohammad14";
		assertEquals(actualTitle, expectTitle);
	 
	}
@Given("^I post \"([^\"]*)\"$")
public void i_post(String arg1) throws InterruptedException {
	casePage.textArea.sendKeys("Check Post is working");
	casePage.clickPost.click();
	Thread.sleep(4000);
    
}

@When("^post should be displayed$")
public void post_should_be_displayed() {
	assertTrue(casePage.Cases.isDisplayed());

    
}

	

}