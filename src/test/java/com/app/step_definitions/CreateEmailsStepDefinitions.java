package com.app.step_definitions;



import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.app.pages.CreateCasesPage;
import com.app.pages.CreateEmailsPage;
import com.app.pages.EspoCRMLoginPage;
import com.app.utilities.ConfigurationReader;
import com.app.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateEmailsStepDefinitions {

	private WebDriver driver = Driver.getDriver();
	EspoCRMLoginPage loginPage = new EspoCRMLoginPage();
	CreateCasesPage casePage = new CreateCasesPage();
	CreateEmailsPage emailPage = new CreateEmailsPage();

	@Given("^I logged into espoCRM$")
	public void i_logged_into_espoCRM() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(ConfigurationReader.getProperty("url"));
		loginPage.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
	}

	@When("^I click on emails$")
	public void i_click_on_emails() {
		emailPage.email.click();

	}

	@When("^I click on compose$")
	public void i_click_on_compose() {
		emailPage.createEmail.click();
	}

	@When("^I send email$")
	public void i_send_email() {
		emailPage.sendTo.sendKeys("test@cybertekshcool.com");
		emailPage.subject.sendKeys("TestMessage");
		emailPage.body.sendKeys("test");
		emailPage.sendButton.click();
		emailPage.closeButton.click();
		emailPage.sentPage.click();
		

	}

	@Then("^the sent email should be displayed$")
	public void the_sent_email_should_be_displayed() {
		String expected="Zia Miakhel";
		String actual=emailPage.sentEmail.getText().substring(4);
		assertEquals(expected, actual);
		
	}

}
