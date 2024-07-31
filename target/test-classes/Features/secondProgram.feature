
Feature: Application Login

Background:
When launch the browser from config variables 
Then hit the home page url of banking site
#//@Before ->Background ->Scenario ->@After

@RegressionTest @NetBanking
Scenario: Admin page Default login

Given User is on Netbanking Landing Page
When  User login into application with "admin" and password "1234"
Then Home Page is Displyed
And Cards are displyed 

@RegressionTest @NetBanking
Scenario: User page Default login

Given User is on Netbanking Landing Page
When  User login into application with user and password 0953
Then Home Page is Displyed
And Cards are displyed 

@smokeTest @RegressionTest @Mortgage
Scenario Outline: Mortgage User page Default login

Given User is on Netbanking Landing Page
When  User login into application with "<Username>" and password "<Password>" 
Then Home Page is Displyed
And Cards are displyed 

Examples:
| Username | Password |
|debituser | hello12  | 
|credituser| lpo213   |

