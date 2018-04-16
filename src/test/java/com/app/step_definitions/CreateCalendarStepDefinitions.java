package com.app.step_definitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.app.pages.CreateCalendarPage;
import com.app.pages.CreateCasesPage;
import com.app.pages.CreateEmailsPage;
import com.app.pages.EspoCRMLoginPage;
import com.app.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateCalendarStepDefinitions {
	
	private WebDriver driver = Driver.getDriver();
	EspoCRMLoginPage loginPage = new EspoCRMLoginPage();
	CreateCalendarPage calendarPage=new CreateCalendarPage();
	
	@Given("^I click on Calendar$")
	public void i_click_on_Calendar() {
		calendarPage.Calendar.click();
		
	}

	@Given("^I click on current date$")
	public void i_click_on_current_date() {
		calendarPage.CurrentDate.click();
	}

	@When("^I provide meeting details$")
	public void i_provide_meeting_details() {
		calendarPage.nameField.sendKeys("Final Meeting");
		calendarPage.dateStart.click();
		calendarPage.April16th.click();
		calendarPage.timeStart.clear();
		calendarPage.timeStart.sendKeys("05:00 pm");
		calendarPage.bodyMeeting.sendKeys("Meeting regarding Phase 3 presentation and results of project");
	}

	@When("^I save meeting$")
	public void i_save_meeting() {
	    calendarPage.saveButton.click();
	}

	@When("^I click on Meetings$")
	public void i_click_on_Meetings() throws InterruptedException {
		Thread.sleep(2000);
	    calendarPage.Meeting.click();
	}

	@Then("^I should see meeting details on Meetings page$")
	public void i_should_see_meeting_details_on_Meetings_page() {
	    calendarPage.finalMeetingLink.click();
	    String actual=calendarPage.description.getText();
	    String expected="Meeting regarding Phase 3 presentation and results of project";
	    
	    assertEquals(actual, expected);
	}

}
