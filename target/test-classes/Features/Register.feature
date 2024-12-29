Feature: Check Register functionility

Scenario: Register with all manditory fields
Given Navigate to Register page
When User provides all the below fields
|FirstName|sai|
|LastName|Kumar|
|Phone|1234567890|
|Password|12345|
And User click on privacy policy check box
Then user click on continue button 
And User account should get created

