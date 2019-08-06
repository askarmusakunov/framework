@youtube
  Feature: Youtube search
    Background: User is on the homepage and is able to see searchBox and search button

      Scenario: Testing Youtube Search
        Given User is on the youtube homepage
        And User is able to see the search box and search button
        When User searches for cat videos
        Then User should see results related ro cat videos