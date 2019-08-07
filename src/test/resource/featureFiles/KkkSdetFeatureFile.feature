Feature: user should be able to get the job

Background: WebPage is up and running

@FindJob
Scenario: user should be able to register on WebPage
Given user on HomePage
When user enters valid credentials
Then user should be registered

