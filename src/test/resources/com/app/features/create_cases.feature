Feature: Creating case
@abc
Scenario: create a case
Given I logged into espoCRM
When I click on case
And I click on create case
And I enter name "Mohammad"
And I Select Priority Normal
And Save the case
Then Case details page should be displayed


@pop 
Scenario: Post a note
Given I logged into espoCRM
When I click on case
Then I click on create case
And I enter name "Mohammad"
And I Select Priority Normal
And Save the case
Then I post "Check Post is working"
And post should be displayed