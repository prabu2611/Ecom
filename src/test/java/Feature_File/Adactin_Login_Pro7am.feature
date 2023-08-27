Feature: Adactin Web Page Scenarios

@positive @test
Scenario: Test Adactin Login Page

When User gives adactin username as "prabu2611"
And User gives adactin password as "chenu@123"
Then User sumbit the login button


@InvalidUsername
Scenario: Test Adactin Login Page

When User gives adactin username as "prabu2jsklh"
And User gives adactin password as "chenu@123"
Then User sumbit the login button

@InvalidPassword
Scenario: Test Adactin Login Page

When User gives adactin username as "prabu2611"
And User gives adactin password as "nkslkglksahl"
Then User sumbit the login button

@Negative @test
Scenario: Test Adactin Login Page

When User gives adactin username as "prargrsgrhbu2611"
And User gives adactin password as "chenrhrhrhu@123"
Then User sumbit the login button