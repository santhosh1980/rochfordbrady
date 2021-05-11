Feature: Login functionality of Application
Scenario: Valid login test
Given Open the Chrome and launch the application
When Enter Invalid Username and Password
And Click Login button
Then User not successfully logged in
