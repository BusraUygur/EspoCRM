package com.app.step_definitions;

import static org.testng.Assert.assertEquals;

import com.app.pages.CreateLeadsPage;
import com.app.pages.EspoCRMLoginPage;
import com.app.utilities.ConfigurationReader;
import com.app.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeadsStepDefinitions {

	EspoCRMLoginPage loginPage = new EspoCRMLoginPage();
	CreateLeadsPage leadsPage = new CreateLeadsPage();

	@Given("^I logged into espoCRM$")
	public void i_logged_into_espoCRM() {
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
		loginPage.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
	}

	@When("^I click on Leads$")
	public void i_click_on_Leads() {
		leadsPage.leads.click();
	}

	@When("^I create a new Lead$")
	public void i_create_a_new_Lead() {
		leadsPage.createLead.click();
		leadsPage.firstName.click();
		leadsPage.firstName.sendKeys("Sar");
		leadsPage.lastName.click();
		leadsPage.lastName.sendKeys("Smith");
		leadsPage.save.click();
	}

	@Then("^I should see the lead in the page$")
	public void i_should_see_the_lead_in_the_page() {
		String actual = "Sar";
		String expected = leadsPage.firstName.getText();
		assertEquals(actual, expected);
	}

	@Then("^I should see the Lead information for \"([^\"]*)\"$")
	public void i_should_see_the_Lead_information_for(String arg1) {
		String actual = "Sar Smith";
		String expected = leadsPage.showName.getText();
		assertEquals(actual, expected);
	}

}
