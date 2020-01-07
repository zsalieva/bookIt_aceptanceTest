@login
Feature: Home page
  As a Team lead when I enter the correct login information
  I should be able to login
  Background: Given user is on login page
  # if we want to use common step to all scenarios use BACKROUND :

@lead
Scenario: Login as Team lead
  When user logs in as Team lead
  Then homepage should be displayed
  And the title should be correct

@member
Scenario: Login as a Team member
  When user logs in as team member
  Then homepage should be displayed

@teacher
Scenario: Login as a Teacher
  When user logs in as teacher
  Then homepage should be displayed