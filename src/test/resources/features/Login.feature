Feature: Login feature

  @Smoke
  Scenario: Verify user is able to login with valid credentials
    Given user enter valid "valid.username" and "valid.password"
    When user clicks on Sign In button
    Then verify user is successfully logged in to the account