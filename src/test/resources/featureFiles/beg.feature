Feature: Log in to gmail.com
  Scenario: Able to login with valid credentials
    Given open url
    When enter a <username >and <password>
    |ailin |   karlos |
    Then  click sign in
