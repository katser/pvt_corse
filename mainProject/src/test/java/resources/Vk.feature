Feature: Booking hotels in Moscow 
@start 
Scenario: Test post on the wall 
	When I post message 
	Then I see post on wall 
	
@start 
Scenario: Delete post from wall 
	When I delete post 
	Then I cant see my post 
	
	
	
      