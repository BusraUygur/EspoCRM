package com.app.step_definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.app.pages.CreateCalendarPage;
import com.app.pages.CreateOverviewTaskPage;
import com.app.pages.CreateTasksPage;
import com.app.pages.EspoCRMLoginPage;
import com.app.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateTasksStepDefinitions {

	EspoCRMLoginPage loginPage = new EspoCRMLoginPage();
	CreateTasksPage taskPage = new CreateTasksPage();
	CreateOverviewTaskPage taskOverview = new CreateOverviewTaskPage();

	Map<String, String> taskMap = new HashMap<>();
	Map<String, String> overviewMap = new HashMap<>();

	@Given("^I click on Tasks$")
	public void i_click_on_Tasks() {
		taskPage.Tasks.click();
	}

	@Given("^I click on Create Task$")
	public void i_click_on_Create_Task() {
		taskPage.createTask.click();
	}

	@Given("^Set name as \"([^\"]*)\"$")
	public void set_name_as(String taskName) {
		taskPage.nameTask.sendKeys(taskName);
		taskMap.put("Name", taskName);
	}

	@Given("^Set status as \"([^\"]*)\"$")
	public void set_status_as(String taskStatus) {
		Select statusSelect = new Select(taskPage.statusTask);
		statusSelect.selectByVisibleText(taskStatus);
		taskMap.put("Status", taskStatus);
	}

	@Given("^Date Start is todays date$")
	public void date_Start_is_todays_date() {
		LocalDate today = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyy");
		String todaysDay = today.format(formatter).toString();

		taskPage.dateStart.sendKeys(todaysDay + Keys.TAB);
		taskMap.put("Start Date", todaysDay);
	}

	@Given("^Date Due is (\\d+) days after todays date$")
	public void date_Due_is_days_after_todays_date(int deadLine) {
		String dueDate = LocalDate.now().plusDays(deadLine).format(DateTimeFormatter.ofPattern("MM/dd/yyyy"))
				.toString();

		taskPage.dateDue.sendKeys(dueDate);
		taskMap.put("Due Date", dueDate);
	}

	@Given("^Set \"([^\"]*)\" priority$")
	public void set_priority(String taskPriority) {
		Select selectPriority = new Select(taskPage.taskPriority);
		selectPriority.selectByVisibleText(taskPriority);

		taskMap.put("Priority", taskPriority);
	}

	@Given("^Set description as \"([^\"]*)\"$")
	public void set_description_as(String description) {
		taskPage.taskDescription.sendKeys(description);

		taskMap.put("Description", description);
	}

	@Given("^I save task$")
	public void i_save_task() {
		taskPage.saveButton.click();
	}

	@Then("^I should see task's details on Task page$")
	public void i_should_see_task_s_details_on_Task_page() {

		assertTrue(taskOverview.Overview11.isDisplayed());

		overviewMap.put("Name", taskOverview.nameTask.getAttribute("value"));
		overviewMap.put("Status", taskOverview.statusTask.getAttribute("value"));
		overviewMap.put("Start Date", taskOverview.dateStart.getAttribute("value"));
		overviewMap.put("Due Date", taskOverview.dateDue.getAttribute("value"));
		overviewMap.put("Priority", taskOverview.taskPriority.getAttribute("value"));
		overviewMap.put("Description", taskOverview.taskDescription.getAttribute("value"));

		System.out.println(taskMap);
		System.out.println(overviewMap);
	}

	@Then("^Data should match with created task data$")
	public void data_should_match_with_created_task_data() {
		assertEquals(taskMap, overviewMap);
	}

}