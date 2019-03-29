Feature: Booking hotels in Moscow 

 
Scenario: Check the rating of best hotel 
	Given I am on page with url "https://www.booking.com"
	When I enter the city 
	And I check numbers of room and people 
	And I click on find button 
	And I sorted hotels by rating 
	And I open the first hotel 
	Then I check rate of hotel 
      