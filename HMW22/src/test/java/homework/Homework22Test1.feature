Feature: Booking hotels in Moscow 
@start
Scenario: Check number of hotels for some dates 
	Given I am on page with url "https://www.booking.com"
	When I enter the city 
	And I check numbers of room and people 
	And I click on find button 
	And I choose the date on calendar 
	Then I check if there are hotels 

      