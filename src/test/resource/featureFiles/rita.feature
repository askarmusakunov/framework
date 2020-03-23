Feature: user should be able review the resume in the website

Backround: <Dice> website up and running

@searchResumeOnDice

Scenario: user should search resumes in the website
Given user should type <SDET> in the searchBox
And user types <Location> in the inputBar
When user click searchBotton
Then user sees result list 



