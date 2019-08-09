Feature: Create User


  Scenario: New user should be able to be created
    #Given steps wordings should always be in past tense
    Given the following headers are set
      | accept | contentType |
      | JSON1  | JSON2       |
      | XML1   | XML2        |
    And the following user info is set in body
      | first_name | last_name | email           | status | gender |
      | Alan       | McMillan  | Alan.Mc@kcc.com | active | male   |
    When the post request is sent to create the user
    Then the response status is "201"
    And the following is the response
      | id | first_name | last_name | gender | email           |
      | 1  | Alan       | McMillan  | male   | Alan.Mc@kcc.com |






