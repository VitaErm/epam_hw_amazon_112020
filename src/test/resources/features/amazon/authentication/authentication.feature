Feature: Authentication

  Scenario: Successful login with valid credentials
    Given I am on Amazon Homepage
    And I choose to login
    When I fill in Email with "name@domain.com"
    And I click on continue
    And I fill in Password with "pwd"
    And I press sign in
    Then I should be greeted with "Hello, Vita" on Amazon homepage
