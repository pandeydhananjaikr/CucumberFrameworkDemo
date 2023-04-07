Feature: Test the login page
  Scenario Outline: check if the login is successful with the credentials
    Given the user is on the login page
    When user entered <username> and <password>
    And user clicks the login button
    Then the user is taken to the homepage

    Examples:
      |username|password|
      |admin   |12345|
      |ADMIN   |12345|




