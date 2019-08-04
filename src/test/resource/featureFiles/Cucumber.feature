Feature: user should be able to post Title and post in IDS

  Background :Website up and running

  @First
  Scenario: user should post new Title in IDS website
    Given User login in to the website
    When user clicks visit site icon
    Then homepage should appear
