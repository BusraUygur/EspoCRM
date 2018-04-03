
Feature: Create accounts

  @account
  Scenario: Creating account
    Given I logged into EspoCRM
    And I clicked on create account
    When I provide accounts details
    And I save account
    Then I should see account details on Accounts page

  #@tag2
  #Scenario Outline: Creating account
    #Given I logged into EspoCRM
    #When I save a new account:
      #| firstName   | lastName   | email   | phone         | typeOfCustomer   | industry   |
      #| <firstname> | <lastname> | <email> | <officePhone> | <typeOfCustomer> | <industry> |
    #Then I should see account information for "<firstname> <lastname>"
#
    #Examples: 
      #| firstname | lastname | email               | officephone | typeOfCustomer | industry  |
      #| Joe       | Smith    | jSmith@espocrm.com  |  7031234567 | Parter         | Banking   |
      #| Haley     | Hadley   | hhadley@espocrm.com |  7032234588 | Invester       | Education |
      #| Michael   | Jordan   | mjordan@espocrm.com |  7033236666 | Reseller       | Sports    |
