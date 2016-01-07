Feature: Login Action

Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User enters UserName and Password
	Then User successfully logged in and FlightFinder page is displayed
	
Scenario: Successful LogOut
	When User LogOut from the Application
	Then Message displayed LogOut Successfully