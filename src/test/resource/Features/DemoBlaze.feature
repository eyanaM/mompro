Feature: This feature will cover all Log in page Creation features



Scenario: Verify login link is displayed in home page
Given launch application <"URL">
Then Verify Login link is displayed in home page



Scenario: Verify login page is displayed
Given launch application <"URL">
Then 	Click Login Link
Then Verify Login page is displayed


Scenario: Verify login text is displayed
Given launch application <"URL">
Then Click Login Link
Then Verify login text is displayed


Scenario: Verify username field is displayed
Given launch application <"URL">
Then Click Login Link
Then Verify username field is displayed


Scenario: Verify password field is displayed
Given launch application <"URL">
Then Click Login Link
Then Verify password field is displayed


Scenario: Verify login button is displayed
Given launch application <"URL">
Then Click Login Link
Then Verify login button is displayed



Scenario: Verify close button is displayed
Given launch application <"URL">
Then Click Login Link
Then Verify close button is displayed


Scenario: Verify login page closes
Given launch application <"URL">
Then Click Login Link
Then Click Close button
Then Verify login page closes



Scenario: Verify user can login
 Given launch application <"URL">
 Then Click Login Link
 Then user can input credentials <"username"> <"password">
 Then Click Login button
 Then Verify user can login





Scenario: Verify user redirected to login page if blank credentials
Given launch application <"URL">
Then Click Login Link
Then Click Login button
Then Handle PopUp
Then Verify user redirected to login page


Scenario: Verify user redirected to login page if invalid username 
Given launch application <"URL">
Then Click Login Link
Then user input credentialsU <"Invalid Username"> <"password">
Then Click Login button
Then Handle PopUp
Then Verify user redirected to login page



Scenario: Verify user redirected to login page if invalid password
Given launch application <"URL">
Then Click Login Link
Then user input credentialsp <"Invalid Username"> <"password">
Then Click Login button
Then Handle PopUp
Then Verify user redirected to login page

@test
Scenario: Verify user can logout
Given launch application <"URL">
Then Click Login Link
Then user can input credentials <"username"> <"password">
Then Click Login button
Then Click Logout
Then Verify user can logout


