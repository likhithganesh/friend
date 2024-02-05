Scenario: Successful Login with Valid entries
Given user navigates to the website javatpoint.com 
When User Navigate to Login Page
And user logs in through Login Window by using <Username> as "username1"
And <Password> as "password1"
Then login must be successful.