Feature: Application Login

#1
@SimpleLogin
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "luffy" and "789"
Then Home page is populated
And Cards displayed are "true"

