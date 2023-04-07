Feature: Test Login Fuction

  Scenario Outline: Check login is Successful with the valid credentials
    Given edge browser is open
    And User is on login page
    When user enters <username> and <password>
    And User click on login button
    Then user is navigated to the home page

    Examples:
    |username|password|
    |Dhananjai |12345   |
    |Kumar     |987654  |

