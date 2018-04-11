package com.app.step_definitions;

import static org.testng.Assert.assertEquals;

import com.app.pages.CreateOpportunitiesPage;
import com.app.pages.EspoCRMLoginPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateOpportunitiesStepDefinitions {

	EspoCRMLoginPage loginPage = new EspoCRMLoginPage();
	CreateOpportunitiesPage opportunitiesPage = new CreateOpportunitiesPage();
	
	@When("^I click on Opportunities$")
	public void i_click_on_Opportunities() {
		opportunitiesPage.opportunity.click();
	}

	@When("^I create a new Opportunity$")
	public void i_create_a_new_Opportunity() {
		opportunitiesPage.createOpportunity.click();
		opportunitiesPage.name.click();
		opportunitiesPage.name.sendKeys("Sarah");
		opportunitiesPage.amount.click();
		opportunitiesPage.amount.sendKeys("100000");
		opportunitiesPage.closeDate.click();
		opportunitiesPage.selectDay.click();
		opportunitiesPage.save.click();
	}

	@When("^I write a comment on Stream$")
	public void i_write_a_comment_on_Stream() {
		opportunitiesPage.stream.click();
		opportunitiesPage.stream.sendKeys("comment");
		opportunitiesPage.postComment.click();
	}

	@Then("^I should see the comment in the page$")
	public void i_should_see_the_comment_in_the_page() {
        String expected = opportunitiesPage.showComment.getText();
        String actual = "comment";
        System.out.println(expected);
        System.out.println(actual);
        assertEquals(actual, expected);
	}

	
	@Then("^I should see the Opportunity information for new Opportunity$")
	public void i_should_see_the_Opportunity_information_for_new_Opportunity() {
		String expected = opportunitiesPage.checkNameInOpportunies.getText();
        String actual = "Sarah";
        assertEquals(actual, expected);
	}
	
	
	
	
	
	
	

}
