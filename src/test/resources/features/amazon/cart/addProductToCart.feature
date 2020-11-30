Feature: Cart

  Scenario: I can add  product to cart
    Given I am on page with Monopoly Game
    When I click on button Add to Cart
    Then I see status cart "Added to Cart"

