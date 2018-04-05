package com.app.step_definitions;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.app.pages.CreateAccountsPage;
import com.app.pages.EspoCRMLoginPage;
import com.app.utilities.BrowserUtils;
import com.app.utilities.ConfigurationReader;
import com.app.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateAccountsStepDefinitions {

	private WebDriver driver = Driver.getDriver();

	CreateAccountsPage createAccount = new CreateAccountsPage();
	EspoCRMLoginPage loginPage = new EspoCRMLoginPage();

	@Given("^I logged into EspoCRM$")
	public void i_logged_into_EspoCRM() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(ConfigurationReader.getProperty("url"));
		loginPage.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
	}

	@Given("^I clicked on create account$")
	public void i_clicked_on_create_account() throws InterruptedException {
		createAccount.account.click();
		createAccount.createAccount.click();
		Thread.sleep(4000);
		String actualAccountTitle = driver.getTitle();
		String expectedAccountTitle = "Create Account";

		assertEquals(actualAccountTitle, expectedAccountTitle);
	}

	@When("^I provide accounts details$")
	public void i_provide_accounts_details() {
		createAccount.name.sendKeys("Mikez");
		createAccount.email.sendKeys("mike@gmail.com");
		
		WebElement list = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select select = new Select(list);
		select.selectByValue("Mobile");
		
		createAccount.phoneEntryText.sendKeys("703-777-8888");
		createAccount.website.sendKeys("www.mike.com");
		
		createAccount.billingStreet.sendKeys("123 Mike Drive");
		createAccount.billingCity.sendKeys("Jamestown");
		createAccount.billingState.sendKeys("VA");
		createAccount.billingZipCode.sendKeys("20111");
		createAccount.billingCountry.sendKeys("USA");
		createAccount.copyBilling.click();
		
		JavascriptExecutor jsEX = (JavascriptExecutor) driver;
		jsEX.executeScript("window.scrollBy(0,400);");
		
		WebElement list2 = driver.findElement(By.xpath("(//select[@class='form-control main-element'])[1]"));
		Select select2 = new Select(list2);
		select2.selectByValue("Customer");
		
		createAccount.sicCode.sendKeys("233");
	
		WebElement list3 = driver.findElement(By.xpath("(//select[@class='form-control main-element'])[1]"));
		Select select3 = new Select(list3);
		select3.selectByValue("Customer");
		
				
		WebElement list4 = driver.findElement(By.xpath("(//select[@class='form-control main-element'])[2]"));
		Select select4 = new Select(list4);
		select4.selectByValue("Computer");
		
		createAccount.descriptionAccounts.sendKeys("This is Mike customer for computers");
		
	}
	
	 @When("^I save account$")
	 public void i_save_account() throws InterruptedException {
		 createAccount.save();
		 Thread.sleep(2000);
		 
	 }
	
	 @Then("^I should see account details on Accounts page$")
	 public void i_should_see_account_details_on_Accounts_page() throws InterruptedException {
		 String actualTitleofAccout = driver.getTitle();
		 String expectedTitleOfAccountPage = "Mikez";
		 
		 assertEquals(actualTitleofAccout, expectedTitleOfAccountPage);
		 
		 Thread.sleep(2000);
		
		createAccount.cleanUp();
		 
		 	 
	 }
}
