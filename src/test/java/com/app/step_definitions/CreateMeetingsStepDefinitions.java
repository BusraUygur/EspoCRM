package com.app.step_definitions;

import static org.testng.Assert.assertTrue;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.app.pages.CreateMeetingsPage;
import com.app.pages.EspoCRMLoginPage;
import com.app.utilities.ConfigurationReader;
import com.app.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateMeetingsStepDefinitions {
	private WebDriver driver = Driver.getDriver();

	CreateMeetingsPage meetingPage = new CreateMeetingsPage();
	EspoCRMLoginPage loginPage1 = new EspoCRMLoginPage();

	@Given("^I logged in into suiteCRM$")
	public void i_logged_in_into_suiteCRM() throws InterruptedException {

		
	   
		driver.get(ConfigurationReader.getProperty("url"));
		String username = ConfigurationReader.getProperty("username");
		String password = ConfigurationReader.getProperty("password");
		loginPage1.login(username, password);

	}

	@Given("^I open the meeting module page$")
	public void i_open_the_meeting_module_page() {
		meetingPage.clickModuleMeetin.click();
		meetingPage.clickOnCreateMeeting.click();

	}

	@Given("^I enter the full name \"([^\"]*)\"$")
	public void i_enter_the_full_name(String name) {
		meetingPage.Name.sendKeys("Steven Spielberg");

	}

	@Given("^I check the status and make it planned$")
	public void i_check_the_status_and_make_it_planned() {
		meetingPage.planned.click();

	}

	@Given("^I write meeting Date start$")
	public void i_write_meeting_Date_start() {

		LocalDate today = LocalDate.now();
		today = today.plusDays(3);

		DateTimeFormatter fromatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String todaysDate = today.format(fromatter);

		meetingPage.DataStart.clear();
		meetingPage.DataStart.sendKeys(todaysDate);


	}

	@When("^I write duration of the meeting$")
	public void i_write_duration_of_the_meeting() {
		Select select = new Select(meetingPage.duration);
		select.selectByVisibleText("3h");

	}

	@Then("^I write the description of the meeting$")
	public void i_write_the_description_of_the_meeting() {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(meetingPage.Description);
		actions.click();
		actions.sendKeys("Ceminar will be about success story of the Cybertek school");
		actions.build().perform();

	

	}

	@When("^I open parent field and choose Lead option$")
	public void i_open_parent_field_and_choose_Lead_option() {
		Select select = new Select(meetingPage.selectParent);
		select.selectByValue("Lead");

	}

	@When("^I write Date End of the meeting$")
	public void i_write_Date_End_of_the_meeting() {
		
		
		
		
		LocalDate today = LocalDate.now();

		today = today.plusDays(4);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyy");
		String todaysDate = today.format(formatter);
		
		Actions actions = new Actions(driver);
	    
		actions.moveToElement(meetingPage.endDate);
		actions.click();
	    meetingPage.endDate.clear();
		actions.sendKeys(todaysDate);
		actions.build().perform();
		
	
	

	}

	@When("^I write Remind me before (\\d+) minutes$")
	public void i_write_Remind_me_before_minutes(int reminders) {
		 
		meetingPage.clickButton.click();
		
		Select select = new Select(meetingPage.Reminders);
		select.selectByVisibleText("30m before");
	    meetingPage.chooseContactList.click();
	    meetingPage.selectAdmin.click();
	    meetingPage.selectName.click();
	    meetingPage.selectSelect.click();
	    
	    
	    
	}

	@When("^click on the save button$")
	public void click_on_the_save_button() {
		meetingPage.close.click();
		meetingPage.Save.click();


	}

	@Then("^I should see contact infromation for \"([^\"]*)\"$")
	public void i_should_see_contact_infromation_for(String Steven) {
		assertTrue(meetingPage.seeStevenSpielgergText.isDisplayed());

	}
}
