Feature: Search for item
  Scenario: Search for "iphone 12"
    Given I am on Amazon Homepage for search
    When I fill in Search Field "iphone 12"
    Then I see items with name "iphone 12"