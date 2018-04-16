package com.app.step_definitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.app.pages.CreateAccountsPage;
import com.app.pages.CreateContactsPage;
import com.app.pages.EspoCRMLoginPage;
import com.app.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateContactsStepDefinitions {

	private WebDriver driver = Driver.getDriver();

	CreateContactsPage createContact = new CreateContactsPage();
	CreateAccountsPage saveContact = new CreateAccountsPage();
	EspoCRMLoginPage loginPage = new EspoCRMLoginPage();

	@Given("^I click on Contacts and Create Contacts$")
	public void i_click_on_Contacts_and_Create_Contacts() throws InterruptedException {
		createContact.contact.click();
		createContact.createContact.click();
		Thread.sleep(4000);
		String actualAccountTitle = driver.getTitle();
		String expectedAccountTitle = "Create Contact";

		assertEquals(actualAccountTitle, expectedAccountTitle);
	}

	@When("^I provide contact details$")
	public void i_provide_contact_details() {
		WebElement list = driver.findElement(By.xpath("//select[@name='salutationName']"));
		Select select = new Select(list);
		select.selectByValue("Mr.");

		createContact.firstName.sendKeys("Ali");
		createContact.lastName.sendKeys("Alex");
		createContact.addEmail.sendKeys("mahmad@cybertekschool.com");

		WebElement list2 = driver.findElement(By.xpath("(//select[@class='form-control'])[2]"));
		Select select2 = new Select(list2);
		select2.selectByValue("Mobile");

		createContact.streetAddress.sendKeys("123 ahmed drive");
		createContact.cityAddress.sendKeys("Lorton");
		createContact.stateAddress.sendKeys("VA");
		createContact.zipCodeAddress.sendKeys("20101");
		createContact.descriptionContacts.sendKeys("This is a test");

	}

	@When("^I click on Save$")
	public void i_click_on_Save() throws InterruptedException {
		saveContact.save();
		Thread.sleep(4000);
		createContact.savePopUp.click();
		Thread.sleep(4000);
	}

	@Then("^I should see contact details on Contacts page$")
	public void i_should_see_contact_details_on_Contacts_page() throws InterruptedException {
		String actualTitleofAccout = driver.getTitle();
		String expectedTitleOfAccountPage = "Ali Alex";
		assertEquals(actualTitleofAccout, expectedTitleOfAccountPage);
		Thread.sleep(4000);
		saveContact.cleanUp();
	}
}
