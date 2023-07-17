Feature:Login functionality

Scenario Outline:Login with valid credentials
Given User navigated to login page
When User enters valid email address <username> into email field
And User has entered valid password <password> into password field
And User clicks on Login button
Then User should get successfully logged in

Examples:
|username              | password|
|amotooricap3@gmail.com|12345|
|amotooricap3@gmail.com|12345|
|amotooricap3@gmail.com|12345|

Scenario:Login with invalid credentials
Given User navigated to login page
When User enters invalid email address into email field
And User has entered invalid password "12345678" into password field
And User clicks on Login button
Then User should get a proper warning message about credentials mismatch 

Scenario:Login with valid email and invalid password
Given User navigated to login page
When User enters valid email address "gopalakkatangerhal1993@gmail.com" into email field
And User has entered invalid password "12345678" into password field
And User clicks on Login button
Then  User should get a proper warning message about credentials mismatch 

Scenario:Login with invalid email and valid password
Given User navigated to login page
When User enters invalid email address into email field
And User has entered valid password "123456" into password field
And User clicks on Login button
Then  User should get a proper warning message about credentials mismatch 

Scenario: Login without providing any credentials
Given User navigated to login page
When User donot enter email address into email field
And User donot enter password into password field 
And User clicks on Login button
Then  User should get a proper warning message about credentials mismatch 


