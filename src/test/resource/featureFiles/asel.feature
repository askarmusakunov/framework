Feature: user should be able to find  the technical interview questions from the link

	Background: WebPage is up and running
	
		@TechnicalQuestions
	Scenario: user should be able to download the questions
		Given: user is logged in 
		When: user clicks the download button
		Then: user see the downloading icon on the bottom right corner of the screen
