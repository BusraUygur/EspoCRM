package com.app.step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

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

	
	
	@Given("^I logged into espoCRM$")
	public void i_logged_into_espoCRM() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(ConfigurationReader.getProperty("url"));
		loginPage.login(ConfigurationReader.getProperty("username"),
				ConfigurationReader.getProperty("password"));
	}

	@When("^I click on case$")
	public void i_click_on_case() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on create case$")
	public void i_click_on_create_case() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I enter name \"([^\"]*)\"$")
	public void i_enter_name(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I Select Priority Normal$")
	public void i_Select_Priority_Normal() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Save the case$")
	public void save_the_case() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
@Then("^Case details page should be displayed$")
	
	public void case_details_page_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	

}