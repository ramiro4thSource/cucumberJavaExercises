@Signup
Feature: 
 As new user I want to have my account on the website

@Signup-simple
Scenario: I want to create a new account
Given I am a user on the landing page
When I decide to create an account
And I provide my info correctly as follows
| firstName | lastName| country|    email    |  password | adress             | phone       | city   | province | zipCode|  userName |
| Fernando  | Montreal| YEMEN  | fer@fake.com| holaMundo | calle siempre viva | 9995-09-09  | Bororo | shing    | 98000  |  pedrito  |
And I submit the form
Then I should get at http://newtours.demoaut.com/create_account_success.php
 #Then I should get at http://newtours.demoaut.com/create_account.php
	