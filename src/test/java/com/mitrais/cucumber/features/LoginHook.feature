Feature: Application Login

#no background!

#--SCENARIOS--
#1
@SimpleLoginInWeb
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "rudi" and "123"
Then Home page is populated
And Cards displayed are "true"

#2
@SimpleLoginInWeb
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "john" and "456"
Then Home page is populated
And Cards displayed are "false"

#3
@SignUp
Scenario: Home page default login
Given User is on NetBanking landing page
When User sign up with following details
| rudi | password | rudi.wijaya@mitrais.com | Indonesia | 087727909189 |
Then Home page is populated
And Cards displayed are "false"

#4
@MultipleLogin
Scenario Outline: Home page default login
Given User is on NetBanking landing page
When Users login into application with <username> and <password>
Then Home page is populated
And Cards displayed are "true"

Examples:
| username | password |
| user1 | password1 |
| user2 | password2 |
| user3 | password3 |
| user4 | password4 |
| user5 | password5 |

#5
@SimpleLoginInMobile
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "mobile_user1" and "111"
Then Home page is populated
And Cards displayed are "false"

#6
@SimpleLoginInMobile
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "mobile_user2" and "222"
Then Home page is populated
And Cards displayed are "false"
