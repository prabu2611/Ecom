
Feature: Project X Functionality
@Positive
Scenario: Test Login page with Valid Credential
Given You are enter the Login Page
When You give the correct username as "prabu2611"
When You give the correct password as "chenu@123"
Then You enter the valid login details

@Negative
Scenario: Test Login page with inValid Credential
Given You are enter the Login Page
When You give the incorrect username as "lkfhliehf"
When You give the incorrect password as "sbfkwhef"
Then You enter the invalid login details