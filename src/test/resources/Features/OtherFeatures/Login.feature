  Feature: feature to test login functionality
    Scenario: Check login is successful with valid credentials
      Given user is on login page
      When user enters username and password
      And clicks on Login button
      Then user is navigated to homepage

#  Scenario Outline: Check login is successful with valid credentials
#    Given user is on login page
#    When user enters <username> and <password>
#    And clicks on Login button
#    Then user is navigated to homepage
#
#    Examples:
#      | username | password |
#      | Admin    | admin123 |
#
