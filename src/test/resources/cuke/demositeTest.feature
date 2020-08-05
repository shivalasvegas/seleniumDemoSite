Feature: demositeTest
	Scenario: Create a user login and login
		Given we can open demosite
		When we create a user
		Then demosite will take us to the login page