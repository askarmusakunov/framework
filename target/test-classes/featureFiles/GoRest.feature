Feature: Create User

  @smoke
  Scenario: New user should be able to be created
    #Given steps wordings should always be in past tense
    Given the following headers are set
      | accept | contentType |
      | JSON   | JSON        |
    And the following user info is set in body
      | first_name | last_name | email              | status | gender |
      | Alan       | McMillan  | Alan.Maked@kcc.com | active | male   |
    When the post request is sent to create the user
    Then the response status should be "302"
    And the following should be the response
      | id | first_name | last_name | gender | email           |
      | 1  | Alan       | McMillan  | male   | Alan.Mc@kcc.com |


  Scenario: noToken get request should return no info
    Given the following headers are set
      | accept |
      | JSON   |
    When the all users are requested
    And the response status should be "200"
    Then the following should be the response of get
      | metaMessage            | success |
      | Authentication failed. | false   |


  Scenario: user should be able to get info with specific ID
    Given the following headers are set
      | accept | contentType |
      | JSON   | JSON        |
    When the user with id "24" is requested
    Then the response status should be "200"
    And the following users should be in the response
      | id | first_name | last_name | gender |
      | 18 | Alyson     | Goldner   | female |
      | 19 | Stephen    | Prohaska  | male   |
      | 20 | Urban      | O'Hara    | male   |






