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
    Then the following should be the response
      | message                | success |
      | Authentication failed. | false   |
    And the response status should be "401"


  Scenario: user should be able to get info with specific ID
    Given the following headers are set
      | accept | contentType |
      | JSON1  | JSON2       |
    When the user with id "24" is requested
    Then the response status should be "200"
    And the following should be the response
      | id | first_name | last_name  | gender |
      | 15 | arun       | Wilderman  | male   |
      | 16 | Tommy      | Nitzsche   | male   |
      | 17 | Jacky      | Keebler    | female |
      | 18 | Augustus   | Jerde      | male   |
      | 19 | Velma      | Roberts    | female |
      | 20 | Jill       | Hauck      | female |
      | 21 | Rosamond   | Murazik    | female |
      | 22 | Della      | Pagac      | female |
      | 23 | Tanya      | Barton     | female |
      | 24 | Darien     | Smitham    | male   |
      | 25 | Watson     | O'Reilly   | male   |
      | 26 | Johnnie    | Emard      | male   |
      | 27 | Howell     | mayer      | male   |
      | 28 | Winona     | Schimmel   | female |
      | 29 | Elliot     | Bins       | male   |
      | 30 | Dovie      | Carroll    | female |
      | 31 | Skylar     | Schowalter | male   |
      | 32 | Enrique    | Abbott     | male   |
      | 33 | Frieda     | Grady      | female |
      | 34 | Joan       | Wiegand    | male   |



