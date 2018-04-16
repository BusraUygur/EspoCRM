package com.app.step_definitions;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.app.pages.CreateCallsPage;
import com.app.pages.CreateMeetingsPage;
import com.app.pages.EspoCRMLoginPage;
import com.app.utilities.ConfigurationReader;
import com.app.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateCallsStepDefinitions {
	private WebDriver driver = Driver.getDriver();
	
	CreateCallsPage createCalls = new CreateCallsPage ();
	EspoCRMLoginPage loginPage2 = new EspoCRMLoginPage();
	
	CreateMeetingsPage meetingPage = new CreateMeetingsPage();
	
	
	
   
	@Given("^I logged in into suiteCRM SecondTime$")
	public void i_logged_in_into_suiteCRM_SecondTime() throws InterruptedException {	   
		driver.get(ConfigurationReader.getProperty("url"));
		String username = ConfigurationReader.getProperty("username");
		String password = ConfigurationReader.getProperty("password");
		loginPage2.login(username, password);

	}
	
	@Given("^I open the Call module page and create Call contact$")
	public void i_open_the_Call_module_page_and_create_Call_contact() {
		
		createCalls.clickCallModule.click();
		createCalls.CreateCall.click();
		createCalls.Name.clear();
		createCalls.Name.sendKeys("Zach Chrahmer");
	   
	}

	@Given("^I write Date start contacts$")
	public void i_write_Date_start_contacts() {
		
		LocalDate today = LocalDate.now();
		today = today.plusDays(3);

		DateTimeFormatter fromatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String todaysDate = today.format(fromatter);

		createCalls.DataStart.clear();
		createCalls.DataStart.sendKeys(todaysDate);

	}

	@When("^I write duration of the call time$")
	public void i_write_duration_of_the_call_time() {
		
	Select select1 = new Select(createCalls.duration);
    select1.selectByVisibleText("30m");

	 
	}

	@Then("^I write the purpose of Call$")
	public void i_write_the_purpose_of_Call() {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(meetingPage.Description);
		actions.click();
		actions.sendKeys("Organize the seminary");
		actions.build().perform();
	
		
		
	   
	}


	@When("^I write diraction inbound$")
	public void i_write_diraction_inbound() {
		createCalls.outBound.click();
	   
	 
	}

	@When("^I shoose (\\d+) users contact$")
	public void i_shoose_users_contact(int arg1) {
	   
	  
	   meetingPage.chooseContactList.click();
	   createCalls.user.click();
	   meetingPage.selectName.click();
	   meetingPage.selectSelect.click();
	   meetingPage.close.click();
	  
	}


	@Then("^click on the Save button of Call$")
	public void click_on_the_Save_button_of_Call() {
		meetingPage.Save.click();

	}

	@Then("^I should see contact infromation of \"([^\"]*)\"$")
	public void i_should_see_contact_infromation_of(String arg1) {
		createCalls.checkZachChrahmerIsVisible.isDisplayed();
	 
	}


}