Feature: Check Homepage Functionality
  Background: user is logged in
    Given user is on the login page
    When username enters the username and password
    And clicks on the login button
    Then the user is navigated to homepage

  Scenario: check logout link
    When user clicks on welcome link
    Then logout link is displayed

  Scenario: Verify if quick launch toolbar is present

    When user clicks on dashboard link
    Then quick launch toolbar is displayed
