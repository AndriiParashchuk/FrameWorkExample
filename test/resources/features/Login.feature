Feature: Login feature

  Scenario: Verify user is able to login with valid credentials
    Given user enter valid username and password
    When user clicks on Sign In button
    Then verify user is successfully logged in to the account