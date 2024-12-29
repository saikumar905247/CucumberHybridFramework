Feature: Checking Login functionility

Scenario: Login with valid details
Given Open the application
When User provides username "firstlast234@gmail.com"
And User provides password "12345"
Then Click on login button
And Verify successfully login

Scenario: Login with valid mail and invalid password
Given Open the application
When User provides username "firstlast234@gmail.com"
And User provides password "1234"
Then Click on login button
And Verify validation message

Scenario: Login with invalid mail and valid password
Given Open the application
When User provides username "firstlast@gmail.com"
And User provides password "12345"
Then Click on login button
And Verify validation message

Scenario: Login with empty mail and valid password
Given Open the application
When User provides username ""
And User provides password "12345"
Then Click on login button
And Verify validation message

Scenario: Login with valid mail and empty password
Given Open the application
When User provides username "firstlast234@gmail.com"
And User provides password ""
Then Click on login button
And Verify validation message
