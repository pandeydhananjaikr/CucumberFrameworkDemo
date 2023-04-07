Feature: Check Login Functionality
  @smoke
  Scenario: 1
    Given if the user is on the login page
    When the user enters valid username and password
    And click on the Login button
    Then the user will be navigated to homepage

  Scenario: 2
    Given if the user is on the login page
    When the user enters valid username and password
    And click on the Login button
    Then the user will be navigated to homepage