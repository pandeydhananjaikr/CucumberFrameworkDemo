Feature: feature to test google search functionality
  @abc
  Scenario: Validate google search is working
    Given browser is open
    And user is on the google search page
    When user enters a text in search box
    And hits enter
    Then user is navigated to search results

  @bcd
  Scenario: aaa
    Given bbb
    And ccc