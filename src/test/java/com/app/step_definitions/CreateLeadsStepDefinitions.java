package com.app.step_definitions;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.app.pages.CreateLeadsPage;
import com.app.pages.EspoCRMLoginPage;
import com.app.utilities.ConfigurationReader;
import com.app.utilities.Driver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeadsStepDefinitions {

	private WebDriver driver = Driver.getDriver();
	EspoCRMLoginPage loginPage = new EspoCRMLoginPage();
	CreateLeadsPage leadsPage = new CreateLeadsPage();

	@Given("^I logged into EspoCRM$")
	public void i_logged_into_EspoCRM() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(ConfigurationReader.getProperty("url"));
		loginPage.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
	}

	@When("^I click on Leads$")
	public void i_click_on_Leads() {
		leadsPage.leads.click();
	}

	@When("^I create a new Lead$")
	public void i_create_a_new_Lead(Map<String, String> leads) {
		leadsPage.createLead.click();
		leadsPage.firstName.click();
		leadsPage.firstName.sendKeys(leads.get("Sarah"));
		leadsPage.lastName.click();
		leadsPage.lastName.sendKeys(leads.get("Smith"));
		leadsPage.save.click();
	}

	@Then("^I should see the lead in the page$")
	public void i_should_see_the_lead_in_the_page() {
		String actual = "Sarah";
		String expected = leadsPage.firstName.getText();
		assertEquals(actual, expected);
	}


	
	
	
	
	
	
	
	
	
	
	

}
