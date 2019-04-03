Feature: Booking hotels in Moscow 
@start 
Scenario: Put letter in spam 
	Given I am on page with url "http://mail.ru" 
	When I enter login and pass 
	And I press enter Button 
	And I choose letter 
	And I put letter in spam 
	Then I check if popup appers 
@start 
Scenario: Take out letter from spam 
	Given I am on page with url "http://mail.ru" 
	When I enter login and pass 
	And I press enter Button 
	And I choose letter 
	And I put letter in spam 
	And I click spam tab 
	And I choose letter 
	And I take out letter from spam 
	Then I check if popup appers 
	
@start 
Scenario: Send multilletter 
	Given I am on page with url "http://mail.ru" 
	When I enter login and pass 
	And I press enter Button 
	And I tap on new letter 
	And I enter mail for letter 
	And I tap send button 
	And I tap confirm button 
	Then I check if confirm popup appears 
@start 
Scenario: Set three flag s 
	Given I am on page with url "http://mail.ru" 
	When I enter login and pass 
	And I press enter Button 
	And I choose three letters 
	And I tap on more drop tab 
	And I tap on drop tab flag 
	Then I check if three flags appears 
@start 
Scenario: Drop three flags 
	Given I am on page with url "http://mail.ru" 
	When I enter login and pass 
	And I press enter Button 
	And I pick all letters 
	And I tap on more drop tab 
	And I tap skip button 
	Then I check if popup appears 
@start 
Scenario: Exit my account 
	Given I am on page with url "http://mail.ru" 
	When I enter login and pass 
	And I press enter Button 
	And I tap exit button 
	Then I check that login page opens 
@start 
Scenario: Search google 
	Given I am on page with url "http://mail.ru" 
	When I enter "ueuek" in search tab 
	And I press search button 
	Then I check that google appears in results 
	
@start 
Scenario: Search flags 
	Given I am on page with url "http://mail.ru" 
	When I enter login and pass 
	And I press enter Button 
	And I tap flag tab 
	Then I check if any latters there 
	
	
	
	
	
	
	
	