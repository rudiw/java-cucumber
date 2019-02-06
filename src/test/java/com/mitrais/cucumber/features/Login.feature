Feature: Application Login

Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "rudi" and "123"
Then Home page is populated
And Cards displayed are "true"

Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "john" and "456"
Then Home page is populated
And Cards displayed are "false"

