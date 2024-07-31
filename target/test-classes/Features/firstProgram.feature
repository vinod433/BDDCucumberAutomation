
Feature: Application Login

Background:
Given setup entries in database
When launch the browser from config variables 
Then hit the home page url of banking site

@RegressionTest
Scenario: Admin page Default login

Given User is on Netbanking Landing Page
When  User login into application with "admin" and password "1234"
Then Home Page is Displyed
And Cards are displyed 

@MobileTest
Scenario: User page Default login

Given User is on Netbanking Landing Page
When  User login into application with user and password 0953
Then Home Page is Displyed
And Cards are displyed 

@smokeTest @RegressionTest
Scenario Outline: Mortgage User page Default login

Given User is on Netbanking Landing Page
When  User login into application with "<Username>" and password "<Password>" 
Then Home Page is Displyed
And Cards are displyed 

Examples:
| Username | Password |
|debituser | hello12  | 
|credituser| lpo213   |

@smokeTest
Scenario: User page Default Sign up

Given User is on Practice landing Page
When  User Signup into application
|rahul|
|shetty|
|contact@email.com|
|1234567|
Then Home Page is Displyed
And Cards are displyed