Feature: Creating leads

  Background: Given I logged into espoCRM

  @leads1
  Scenario: Create a lead
    When I click on Leads
    And I create a new Lead
    Then I should see the lead in the page


  #@leads2
  #Scenario Outline: Create leads
    #When I click on Leads
    #And I create a new Lead
      #| firstName   | lastName   |
      #| <firstname> | <lastname> |
    #Then I should see the Lead information for "<firstname> <lastname>"
#
    #Examples: 
      #| firstName | lastName |
      #| Admiral   | Kunkka   |
      #| John      | Smith    |
