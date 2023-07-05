Feature: Login Functionality 

Scenario: CHeck login with valid credentials 

	Given user is on the login page 
	When user enters the username and password 
	And clicks on the login button 
	Then user is navigated to the home page 
	

Scenario: CHeck login with invalid credentials 

	Given user is on the login page 
	When user enters the invalid username and password 
	And clicks on the login button 
	Then error message is displayed - Invalid Credentials 
